package day5;

import java.util.Scanner; //�ڹ� until �Ʒ��� ��ĳ��(�޼ҵ�)�� �����´�

public class MethodEx1 {
	/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ�
	 * �޼ҵ�� �Է� (�Ű�����)�� ���(����Ÿ��)�� �ʿ��ϴ�
	 * ��Ȳ�� ���� �Է°� ����� �ʿ� �������� �ִ�.
	 * ����������(public) ���(void) �޼ҵ��̸�(main)
	 * (�Ű�������(Steing[] args)){
	 *       ����;
	 * }      
	 * ex) ���Ǳ⸦ ���� ����  �Է�(�Ű�����)�� ��, ������ ����
	 *                                  ���(����Ÿ��)�� ���õ� ����
	 * �޼ҵ�� Ŭ�����ȿ� �����Ѵ�
	 * */

	public static void main(String[] args) {    
		// TODO Auto-generated method stub
		/*�μ��� �����ڰ� �־����� �� ��������� �ϴ� �ڵ带 �ۼ��ϼ���*/
	    int num1 = 10;
	    int num2 = 6;
	    char op = '/';  //�����ȣ  ��ĳ�ʷ� �Է� �޾Ƽ� ���
	    double res =0.0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("num1�� �Է����ּ���");
	    num1 = scan.nextInt();
	    System.out.println("�����ڸ� �Է����ּ���");
	    op = scan.next().charAt(0/*0����[���ڿ��ǸǾ�]�� ĳ���ͷ� ������*/);
	    System.out.println("num2�� �Է����ּ���");
	    num2 = scan.nextInt();
	    res = calculate(num1, num2, op);
	    /*num1, num2, op�� �Ű�����  res�� ����Ÿ��	
	    if(op == '+'){
	    	 res = num1 + num2 ;
	    }else if(op == '-'){
	    	res = num1 - num2;
	    }else if (op == '*'){
	    	res = num1 * num2;
	    }else if (op == '%'){
	    	res = num1 % num2;
	    }else if (op == '/'){
	    	res = (double)num1 / num2; //������� �Ǽ��� �ǵ��� ������ �ٿ�����
	    }else{
	    	System.out.println("�����ڸ� �߸��Է��߽��ϴ�.");
	    }*/
	    System.out.println(""/*���ڿ� + ������ �Ǿ� 3�� ������
	    �Ⱥ��̸� op�� �ƽ�Ű �ڵ�[����]�� �νĵǾ� ���� + ���� �� �ǹ���*/
	    		+ num1 + op +  num2 +"="+res);
	    /*�� �ڵ带 �޼ҵ�� ������[Ŭ���� ���̸� ��]*/
	   }
	 public static double calculate(int num1, int num2, char op){
	    	double res = 0.0;
	    	if(op == '+'){
		    	 res = num1 + num2 ;
		    }else if(op == '-'){
		    	res = num1 - num2;
		    }else if (op == '*'){
		    	res = num1 * num2;
		    }else if (op == '%'){
		    	res = num1 % num2;
		    }else if (op == '/'){
		    	res = (double)num1 / num2; 
		    }else{
		    	System.out.println("�����ڸ� �߸��Է��߽��ϴ�.");
		    }
	    	return res;
	    }

}
