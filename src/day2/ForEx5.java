package day2;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ForEx5 {

	public static void main(String[] args) {
		/* ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���
		 * �Ҽ� : ����� 1�� �ڱ��ڽ��μ�
		 * ��� 1 ������ ������ ���� num�� ����� ������ ������
		 * ���� cnu�� �ݺ��� ����i�� ���� �� �ʱ�ȭ
		 * i��1���� num���� �ϳ��� �����ϸ鼭 �ݺ�
		 * i��num�� ����̸� ����� ���� 1�� ����
		 * �ݺ����� ������� cnt�� 2���̸� �Ҽ� �ƴϸ� �ռ����� ���
		 * ���2 i�� num-1 ���� 1���� �ϳ��� �����ϸ鼭 �ݺ�
		 * num�� */
           int num =13, i =0, cnt=0;  //cnt�� ����� ���� ����
   		for(i=1;i<=num;i++){
   			if(num%i ==0){
   			cnt++  ;   //����� ������ 1 ����
   			}
   		}
	    if(cnt == 2){
		System.out.println(num+"��  �Ҽ��Դϴ�");
	    }
	    else{
	    System.out.println(num+"��(��) �ռ����Դϴ�");
	    }
	    //���2
	    for(i=num-1; i>=1; i--){
	    	if(num%i ==0){
	    		//�̶� i�� num�� ������ ���� ū ����̴�.
	    		break;
	    	}
	    }	       	   
	    //i�� 1�̸� num�� ������ ����� 1�̶�� �ǹ��̰�,
	    //�̴� ����� 2����� �ǹ��̹Ƿ� �Ҽ��̴�
	    if(i==1){
	    	System.out.println(num+"�� �Ҽ�");
	    }else{
	    	System.out.println(num+"�� �ռ���");
	    }
	    for( ; ; ){
	    	//=���ѷ���
	    }
	}

}
