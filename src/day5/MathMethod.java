package day5;

import java.util.Scanner;

public class MathMethod {

	public static void main(String[] args) {
		/*main�޼ҵ忡 �ִ� num1, num2��
		 * GCD�޼ҵ忡 �ִ� num1, num2�� ���� �ٸ� �����̴�.
		 * �޼ҵ带 ����ϴ� ����
		 * 1. �ڵ��� �ߺ��� �ּ�ȭ
		 * 2. �޼ҵ带 ����*/
		// TODO Auto-generated method stub
		/*�ִ������� ���ϴ� �ڵ带 �ۼ��ϼ���
		 * ��� - 1���� �ڱ��ڽű��� ������ �������� 0�� ��*/
		int i , num1 =20, num2 =10, gcd =1;
		Scanner scan= new Scanner(System.in);
		System.out.println("num1�� �Է����ּ���.");
		num1 = scan.nextInt();
		System.out.println("num2�� �Է����ּ���.");
		num2 = scan.nextInt();
		/*for(i=1; i<=num1; i++){
			if(num1%i==0 && num2%i ==0){
				gcd=i;
				
			}
		}*/
		/*gcd = GCD(num1,num2);
		System.out.println(num1+"��"+num2+"�� �ִ� �������"+gcd);*/ 
		
		
		
		
		int num3 =50, num4 =20, lcm= 0 ;	
		gcd = GCD(num1,num2);
	    lcm = LCM(num1,num2);
        System.out.println(lcm);
	
	}
	/*�ִ����� �޼ҵ�*/
	public static int GCD(int num1, int num2){
		int i;
		int gcd =1;
		for(i=1; i<num1; i++){
			if(num1%i == 0 && num2 %i ==0){
				gcd =i;
			}
		}return gcd;
	}
	
	/*�μ��� �ּҰ������ ���ϴ� �ڵ带 �̿��� �żҵ�� ��������
	 * ���������2�� �ּҰ�������� lcm = a*b/gcd
	 * �޼ҵ�� = LCM
	 * ����Ÿ�� = int
	 * �Ű����� = int num3, int num4      */ 
	public static int LCM(int num1, int num2){
		int i =0;
		int lcm =1;
		for(i=num1; i<=num1*num2; i+=num1)
			if(i%num2==0){
				return i;
			}   return 1;
	}
	public static int LCM2(int num1, int num2){
		return num1*num2/GCD(num1,num2);
	}
	

}
