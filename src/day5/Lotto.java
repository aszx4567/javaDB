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
		int arr[] = new int[6]; //�ڵ�������ȣ
		int arr2[] = new int[7]; //��÷��ȣ
		int min =1, max = 8;
		int cnt = 0; // �������� ������ �ߺ����� ���� ��ȣ�� ����
		int num = 0;
		int count = 0;
		int size = 0;
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
			sort(arr,size);
			printArray(arr);
		}
		//��÷��ȣ �迭�� ���弼�� 
		arr2 = createRandomArray(min, max, 7);
		if(arr2 == null){
			System.out.println("��÷��ȣ ���� ����");
		}else{
			sort(arr2,size);
			printArray(arr2);
			/*System.out.println("��÷��ȣ 1�� = "+arr[0]);
			System.out.println("��÷��ȣ 2�� = "+arr[1]);
			System.out.println("��÷��ȣ 3�� = "+arr[2]);
			System.out.println("��÷��ȣ 4�� = "+arr[3]);
			System.out.println("��÷��ȣ 5�� = "+arr[4]);
			System.out.println("��÷��ȣ 6�� = "+arr[5]);
			System.out.println("�߰���ȣ = "+arr[6]);*/
		}
		count = countCheck(arr, arr2);
		System.out.println(count);
		
		printRank(arr,arr2);
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
	public static boolean  isDuplicate(int arr[], int num, int cnt){      //cnt = �迭�� ũ��
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
     * 3 . �Ű����� :  �ּڰ�,�ִ�,������ �迭�� ���� (int size)                 */
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
		if(size < 0){
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
		/*for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}*/
		for(int tmp:arr){
//     System.out.print(tmp + " ");   //���� for �� �б�µ����� ����¾ȵ�, �迭 ��ü�� �����
		System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	/*  �� �迭�� �־������� ���� ��ȣ�� � �ִ��� ��ȯ�ϴ� �޼ҵ带 ���弼��.
	 *   �޼ҵ�� : countCheck 
	 *   �Ű����� : arr[], arr2[], 
	 *   ����Ÿ�� : int
	 *   */
	public static int countCheck(int arr[], int arr2[]){
		int cnt = 0;
		int size = 0;
		if(arr.length > arr2.length){
			size = arr2.length;
		}else{
			size = arr.length;     //�� �迭�� ���̰� �� �� ���� size�� �ϱ� ���ؼ�.
		}
		/*for(int i = 0; i<size; i++){
			for(int j = 0; j<size;j++){
				if(arr[i] == arr2[j]){
					cnt++;
				}
			}
		}*/
		for(int i =0; i<size; i++){
			if(isDuplicate(arr, arr2[i], size)){
				cnt++;
			}
		}
		return cnt;
	}
	/* �� �迭�� ���Ͽ� ���� ������ ���� ����� ����ϴ� �޼ҵ带 ���弼��
	 * 1���� 6��, 2���� 5��+���ʽ���ȣ, 3���� 5��  4���� 4�� 5���� 3��
	 * �޼ҵ�� : printRank
	 * ����Ÿ�� : arr[], arr2[]
	 * �Ű����� : void
	 * */
	public static void printRank(int arr[], int arr2[]){
		int count = countCheck(arr,arr2);
		boolean isBonus = false;
		if(arr.length > arr2.length){
			isBonus = 
			isDuplicate(arr2, arr[arr.length-1], arr2.length);
		}else{
			isBonus = 
			isDuplicate(arr, arr2[arr.length-1], arr.length);
		}
		if(count == 6){
			System.out.println("1�� ��÷!!!!!!");
		}else if(count == 5){
			if(isBonus){
					System.out.println("2�� ��÷!");
			}else{	
                    System.out.println("3�� ��÷");
				
			}
		}else if(count == 4){
			System.out.println("4���Դϴ�");
		}else if(count == 3){
			System.out.println("5��");
		}else{
			System.out.println("��÷�����ʾҽ��ϴ�");
		}
	}
    public static void sort(int arr[], int size){
    	//��������
    	for(int i =0; i<size-1; i++){
    		for(int j =0; j<size-1-i; j++){
    			//�տ� �ִ� ���� �ڿ� �ִ� ������ ũ�� ���� ��ȯ
    			if(arr[j] > arr[j+1]){
    				int tmp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = tmp;
    			}
    		}
    	}
		
	}
	
	
	
}
