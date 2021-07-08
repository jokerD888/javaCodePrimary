public class DataType1
{
	public static void main(String[] args)
	{

		//char
		char c1='a';
		char c2='\t';
		char c3='王';
		char c4=97; 	//字符型变量可以直接存放一个数字
		char c5='W';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);			//当输出c4是会输出编码 97 所表示的字符
		System.out.println(c5);


		//boolean 布尔类型 true false
		//相比于c语言，这里不可以用0或非0的整数代表false或true
		boolean isPass = true;
		if(isPass == true){
			System.out.println("通过！");
		}else{
			System.out.println("没有通过！");	
		}




		//基本数据类型自动转换，低精度向高精度转换
		//char--int--long--flaot--double
		//byte--short--int--long--flaot--double
		//有多种类型的数据混合运算时，系统自动将所有数据转换成其中精度最高的类型，再进行运算
		//可以把精度小的数据类型赋值给精度大的类型，反之将会因精度丢失而报错
		//如 int num='a'		double=80	都是可行的
		//但 char c=10 		int num=80.8 则会精度丢失报错
		int n1 = 10;
		//float n2 = n1 + 1.1 		报错，1.1默认为double型，最后表达式的右边结果时double型
		float n3 = n1+1.1F;		//可以正常执行，最后表达式的右边结果时float型
		//且 byte 和char之间无法自动转换，short 和char之间无法自动转换
		//当把数赋值给byte时，编译器先判断该数是否在byte范围内，如果是就可以赋值，与一个整型默认int赋值给其他类型略有不同
		byte b1 = 10;
		int num1 = 1;
		//byte num2 = num1;	//错误，n2是int型
		//
		//byte ,short ,char 三者间可以进行运算(不管单独还是混合），计算时首先转化为int
		//
		//boolean类型不参与自动转换
	}
	
}