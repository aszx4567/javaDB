package day1;

public class variable {
	public static void main(String[] args) {
	//변수규칙
	//int 1num; //변수명 처음에는 숫자가 올 수 없음
    //int num%; //특수문자는 $_ 만 가능
	// int int; // 키워드사용불가
	//int num 1; //공백사용불가
	 int num;
	//int num; // 동일한 변수는 선언 불가
	 int Num; // 대소문자 구별하여 다른 변수로 취급
	//변수관례
	 int studentScore; // 두단어 이상으로 변수명을 만들경우 두번제 당어의 첫글자를 대문자로 한다 : 카멜[낙타]표기법
	 int a; // [x] 변수는 변수명을 보고 해당하는 역할을 알 수 있어야 한다.
	 num = 10; //항상 세미콜론 ; 으로 마무리해야함 10 = num [x]
	 //10 : 10*1 + 1*0 = 10
	 System.out.println("num = 10 : " +num);
	 		//""=문자열 "= 문자
	 num = 0x11;
	 //0x11 : 16*1 +1*1 =17
	 System.out.println("num = 0x11 :" +num); 
	 char ch = 'A';
	 System.out.println("ch = A :" +ch);
	 ch = '한';
	 System.out.println("ch = 한 :" +ch);
	 //boolean 변수확인예제
	 boolean isTrue = false;
	 System.out.println("isTrue = false :" +isTrue);
	 isTrue = true;
	 System.out.println("isTrue = true :" +isTrue);
	}

}
