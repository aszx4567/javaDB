package day3;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 * ===
		 * ===
		 * ===
		 * ===
		 * ===
		 */
		for(int i=1; i<=5 ; i++){
			for(int j =1; j<=3; j++){
				System.out.print("=");
			}
			System.out.println();
		}
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * ***** ==i
		 */
		for(int i =1; i<=5;i++){
			for(int j =1; j<=i  ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *     *  i=1, �����ǰ��� 4 , ���ǰ���: 1
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		//��� 1
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//���2
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5;j++){
				if(j<=5-i)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
		/*     *
		 *    ** *
		 *   *** **
		 *  **** ***
		 * ***** ****
		 * */
		for(int i =1;i<=5; i++){
			for(int j =1; j<=5-i ;j++){
				System.out.print(" ");
			}
			for(int j =1; j<=i ; j++){
				System.out.print("*");
			}
			for(int j=1; j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i =1; i<=5; i++){
			for(int j=1; j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 * */
 		for(int i =1; i<=5 ; i++){
 			for(int j=1 ;j<=i-1 ;j++){
 				System.out.print(" ");
 			}
 			for(int j=1 ; j<=6-i ; j++){
 				System.out.print("*");
 			}
 			for(int j =1; j<=5-i ;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}  
 		//2
 		for(int i =1; i<=5; i++){
 			for(int j=1 ; j<=i-1;j++){
 				System.out.print(" ");
 			}
 			for(int j=1; j<=11-2*i;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		//3               ����+�� =9 8 7 6 5 -> 2*5-i
 		for(int i=1; i<=5; i++){
 			for(int j=1; j<=2*5-i ;j++){
 				if(j <= i-1)
 					System.out.print(" ");
 				else
 					System.out.print("*");
 			}
 			System.out.println();
 		}
 		/*������ ��ü�� ����ϴ� �ڵ带 �ۼ��ϼ���.*/
 		int i =0;
 		for(i=2 ; i<=9 ; i++){
 			System.out.println(i+"��");
 			for(int j =1; j<=9 ; j++){
 				System.out.println(i+" x "+j+"="+(i*j));
 			}
 		}
		/*2���� 100������ ��� �Ҽ��� ����ϼ���*/
 		int cnt=0, a=0;
 		System.out.println("2���� 100 ������ �Ҽ�");
 		for(a=2 ; a<=100 ;a++){
 			cnt=0;  //cnt �ʱ�ȭ�� ���ϸ� ��ø�� �Ǿ� a=2 �� 2�� ��µȴ�.
	   		for(i=1 ;i<=a;i++){
	   			if(a%i ==0){
	   			cnt++  ;    
	   			}
	   		}
	   		if(cnt == 2){
	   			System.out.print(a + " ");
	   			//System.out.println(cnt);
	   		}
 		}
	    
		
		
		
		
		
		
		
		
		
		
	
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
	

}
