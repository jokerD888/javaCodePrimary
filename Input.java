
import java.util.Scanner;	//表示把java.util下的scanner类导入，Scanner类是一个简单文本扫描器，在java.util包
public class Input
{

	public static void main(String[] args){
		//接受用户的输入
		//1.引入(导入)Scanner类所在的包
		//2.创建Scanner对象,new 就是创建的意思
		// 	myScanner 就是 Scanner类的对象
		Scanner myScanner = new Scanner(System.in);
		//3.接受用户输入 ,使用相关的方法
		System.out.println("请输入名字：");
		String name = myScanner.next();		//接受用户输入

		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();		//接受用户输入

		System.out.println("请输入薪水：");
		double sal = myScanner.nextDouble();		//接受用户输入
		
		System.out.println("信息如下：");
		System.out.println("名字:" + name + '\n' + "年龄:" + age + '\n' +"薪水" + sal);



	}
}