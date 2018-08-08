package day6;

import java.util.Scanner;

public class Baseballgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  ��ǻ�� vs �����  
		 *   ��ǻ�ʹ� ������ ���� : �������� 1~9������ �ߺ����� �ʴ� ���� 3���� ����
		 *   ����� : ��ǻ�Ͱ� ������ ���� 3���� ������ �Բ� ������Ѵ�.
		 *   ��ǻ�� : 1 3 5
		 *   ����� : 1 2 3
		 *   ��ǻ�� : 1s 1b
		 *   ����� : 2 4 8
		 *   ��ǻ�� : 3O
		 *   ����� : 1 3 5
		 *   ��ǻ�� : 3S
		 *   �����Դϴ�.
		 *   ���α׷��� �����մϴ�.
		 *   S : �ش� ���ڰ� �ְ� �ش� ������ ��ġ�Ҷ�
		 *   B : �ش� ���ڰ� �ְ� �ش� ������ ��ġ���� ������*/

		int com[] = createRandomArray(1,9,3);
		int user[] = new int [3];
		int ball = 0;
		int strike = 0;  
		Scanner scan = new Scanner(System.in);
		//System.out.print("���� : ");
		//printArray(com);
		while(strike != 3){
			System.out.print("���� 3���� �Է� : ");
			user[0] = scan.nextInt();
			user[1] = scan.nextInt();
			user[2] = scan.nextInt();
			
			strike = getStrike(com, user);
			ball = getBall(com, user);
			printResult(strike, ball);
			
		
	    }
		scan.close();
		System.out.println("�����Դϴ�");
		System.out.println("���α׷��� �����մϴ�");
	}
	
	public static int  isDuplicate(int arr[], int num, int cnt){      
		for(int i = 0; i<cnt; i++){   
			if(arr[i] == num){
				return i;
			}
		}
			return -1;                     
	}
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;    
		}
		return  (int)(Math.random()*(max-min+1)+min);
	}
	
	
	public static  int[] createRandomArray(int min, int max, int size){
		int cnt=0;
		if(min > max){
			
			return null;      
		}
		if(max-min+1 < size){  
		    return null;
		}
		if(size < 0){
			return null;
		}
		int arr[] = new int[size];
		for( ; cnt<arr.length; ){
			int tmp = randomInt(min,max);
			if(isDuplicate(arr, tmp, cnt)==-1){ 
				arr[cnt] = tmp;
				cnt++;
			} 
		}
		return arr;
	}		
	public static void printArray(int arr[]){  
		for(int tmp:arr){
        System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	/* ��Ʈ����ũ�� ����� Ȯ���ϴ� �żҵ带 �����ϼ���
	 * �żҵ�� : getStrike
	 * ����Ÿ�� : int
	 * �Ű����� : arr[],arr2[]           */
	public static int getStrike(int com[], int user[]){
		int cnt = 0;
		for(int i =0; i<com.length;i++){
			/*if(com[i] == user[i]){
				cnt++;
			}*/
		
		  if(isDuplicate(com, user[i], 3) == i){
			cnt++;
		   }
		}
		return cnt;
	}
	/*���� ����� Ȯ���ϴ� �޼ҵ�*/
	public static int getBall(int com[], int user[]){
		int cnt = 0;
		for(int i =0; i<com.length; i++){
			int tmp = isDuplicate(com, user[i], com.length);
			if(tmp !=-1 && tmp !=i){    //tmp = i ��� ��Ʈ����ũ�̱� ������
				cnt++;
			}
	    }
		return cnt;
	}
	public static void printResult(int strike, int ball){
		if(strike != 0){
			System.out.print(strike+"S");
		}
		if(ball != 0){
			System.out.print(ball+"B");
		}
		if(strike ==0 && ball ==0){
			System.out.print("3O");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
