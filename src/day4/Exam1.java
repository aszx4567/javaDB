package day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// ����
		//int num = 10;
		/*���Ĺ���
		 * %d : ������
		 * %f, %lf : �Ǽ���
		 * %c : ������
		 * %s : ���ڿ�
		 * printf ���� �ʿ���*/
		//System.out.printf("num : %d\n",num);  
		//System.out.println("num : " +num);
		
		//���ǹ�  [if, swich case] 
		/*if(���ǽ�1){
			���๮1;
		}else if(���ǽ�2){
			���๮2;
		}else{  //���ǽ� ���� �ȵ�
			
		}*/
		/*������ ���� num�� Ȧ���̸� Ȧ���Դϴ� ¦���̸�¦���Դϴٸ� ���*/
				int num =1;
				if(num%2==0){
					System.out.println("¦���Դϴ�");
				}else{
					System.out.println("Ȧ���Դϴ�");
				}
				
				/*���� ��������� ���ڻ���� �ü��ִ�.*/
				int month =1;
				switch(month){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				//=	//if(month ==1 || month ==3 || month ==5 || ... ||month==12)
				     System.out.println("�������� : 31��");
				     break;
				case 2:
					System.out.println("�������� : 28��");
				default:
		     
				}
		
		/*for(�ʱ�ȭ ;���ǽ� ;�������� ){
			���๮;
			}*/
		/*�ʱ�ȭ�� �ݺ����� ����ɶ� ó�� �ѹ��� ����
		 * ���ǽ��� ���̸� ���๮, ��������, ���ǽĺ񱳼����� �ݺ�
		 * ���ǽ��� �������� �ݺ��� ����
		 * 
		 * 1���� 10���� ��*/
		int i =0;
		int sum =0;
		for(i=1; i<=10 ; i++){
			sum += i;
		}System.out.println(sum); 
		// ����num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ�   1���� num���� ���������� ��������0 �̸� ��� ����� ����2���� �Ҽ�*/
		num = 37;
		int cnt =0;
		for(i=1 ; i<=num ; i++){
			if(num%i==0){
				cnt ++;
				//System.out.println("��� ="+i);
			} 
		}
			if(cnt == 2){
				System.out.println("�Ҽ��Դϴ�.");
			}else{
				System.out.println("�ռ����Դϴ�");
			}
			/* �Ҽ��� ���ϴ� �ٸ� ���    �Ҽ��� ����� ���� �����Ѵٸ� 1�̴�.
			 * ���� ������ ��� �� ���� ū ���� 1*/
		int div =0;
		num =10;
		for(i=num-1;  i>0 ; i--){
			if(num%i==0){
				div =i;
				break;
			}
		}if(div == 1 ){
			System.out.println(num+" = �Ҽ�");
		}else{
			System.out.println(num+" = �ռ���");
		}                                         // �˰��� 
		/*�ִ����� �ۼ�*/
		int num1=200, num2 =100, gcd =1;
		for(i=1 ; i<=num1 ; i++){
			if(num1%i==0 && num2%i ==0){
				gcd =i;
				break;
			}
		}
		System.out.println(num1+"��"+num2+"�� �ִ� ������� "+gcd);
		/* ���� �ڵ带 ���� ���� �� �ݺ�Ƚ���� �ݺ��� ������ i�� ����?
		 * �������� �ʰ� ����� �����ϼ���
		 * �ݺ�Ƚ�� =5 , ������ i�ǰ� =8
		 for(i=0; i<10; i+=2){
			 cnt++;
		 }*/
		//�ּҰ������ ���ϴ� �ڵ� �ۼ� �ּҰ���� ������ 2������ ���� ���� �� �ݺ��� ���� i�� �ʿ�
		int lcm =0;  //lcm = �ּҰ����
		num1 =30; num2=20;
		for(i =num1 ; i<= num1*num2 ; i+=num1){
			if(i%num1==0 && i%num2==0){
				lcm =i;
				break;
			}
		}System.out.println(num1+" �� "+num2+" �� �ּҰ������ "+lcm);
		   
		/* ****
		 * ****
		 * ****
		 * **** */
		Scanner scan = new Scanner(System.in);   //��Ʈ�� ����Ʈ ���ĺ� o
		num = scan.nextInt();
		for(i=1 ;i <=num ; i++){
			for(int k =1 ; k<=4 ; k++){
				System.out.print("*");
			}System.out.println(" ");
		}
		/* *
		 * **
		 * ***
		 * **** */
		for(i=1 ; i <=num ; i++){
			for(int j =1 ;j<=i; j++){
				System.out.print("*");
			}System.out.println(" ");
		}
		/* *****
		 *  ****
		 *   ***
		 *    **
		 *     *  */
		for(i =1 ; i<=num ; i++){
			for(int j =1 ; j<=i-1 ; j++){
				System.out.print(" ");
			}
			for(int j =1 ; j <=num+1- i ; j++ ){
				System.out.print("*");
			}System.out.println(" ");
		}
		for(i =num ; i>=0 ; i--){
			for(int j =1 ; j<=num-i ; j++){
				System.out.print(" ");
			}
			for(int j =1 ; j <=i ; j++ ){
				System.out.print("*");
			}System.out.println(" ");
		}
		for(i=1 ; i<=num ; i++){
			for(int j =1 ; j<=num ; j++){   //����+�� = 5 �̱� ������ j<=5
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}System.out.println(" ");
		}
		/*    *     i=1 ���鰹�� =2 +1 3 ���ǰ���=1   0 2
		 *   **     i=2 ���鰹�� =1  -1 3 ���ǰ���=2   0 4
		 *  ***     i=3 ���鰹�� =0  -3 3 ���ǰ���=3   0 6
		 *   **     i=4 ���鰹�� =1  -3 5 ���ǰ���=2  -2 6
		 *    *     i=5 ���鰹�� =2  -3 7 ���ǰ���=1  -4 6  
		 *                 Math.abs(3-i)      3-Math.abs(3-i)         
		 *  num=5 (num+1)/2  
		 *       */
		System.out.println(Math.abs(-1));  //����  -1�� �������� ���
		for(i=1 ; i<=num ; i++){
			for( int j =1; j<=Math.abs((num+1)/2) ;j++ ){
				if( j<=Math.abs((num+1)/2-i)){
					
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}System.out.println( );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
