
import java.util.Scanner;	//��ʾ��java.util�µ�scanner�ർ�룬Scanner����һ�����ı�ɨ��������java.util��
public class Input
{

	public static void main(String[] args){
		//�����û�������
		//1.����(����)Scanner�����ڵİ�
		//2.����Scanner����,new ���Ǵ�������˼
		// 	myScanner ���� Scanner��Ķ���
		Scanner myScanner = new Scanner(System.in);
		//3.�����û����� ,ʹ����صķ���
		System.out.println("���������֣�");
		String name = myScanner.next();		//�����û�����

		System.out.println("���������䣺");
		int age = myScanner.nextInt();		//�����û�����

		System.out.println("������нˮ��");
		double sal = myScanner.nextDouble();		//�����û�����
		
		System.out.println("��Ϣ���£�");
		System.out.println("����:" + name + '\n' + "����:" + age + '\n' +"нˮ" + sal);



	}
}