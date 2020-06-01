# mybatis-template
修改CodeGenerator类的数据库信息<br>
修改ProjectConstant类中包名称<br>
修改CodeGenerator类中TEMPLATE_FILE_PATH属性（模板存放位置）<br>
#报错信息
Consider defining a bean of type 'com.lys.mybatis.mapper.StudentMapper' in your configuration.
<br>在启动类上加上@ComponentScan注解 扫描mapper文件夹