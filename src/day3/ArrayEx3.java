package day3;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*������ ����� �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���
		 * �迭�� 10��¥���� �ϰ�, ����� 10�� �̻��� ������ 10�������� ���Ѵ�
		 * 1. �ʿ��� ���� ���� - 10��¥���迭, �ݺ�������, ���� ����
		 * 2. ����� ����ϴ� �ڵ� �ۼ�
		 * */
		int div[] = new int [10];
		int i =0, num = 30;
		int sum =0;
		//����� ������ �����ϴ� ����
		i =1;
		while(i<=num){
			if(num%i==0){
				//System.out.println(i);
				div[sum] = i; 
				sum++;
				// ��� i�� �迭 div�� �����ϴµ� ��ġ�� �������� ã�� ����� ���������� ����
				//�׸��� ������ �Ŀ��� ����� ������ �ϳ� �����Ѵ�.
				if(sum == 10)
					break;  //���������� ����� ������ �ִ� 10���� ���ϱ�� �߱� ������ 10���� ���ϸ� ����
				
			}
		 i++;
		}
		i =0;
		while(i<sum ){               //length�� ���� ���� ���� ������ 0���� ǥ�õ�
		   System.out.print(div[i]+ " ");
		   i++;
		}
		

	}

}
