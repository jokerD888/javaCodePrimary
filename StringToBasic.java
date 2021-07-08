public class StringToBasic{

	public static void main(String[] args){

		//基本数据类型->String
		//语法：基本类型的值 + ""
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 3.14;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);



		//String->基本数据类型
		//语法：通过基本类型的包装类调用parseXX
		String s5 = "123";
		int num1 = Integer.parseInt(s5); 
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b2 = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);



		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b2);
	

		//把字符串转换为字符的话，是取字符串的首字符
		System.out.println(s5.charAt(0));
		

	}
}