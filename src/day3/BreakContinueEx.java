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
					break Test;  //���ϴ� �̸�[Test] ���� ��������
				}
			}
		}
		/*1���� 100���� ¦���� ���� continue ���� �̿��Ͽ� �ۼ��Ͻÿ�*/
		int aszx = 0;
		System.out.print("1���� 100���� ¦���� �� = ");
		for(int i=1; i<=100;i++){
			/*
			 * if(i%2==0)
			 *         aszx +=i;*/
			if(i % 2==1)
				continue;
			aszx = aszx + i;
			
		} 
		System.out.println(aszx);
		int sum =0;
		for(int i =1; i<=100; i++){
			if(i%2==0)
				sum +=i;
		}
		System.out.println("1���� 100 ������ �� = " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
