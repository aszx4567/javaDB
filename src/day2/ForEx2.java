package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// 1���� 10 ���̿� Ȧ���� ����ϴ� �ڵ带 for���� �̿��Ͽ� �ۼ�
		int i=0;
		for(i=1; i<=10 ;i=i+2)  //i=i+2  =   i+=2
			System.out.println
			(i);
		/*
		for(i=1; i<=10 ; i++){        // �߰�ȣ �� if�� ���� Ȱ���Ҽ��� �ִ�
		 if(i%2 == 1){            // ������ Ƚ���� ������ ����ӵ� ����!
		  System.out.println(i);
		}}
		1���� 10 ������ ���� ���ϴ� ������ �ۼ��ϼ���
		 *  */
		int sum =0;
		for(i=1 ; i<=10 ; i++){
			sum = sum+i;   //i�� 1�϶� sum�� 1�� �ǰ� 2�϶� sum�� 1+2�� �Ǵ°��� �ݺ�
		}
		System.out.println("1~10 �� �� :"+sum);
		/*������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���
		 * ��¿���
		 * 7 x 1 = 7
		 * ......
		 * 7 x 9 = 63                         
		 * */
		for(i=1 ; i<=9 ; i++){ //�ݺ��� �ȿ��� ����� �ݺ��������� ��밡��
			System.out.println("7 x "+i +"=" + 7*i);
		}
		 
	}
}

