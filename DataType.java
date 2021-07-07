public class DataType
{
	public static void main(String[] args)
	{

		//整型
		byte n1=10;   //1字节
		short n2=10;  //2字节
		int n3=10;     //4字节
		long n4=10L;    //8字节   整型常量默认int ,long类型常量后需加L或l

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);


		//浮点型(通常用double)
		float b1=3.14F;     //4字节		浮点型常量默认double，float类型常量后需加F或f
		double b2=3.14; 	//8字节
		double b3=.14; 		//0可省略

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);


		//科学计数法
		System.out.println(3.14e2);//10的几次方（e/E后面的数为指数）
		System.out.println(3.14E2);

		System.out.println(3.14E-2);

				
		//通常用double,double相比于float更精准
		double num1 = 2.1234567851;
		float num2 = 2.1234567851F; 
		System.out.println(num1);
		System.out.println(num2);


		//小陷阱
		double num3=2.7;
		double num4=8.1/3.0;		//一个接近2.7的小数
		System.out.println(num3);
		System.out.println(num4);
		//若要对两个浮点型数组进行比较，就应该用两数的差的绝对值在某个精度范围内进行判断
		System.out.println(Math.abs(num3-num4));
		if(num3==num4)
			System.out.println("相等");
		if(Math.abs(num3-num4)<1e-10)
			System.out.println("近似相等");

		










	}
}