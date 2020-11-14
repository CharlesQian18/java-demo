package com.sharpnew;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @program: hellodemo
 * @author: Charles
 * @created: 2020-05-16 11:05
 **/
public class HelloApplication {
  public static void main(String[] args) {
    String url = "http://188.188.3.20:9801/zyerp/erp/zyProcessTally/list";
   // getTitle(url);
  }


  /*
   返回map值，title,content
 */
  private static Map getContent(String url, String titleText, String contentText) {
    RestTemplate restTemplate = new RestTemplate();
    //headers
    JSONObject obj = restTemplate.getForObject(url, JSONObject.class);
    String[] titles = getContent(titleText);
    if (!StringUtils.isEmpty(titles[0])) {
      String[] perfStrings = titles[0].split("\\.");
      for (String s : perfStrings) {
        String jsonStr = JSON.toJSONString(obj.get(s));
        obj = JSON.isValidArray(jsonStr) ? JSONObject.parseObject(JSON.toJSONString(JSONArray.parseArray(jsonStr).get(0))) : JSONObject.parseObject(jsonStr);
      }
    }
    //获取标题
    String title = getContent(titles[1], obj);
    //获取内容
    String content = getContent(contentText, obj);
    //返回Map值
    Map map = new HashMap();
    map.put("title", title);
    map.put("content", content);
    return map;
  }

  /*
     获取$[]里面的数据
   */
  private static String[] getContent(String title) {
    String patternStr = "\\$\\[(.*?)\\]";
    return getContent(title, patternStr, 1, null);
  }

  /*
      获取${}里面的数据
   */
  private static String getContent(String title, JSONObject obj) {
    String patternStr = "(\\$\\{)([^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$]+)(\\})";
    return getContent(title, patternStr, 2, obj)[1];
  }

  /*
      获取替换之后的数据
   */
  private static String[] getContent(String title, String patternStr, int index, JSONObject obj) {
    Pattern p = Pattern.compile(patternStr);
    Matcher m = p.matcher(title);
    StringBuffer sb = new StringBuffer();
    String group = "";
    while (m.find()) {
      //规则中${值}中包含的数据
      group = m.group(index);
      String value = obj == null ? "" : obj.getOrDefault(group, String.format("[不存在%s]", group)).toString();
      //下一步是替换并且把替换好的值放到sb中
      m.appendReplacement(sb, value);
    }
    //把符合的数据追加到sb尾
    m.appendTail(sb);
    return new String[]{group, sb.toString()};
  }
}

