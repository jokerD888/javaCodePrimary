public class DataType1
{
	public static void main(String[] args)
	{

		//char
		char c1='a';
		char c2='\t';
		char c3='��';
		char c4=97; 	//�ַ��ͱ�������ֱ�Ӵ��һ������
		char c5='W';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);			//�����c4�ǻ�������� 97 ����ʾ���ַ�
		System.out.println(c5);


		//boolean �������� true false
		//�����c���ԣ����ﲻ������0���0����������false��true
		boolean isPass = true;
		if(isPass == true){
			System.out.println("ͨ����");
		}else{
			System.out.println("û��ͨ����");	
		}




		//�������������Զ�ת�����;�����߾���ת��
		//char--int--long--flaot--double
		//byte--short--int--long--flaot--double
		//�ж������͵����ݻ������ʱ��ϵͳ�Զ�����������ת�������о�����ߵ����ͣ��ٽ�������
		//���԰Ѿ���С���������͸�ֵ�����ȴ�����ͣ���֮�����򾫶ȶ�ʧ������
		//�� int num='a'		double=80	���ǿ��е�
		//�� char c=10 		int num=80.8 ��ᾫ�ȶ�ʧ����
		int n1 = 10;
		//float n2 = n1 + 1.1 		����1.1Ĭ��Ϊdouble�ͣ������ʽ���ұ߽��ʱdouble��
		float n3 = n1+1.1F;		//��������ִ�У������ʽ���ұ߽��ʱfloat��
		//�� byte ��char֮���޷��Զ�ת����short ��char֮���޷��Զ�ת��
		//��������ֵ��byteʱ�����������жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ��Ը�ֵ����һ������Ĭ��int��ֵ�������������в�ͬ
		byte b1 = 10;
		int num1 = 1;
		//byte num2 = num1;	//����n2��int��
		//
		//byte ,short ,char ���߼���Խ�������(���ܵ������ǻ�ϣ�������ʱ����ת��Ϊint
		//
		//boolean���Ͳ������Զ�ת��
	}
	
}