public class LogicOperator
{
	public static void main(String[] args){

		//&& �� &	�ܱ�ʾʽ�����һ��
		//���𣺶�· && ��߱��ʽΪfalse,�ұߵĽ�����ִ�У�Ч�ʽϸ�
		//		�߼� & ��߱��ʽΪfalse,�ұߵ�Ҳ��ִ�У�Ч�ʵ�,����һ��ʹ�ö�·��
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

		// || �� | ����������
		// 
		

		//���ϸ�ֵ��������������ת��
		byte b = 3;
		b += 2;		//�ȼ� b = (byte)(b+2);
		//b = b + 2;  ��2Ĭ��int���ᱨ��

	}

}