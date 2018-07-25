package day5;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  0 <= x < 1
		 *  0 <= 10*x < 10
		 *  1<= 10*x+1 <11   
		 *  */
		/*int min =50, max =100;   //ǥ��ȭ�� ����
		for(int i = 0; i<10; i++){
			int num = randomInt(min,max);         //Math.random() = 0.0���� ũ�ų����� 1.0 ���� ���� �Ǽ��� �������� ����
			System.out.println(num);
		}*/
		int arr[] = new int[6];
		int i;
		int min =1, max = 6;
		int cnt = 0; // �������� ������ �ߺ����� ���� ��ȣ�� ����
		int num = 0;
		/* �������� �ߺ��Ǵ� �ζ� ��ȣ
		for(i=0; i<arr.length; i++){
			arr[i] = randomInt(min,max);
		} */
		
		/*�ߺ��ζ��ڵ带 �̿��Ͽ� �ߺ����� �ʴ� �ζǹ�ȣ�� �����ϴ� �ڵ带 �ۼ��ϼ���*/
		/*for(i =0; i<arr.length; i++){
			arr[i] =0;
		}
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==false){  //cnt�� �߰��ؼ� cnt ������������ ���ؼ� 
				                                               //0�� ����� �ʱ�ȭ���� ���ϴ°� ������ [���ܹ���]
				arr[cnt] = tmp;
				cnt++;
			}*/ 
			/*tmp�� arr�� �ߺ��� ���� ������
			 * tmp�� arr�� ����
			 * cnt�� �ϳ� ����*/
			
			
		arr = createRandomArray(min, max, 6);
		if(arr == null){
			System.out.println("�ζǹ�ȣ ���� ����");
		}else{
			/* ������ �迭 ���*/
			printArray(arr);
		}
	}
	/*�ּڰ��� �ִ��� �Է¹޾� �ּڰ��� �ִ� ���̿� �ִ� ������ ���� �����ϴ� �޼ҵ�
	 * 1. �޼ҵ�� : randomInt
	 * 2. �Ű����� : �ּڰ�(int min), �ִ�(int max)
	 * 3. ����Ÿ�� : ������ ���� (int) 
	 * */
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;    //�μ� ��ȯ�ϱ�
		}
		return  (int)(Math.random()*(max-min+1)+min);
	}
	
	/*�迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ� �ۼ� 
	 * �ݺ����� �̿��Ͽ� �迭 arr�� 0�������� 5������ ���� �ϳ��� �����ͼ� num�� ���ٸ� ��������
	 * �ݺ����� ����Ǹ� ����ǰ� �� �Ŀ� i�� 6�̸� ����.
	 * 6�� �ƴϸ� ������ ����Ѵ�.*/
	/*if(!isDuplicate(num, arr)){      //�Ű����� ��� ������ ����� ��!!
		System.out.println("����");
	} else{
		System.out.println("����");
	}*/
	/*main �޼ҵ忡�� �ۼ��� �ڵ带 �̿�, �迭 arr�� num�� ���� ���� �ִ��� ������ �Ǻ��ϴ� �޼ҵ�*/
	public static boolean  isDuplicate(int arr[], int num, int cnt){
		for(int i = 0; i<cnt; i++){   //length = �迭�� ����!
			if(arr[i] == num){
				return true;
			}
		}
			return false;                     // �ڷ����� boolean - ������ true, ������ false �� ����ϱ� ���ؼ�
	}
    /* �ߺ����� ���� ������ ���� �����Ͽ� �迭�� �����ϴ� �޼ҵ�
     * 1. �޼ҵ�� : createRandomArray
     * 2. ����Ÿ�� : int []
     * 3. �Ű����� :  �ּڰ�,�ִ�,������ �迭�� ���� (int size)                 */
	public static  int[] createRandomArray(int min, int max, int size){
		int cnt=0;
		if(min > max){
			/*int tmp = min;
			min = max;
			max = tmp;*/     //�ΰ����� �ٲ�����
			return null;       //�߸��Է������� �ȹٲ���
		}
		if(max-min+1 < size){   //6���迭�� 5���� �ֳ��� ������ �ߺ��� �迭�� ��Ÿ���� ������
		    return null;
		}
		int arr[] = new int[size];
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==false){ 
				arr[cnt] = tmp;
				cnt++;
			} 
		}
		return arr;
	}		
	public static void printArray(int arr[]){  //�ֿܼ� ��¸� �� ��� void �� ����.
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
