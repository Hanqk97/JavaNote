# Helllo,World!

1. 修改一个信件文件后缀为".java"

2. 右键使用notepad++进行编辑

3. 输入下列代码

   ```java
   public class Hello{
   	public static void main(String[] args){
   		System.out.print("Hello,World!");
   	}
   }
   ```

   以此段代码为例要注意System，String的首字母大写；定义的类Hello要与文件名相同且首字母大写；不要遗漏结尾的“；”。

4. 保存并关闭，通过.java文件所在路径打开CMD

5. 在cmd中使用如下指令编译：

   ```bash
   javac Hello.java
   ```

   由此生成一个class文件。再使用如下指令运行：

   ```bash
   java Hello
   ```

