package day4;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���� for��*/
		int arr[] = new int[5];
		for(int i =0 ; i<5;i++){
			arr[i] = i;
		}
		/* �迭�� ��� �����͸� ������ �� ���
		 * �迭�� ���� �������� ���� �� ���
		 * ��� �迭�� �ѹ��� ������ �ʿ��Ҷ�
		 * */
		for(int tmp:arr){        //arr�迭�� ������ ����� tmp��� ������ ����
			System.out.println(tmp);
		}
        
		/* �ڷ����̸�[];
         * �ڷ����̸�[] = new �ڷ���[�迭��ũ��];
         * 
         * ����num�� �� �ڸ��� �߶� �迭�� �Ųٷ� �����ϴ� �ڵ带 �ۼ��ϼ���.
         * ��, �ݺ����� ����ؾ��Ѵ�.
         *  num = 1234;
         *   0���� = 4  1���� =3 2���� =2 3���� =1
         *   1234 %10 4�� �̾Ƴ��� 0������ ����, 1234/10 =>123  //������ ������ �������� ���� ������ 123�� ���´�.
         *   123 %10 3���̾Ƴ��� 1����������, 123/10 =>12
         *   12 %10 2�� �̾Ƴ��� 2������ ����, 12/10 =>1
         *   1 => 1, 3������ ����, 1 =>0
         *   */
		int num=123456;
		arr = new int[11];
		int cnt = 0; //�迭�� ����� ����
		while(num != 0){
			arr[cnt] = num %10 ;         //������ �ڸ��� �����Ͽ� �迭�� ����
			num = num/10;//������ ������ �ڸ��� ������ �ڵ�
			cnt++ ;//����� ���� ����
		}
		int i =0;
		while(i<cnt){
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}