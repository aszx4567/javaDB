package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�迭�� �ڷ����� ���� ������ �ϳ��� ���� ������,
		 * ������ ������ �����̿��� �Ѵ�*/
		//int num1, num2, num3, num4, num5;     //�޸𸮻󿡼� �������� �Ҵ�
		int num[] = new int [5];              //���ӵ� �޸� ���� �Ҵ�  //num�� ���� ���� int 5���� �ּ�?//�ݺ������� 
		/* 1. �迭�� ���� �ݺ����� �̿��ϱ� ���ϴ�
		 * 2. �迭�� ���� �������� ���ؼ��� �迭�� �ε����� �����ؾ��ϴµ� �ε����� ���� ������ 0�����̴�.
		 * 3. �迭�� ������ �ε���(����)�� �迭�� ũ��-1�̴�. �迭��ũ�Ⱑ 5 ��� 0,1,2,3,4 �̴�.
		 * */	
		//num[0] = 1; //0������ 1�� ����
		System.out.println("�迭 �⺻ ����");
		for(int i=0; i<num.length; i++){
			num[i] = i+1;
		}
		for(int i=0; i<num.length; i++){
			System.out.println("num["+i+"] : " +num[i]);
		}
		
		//int[] �������� �Ǿ� num1,num3�� �迭�� ��
		int []num1,num3;
		//int�� �������� �Ǿ� num2�� �迭, num4�� �Ϲ� ��������
		int num2[],num4;
		num1= new int[3]; // �����ϰ� �ٷ� �Ҵ����� �ʾƵ� ��
        /* num1 : �迭
         * num2 : �迭
         * num3 : �迭
         * num4 : ����
         * */
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size >= 0)
			num1 = new int[size];
		scan.close();
		
		int num5[] ={1,2,3,4,5}; //������ ���� ���ڸ� ���Ҽ� �ִ�
        System.out.println("�ʱ�ȭ ����");
        for(int i=1; i<num5.length ; i++){
        	System.out.println("num[" +i+ "] : " +num5[i]);
        }
		int num6[];
		//num6 = {1,2,3,4,5};//�ʱ�ȭ�� �迭�� �����Ҷ��� ����
		
		
		
		
	}

}
