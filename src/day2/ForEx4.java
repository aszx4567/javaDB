package day2;

public class ForEx4 {

	public static void main(String[] args) {
		/* �� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���
		 * �ּҰ���� : �� ���� ���λ��� �ּ��� �����
		 * i�� num1�� ���������� ��������0�̰�
		 * i�� num2�� ���������� �������� 0�̸� i�� ���(�����)�ϰ� 
		 * �ݺ����� �����Ѵ� �ݺ����� �����ϱ� ���ؼ��� switch case��
		 * ���� ����� break�� �̿��Ѵ�.
		 * */
		int num1 =12, num2 =1111, i =0;
		int cnt =0; //�ݺ�Ƚ�� �˱����� ����
		System.out.print(num1+"��"+num2+"�� ������� : ");
		for(i=num1; i <=num1*num2 ;i++){ //i+num1 �� �ϸ� 
			if(i%num1==0 && i%num2==0){
			System.out.print(i+" ");
			}
		}
		System.out.println("");
		for(i=num1; i <=num1*num2 ;i+=num1){  //i+num1 �� �ϸ� ū���� num2�� ����Ѵ� 
			cnt++ ;
			if(i % num2==0){
			   System.out.println("���� : "+i);
			break;
			}
		}
		System.out.println("���� �ݺ�Ƚ�� : " +cnt);
		for(i=num1; i <=num1*num2 ;i++){
			cnt++ ;
		    if(i%num1==0 && i%num2==0){
				System.out.println("�ܼ� : "+i);
			break;  //if���� �ƴ϶� if���� ���� �ݺ������� �������´�
				        //ù��°�� ��ġ�� ������� ������ ���������� ������
				        //�ּҰ������ ��µȴ�!
			}
		}
		System.out.println("�ܼ� �ݺ�Ƚ�� : " +cnt);
	     
		int tmpNum = num1;
		int div = num2;
		if(num2 > num1){
			tmpNum = num2;
			div = num1;
		}
		for(i=tmpNum; i <=num1*num2 ;i+=tmpNum){  
			cnt ++;
			if(i%div==0){
			System.out.println("���� : "+i);
			break;
			}
		}
		System.out.println("���� �ݺ�Ƚ�� : " +cnt);
	}

}
