package day2;

public class ForEx3 {

	public static void main(String[] args) {
/* 234�� ����� ���ϴ� �ڵ带 �ۼ��ϼ���
 * ������ 1���� �ڱ��ڽű��� ����� 
 * �������� 0�� �Ǹ� �� ���� ������ ����̴�.
 * */
		int i = 0, num =234;
		System.out.print(num+"�� ��� :");
		for(i=1;i<=num;i++){
			if(num%i == 0){
				System.out.print(i+" ");
			}
		}
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���
		 * �ִ����� : �� ���� ������� ���� ū ��
		 * */
		System.out.println(" ");
		int num1 =500;
		int num2 = 200;
		int gcd =1;   //gcd = �ִ�����
		System.out.print(num1+"��"+num2 +"�� �ִ�������");
		for(i=1;i<=num1;i++){
			if(num2%i == 0 && num1%i ==0){
				gcd = i;  //1�� �����Ǽ� ���� ���������� ������ i�� ��Ÿ����
			}
		}
		System.out.println(gcd);
		
		System.out.print(num1+"��"+num2 +"�� �������");
		for(i=1;i<=num1;i++){
			if(num2%i == 0 && num1%i ==0){
				System.out.print(i +" ");
			}
		}
	}
}