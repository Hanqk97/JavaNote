# 卸载JDK

1. 删除JAVA的安装目录

2. 电脑，属性，高级系统设置，环境变量，删除JAVA_HOME

3. 删除PATH下的JAVA_HOME
4. cmd输入java-version检验

# 安装JDK

1. 按照安装包说明完成安装

2. 电脑，属性，高级系统设置，环境变量，系统变量，新建，名：JAVA_HOME,地址：JDK路径.

3. 配置PATH变量，新建，输入：%JAVA_HOME%\bin(即引用路径);同方法再添加：%JAVA_HOME%\jre\bin

4. 在cmd中输入下列命令检查：java -version

   

