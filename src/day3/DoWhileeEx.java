package day3;

import java.util.Scanner;

public class DoWhileeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mode='q';
		Scanner scan = new Scanner(System.in);           //��Ʈ�� ��Ʈ ���ĺ�o =  ��ĳ�ʺҷ����� ����Ű
		do{
			System.out.println("�Ŵ�");
			System.out.println("1. �л������߰�");
			System.out.println("2. �л��������");
			System.out.println("q. ���α׷� ����");
			System.out.println("�Ŵ��� �����ϼ���");
			mode = scan.next().charAt(0);
		}while(mode !='q');

	}

}
