package day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		System.out.println("break�� ����");
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				System.out.println("j="+j+",i="+i);
				if( i==4){
					break;  //�ٷ� ���� for���� ��������
				}
			}
		}
		System.out.println("continue[�ǳʶٱ�]�� ����");
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				
				if( i==4){
				continue;  //�ٷ� ���� for���� ��������
				}System.out.println("j="+j+",i="+i);
			}
		}
		System.out.println("�̸��� �ִ� for�� break�� ����");
		Test:
		for(int j =1; j<=5; j++){
			for(int i =1; i<=5; i++){
				System.out.println("j="+j+",i="+i);
				if( i==4){
					break Test;  //���ϴ� �̸����� ��������
				}
			}
		}
		/*1���� 100���� ¦���� ���� continue ���� �̿��Ͽ� �ۼ��Ͻÿ�*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
