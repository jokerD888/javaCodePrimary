public class LogicOperator
{
	public static void main(String[] args){

		//&& 和 &	总表示式的真假一致
		//区别：短路 && 左边表达式为false,右边的将不会执行，效率较高
		//		逻辑 & 左边表达式为false,右边的也会执行，效率低,开发一般使用短路与
		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 50){
			System.out.println("haha");
		}
		System.out.println(b);

		if(a < 1 & ++b < 50){
			System.out.println("hehe");
		}
		System.out.println(b);

		// || 和 | 与上面类似
		// 
		

		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2;		//等价 b = (byte)(b+2);
		//b = b + 2;  因2默认int，会报错

	}

}