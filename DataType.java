public class DataType
{
	public static void main(String[] args)
	{

		//����
		byte n1=10;   //1�ֽ�
		short n2=10;  //2�ֽ�
		int n3=10;     //4�ֽ�
		long n4=10L;    //8�ֽ�   ���ͳ���Ĭ��int ,long���ͳ��������L��l

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);


		//������(ͨ����double)
		float b1=3.14F;     //4�ֽ�		�����ͳ���Ĭ��double��float���ͳ��������F��f
		double b2=3.14; 	//8�ֽ�
		double b3=.14; 		//0��ʡ��

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);


		//��ѧ������
		System.out.println(3.14e2);//10�ļ��η���e/E�������Ϊָ����
		System.out.println(3.14E2);

		System.out.println(3.14E-2);

				
		//ͨ����double,double�����float����׼
		double num1 = 2.1234567851;
		float num2 = 2.1234567851F; 
		System.out.println(num1);
		System.out.println(num2);


		//С����
		double num3=2.7;
		double num4=8.1/3.0;		//һ���ӽ�2.7��С��
		System.out.println(num3);
		System.out.println(num4);
		//��Ҫ������������������бȽϣ���Ӧ���������Ĳ�ľ���ֵ��ĳ�����ȷ�Χ�ڽ����ж�
		System.out.println(Math.abs(num3-num4));
		if(num3==num4)
			System.out.println("���");
		if(Math.abs(num3-num4)<1e-10)
			System.out.println("�������");

		










	}
}