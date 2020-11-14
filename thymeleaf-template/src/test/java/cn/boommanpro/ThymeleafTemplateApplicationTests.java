package cn.boommanpro;

import cn.boommanpro.common.StringUtils;
import cn.boommanpro.config.ThymeLeafConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThymeleafTemplateApplicationTests {

  public class User {
    public String name;
    public Integer age;
    public String pass;

    User(String name,
         Integer age,
         String pass) {
      this.name = name;
      this.age = age;
      this.pass = pass;
    }
  }

  @Test
  public void contextLoads() {

  }

  @Test
  public void usrDir() {
    System.out.println(System.getProperty("user.dir"));
  }


  @Test
  public void convert() {
    String beanName = "WormHole";
    System.out.println(StringUtils.upper2LowerHump(beanName));
    System.out.println(StringUtils.upper2UpperUnderLine(beanName));
    System.out.println(StringUtils.upper2LowerMidLine(beanName));
  }

  @Test
  public void mkdirs() {

    String outPath = System.getProperty("user.dir") + "generator\\";

    String referencePackage = "cn.boommanpro";

    String filePath = outPath + referencePackage.replaceAll("\\.", "\\\\");


    File file = new File(filePath);
    boolean result = file.mkdirs();
    System.out.println(result);
  }


  @Test
  public void thymeleafGeneratorTest() throws IOException {

    //输出的目录

    String outPath = "D:\\thymeleaf-template\\generator\\";

    String suffix = ".java";

    Context context = new Context();


    //修改 core和 referencePackage即可


    String core = "Account";
    String referencePackage = "cn.boommanpro.module.account" + ".config";

    boolean firstDb = true;

    String humpCore = StringUtils.upper2LowerHump(core);
    String upperCore = StringUtils.upper2UpperUnderLine(core);
    String midLineName = StringUtils.upper2LowerMidLine(core);


    List<User> list = new ArrayList<User>();
    User user1 = new User("⼤大⽜牛", 12, "123456");
    User user2 = new User("⼩小⽜牛", 6, "123563");
    list.add(user1);
    list.add(user2);
    context.setVariable("users", list);

    context.setVariable("core", core);
    context.setVariable("humpCore", humpCore);
    context.setVariable("upperCore", upperCore);
    context.setVariable("midLineName", midLineName);
    context.setVariable("referencePackage", referencePackage);
    context.setVariable("firstDb", firstDb);

    String filePath = outPath + referencePackage.replaceAll("\\.", "\\\\") + "\\";


    //配置1.DataSourceConfig

    String dataSourceConfig = "DataSourceConfig";

    String generatorDataSourceConfigFileName = core + dataSourceConfig;


    //配置2.DataSourceConfiguration


    String dataSourceConfiguration = "DataSourceConfiguration";

    String generatorDataSourceConfigurationFileName = core + dataSourceConfiguration;
    //配置3.MybatisConfiguration


    String mybatisConfiguration = "MybatisConfiguration";

    String generatorMybatisConfigurationFileName = core + mybatisConfiguration;

    //配置4.Tx
    String tx = "Tx";

    String generatorTxFileName = tx + core;


    //配置5.yml文件

    String application = "application.yml";


    //创建文件夹


    File file = new File(filePath);
    boolean result = file.mkdirs();


    //创建文件

    createFile(filePath, generatorDataSourceConfigFileName + suffix);
    createFile(filePath, generatorDataSourceConfigurationFileName + suffix);
    createFile(filePath, generatorMybatisConfigurationFileName + suffix);
    createFile(filePath, generatorTxFileName + suffix);
    createFile(outPath, humpCore + "-" + application);


    //生成


    generator(suffix, dataSourceConfig, generatorDataSourceConfigFileName, filePath, context);

    generator(suffix, dataSourceConfiguration, generatorDataSourceConfigurationFileName, filePath, context);

    generator(suffix, mybatisConfiguration, generatorMybatisConfigurationFileName, filePath, context);

    generator(suffix, tx, generatorTxFileName, filePath, context);
    generator("", application, application, outPath, context);


  }

  private void generator(String suffix, String fileName, String generatorFileName, String generatorFilePath, Context context) throws IOException {
    Writer writer = new FileWriter(generatorFilePath + generatorFileName + suffix);
    writer.write(ThymeLeafConfig.getTemplateEngine().process("config/" + fileName + suffix, context));
    writer.close();
  }


  private void createFile(String path, String fileName) {
    File file = new File(path, fileName);
    if (!file.exists()) {

      try {
        file.createNewFile();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}
