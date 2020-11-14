package com.sharpnew.test.freemarker.test.freemarker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sharpnew.test.freemarker.model.Student;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.List;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-23 10:02
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class FreemarkerTest {
  String classPath = this.getClass().getResource("/").getPath();
  String templateFile = "test1.ftlh";
  String templatesDir = classPath + "/templates/";
  String outFilePath = "d:/test1.txt";

  @Test
  public void testGenerateHtml() {
    //开启一个线程
    Thread thread = new Thread(() -> {
      //获取classPath的路径
      //定义数据模型
      Map sourceMap = getMap();


    });
    thread.start();
  }

  @Test
  public void testGenerateText() throws IOException, TemplateException {
    String classPath = this.getClass().getResource("/").getPath();
    //定义数据模型
    Map sourceMap = getMap();

    String templatesDir = classPath + "/templates/";

    String outFilePath = "d:/test1.txt";
    generateFile(templatesDir, templateFile, sourceMap, outFilePath);
  }

  @Test
  public void ReadGenerateText() throws IOException {
    readFileContent(outFilePath);
  }

  /**
   * 生成文件
   */
  private void generateFile(String templatesDir, String templateFile, Map sourceMap, String outFilePath) throws IOException, TemplateException {
    //定义配置类
    Configuration configuration = new Configuration(Configuration.getVersion());
    //定义模板路径
    configuration.setDirectoryForTemplateLoading(new File(templatesDir));
    //获取模板文件内容
    Template template = configuration.getTemplate(templateFile);
    //静态化
    String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, sourceMap);
    InputStream inputStream = IOUtils.toInputStream(content, Charset.defaultCharset());
    FileOutputStream outputStream = new FileOutputStream(new File(outFilePath));
    //输出文件
    IOUtils.copy(inputStream, outputStream);
    inputStream.close();
    outputStream.close();
  }

  /**
   * 读取文件
   */
  private void readFileContent(String fileName) throws IOException {
    //获取文件
    File file = new File(fileName);
    if (file.isFile() && file.exists()) {
      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
      BufferedReader br = new BufferedReader(isr);
      String lineTxt;
      JSONObject content = new JSONObject();
      Integer lineCount = 0;

      while ((lineTxt = br.readLine()) != null) {
        if (StringUtils.isNotBlank(lineTxt)) {
          content.put(lineCount.toString(), lineTxt);
          lineCount++;
        }
      }
      br.close();
      //输出文件内容
      String sourceJson = JSON.toJSONString(content);
      System.out.println(sourceJson);
      //最后更新时间
      Long lastModified = file.lastModified();
      //输出文件时间
      Date date = new Date(lastModified);
      System.out.println(date);

    } else {
      System.out.println("文件不存在!");
    }
  }

  private Map getMap() {
    Map map = new HashMap();
    //向数据模型放数据
    map.put("name", "程序猿");
    Student stu1 = new Student();
    stu1.setName("小明");
    stu1.setAge(18);
    stu1.setMoney(1000.86f);
    stu1.setBirthday(new Date());

    Student stu2 = new Student();
    stu2.setName("小红");
    stu2.setMoney(200.1f);
    stu2.setAge(19);

//  stu2.setBirthday(new Date());
    List<Student> friends = new ArrayList<>();
    friends.add(stu1);
    stu2.setFriends(friends);//添加朋友们
    stu2.setBestFriend(stu1);//小红最好的朋友是小明

    List<Student> stus = new ArrayList<>();
    stus.add(stu1);
    stus.add(stu2);

    //向数据模型放数据
    map.put("stus", stus);
    //准备map数据
    HashMap<String, Student> stuMap = new HashMap<>();
    stuMap.put("stu1", stu1);
    stuMap.put("stu2", stu2);
    //向数据模型放数据
    map.put("stu1", stu1);
    //向数据模型放数据
    map.put("stuMap", stuMap);
    //返回模板文件名称

    return map;
  }
}
