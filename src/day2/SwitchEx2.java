package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ���� ch �� a �Ǵ� A�̸� A�Դϴٶ�� �ֿܼ� ����ϰ�
 * ���� ch �� b �Ǵ� B�̸� B�Դϴ� ��� �ܼ��� ����ϰ�
 * ���� ch�� a,b,A,B�� �ƴϸ� A��B�� �ƴմϴ� ���
 * �ֿܼ� ����ϴ� ������ switch case ������ �ۼ��ϼ���*/
char ch = 'a';    //��Ȥ ������ �ش�Ǵ� �ƽ�Ű �ڵ�ǥ�� ��Ÿ���⵵ �Ѵ�.
switch(ch){
case 'a':   //ch�� ���� a�̸�
case 'A':
	System.out.println("A�Դϴ�");
	break;
case 'b': 
case 'B':
	System.out.println("B�Դϴ�");
	break;
default:
	System.out.println("A��B�� �ƴմϴ�");
}


int num =31;
switch(num%2){   //����ġ �� �Ұ�ȣ���� ������ ������ �����ϴ�.
case 0 :
	System.out.println(num+"��(��) ¦���Դϴ�");
	break;
default:
	System.out.println(num+"��(��) Ȧ���Դϴ�");

}
	}

}
