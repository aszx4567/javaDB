package day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�迭�� �̿��Ͽ� �л� 5���� ������ Ű���带 ���� �Է¹ް� 
		 * ���� ������ ����ϴ� �ڵ带 �ۼ��ϼ���*/
		int score[] = new int[5];
		Scanner scan = new Scanner(System.in);        //Ű����� �Է¹������� ��ĳ��
		for(int i =0 ; i<score.length ; i++){         //length = score �迭�� ����  [���⼱ 5]
			System.out.println("�л�" + (i+1)+"�� ������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
		}
		for(int i =0; i < score.length; i++){
			System.out.println("�л�"+(i+1)+"�� ���� : " +score[i]);
		}
		/*�л����� ����� ���ϴ� �ڵ带 �ۼ��ϼ��� */
		//double avg1 = (score[0]+score[1]+score[2]+score[3]+score[4])/5.0;
		//System.out.println(avg1);
		int sum=0;
		int avg = 0;
		for(int i =0; i< score.length ; i++){
			sum = sum + score[i];	
			avg += (double)score[i]/score.length;
		}
		System.out.println("�л����� ��� ���� : " + (double)sum/score.length); 
		System.out.println("�л����� ��� ���� : " +avg);

	}

}
