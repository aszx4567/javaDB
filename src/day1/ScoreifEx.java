package day1;

public class ScoreifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ������ �� ������ �������� ����ϼ���
 * 0~59 : F
 * 60~69  D
 * 70~79  C
 * 80~89  B
 * 90~100 A
 * �׿� : ������ �߸� �Է��߽��ϴ�.
 *  */
		int score = 110;
	    if ( 90 <= score && score <= 100){
			System.out.println("������ A �Դϴ�");
		}
		else if ( 80 <= score && score <= 89){
			System.out.println("������ B �Դϴ�");
		}
		else if ( 70 <= score && score <= 79){
			System.out.println("������ C �Դϴ�");
		}
		else if ( 60 <= score && score <= 69){
			System.out.println("������ D �Դϴ�");
		}
		else if ( 0 <= score && score <= 59){
			System.out.println("������ F �Դϴ�");
		}
		else{
			System.out.println("������ �߸� �Է��ϼ˽��ϴ�.");
		}
		
		// else if �� �ؾ� ȿ�����̴� ù��°��  if 
		
	}

}
