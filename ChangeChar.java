//转义字符的使用
public class ChangeChar
{
	public static void main(String[] args)
	{
		// \t制表位，对齐
		System.out.println("北京\t上海\t广州\t深圳");
		// \n换行
		System.out.println("北京\n上海\n广州\n深圳");
		// \\一个\   \\\\两个\\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		// \' 或\"   表示 ' 或''
		System.out.println("他说:\"要好好学习\"");
		System.out.println("他说:\'要好好学习\'");

		// \r:一个回车,输出光标直接从头开始,往后覆盖
		System.out.println("12345\r67");
		

		//练习
		System.out.println("书名\t作者\t价格\t销量");
		System.out.println("三国\t罗贯中\t120\t1000");
		//或
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

		
		
	}
}