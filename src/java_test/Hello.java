package java_test;

public class Hello {

	public static void main(String[] args) {
//	    System.out.println("hello world");
//		System.out.println("안녕 세상");
//     	System.out.println("주석 사용중");
//		System.out.println("주석 사용중");
		
	    //변수 선언하기
	    int a = 10;
	    char b ='B';
	    int c; //변수만 먼저 선언하고 데이터는 나중에 저장한다
	    c=20;  // 변수에 데이터 저장
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	    a = 100;  //변수는 하나의 데이터만 저장 가능하다. 기존의 변수에 새로운 데이터 저장하면 기존 데이터 삭제된다.
	    System.out.println(a); //100으로 출력된다. 기존의 데이터 삭제 후 새로운 데이터 저장.
	    
	    int d,e,f;  //가독성이 떨어진다. 비추천한다.
	    d = 10;
	    e = 20;
	    f = 30;
//	    System.out.println(d);
//	    System.out.println(e);
//	    System.out.println(f);
	    
//	    int name;  //정상
//	    char student_Id; //정상 _ $는 사용가능
//	    int $funs; //$이름으로 사용가능, 맨 앞의 특수기호는 자제
//	    char false; //false는 자바의 키워드에 등록되어 있다.
//	    int null; //null 자바의 키워드에 등록되어 있다.
//	    int %calc; //이름에 %사용금지
	    
	    
//	    카멜 명명법
//	    주로 자바, 자바스크립에서 많이 사용되고 있는 이름 작성법
//	    변수 , 메서드, 클래스 등의 이름을 생성 시 사용하는 이름 작성법
//	    여러 개의 단어로 이루어진 이름을 생성 시 첫 번째 단어는 모두 소문자, 두번째 이후의 단어는
//	    첫 글자만 대문자, 나머지는 소문자로 입력.
	    
//	    변수는 첫단어 소문자, 두 번째 단어의 첫 글자는 대문자, 나머지는 소문자, 세번째 단어도
//	    두 번째 단어와 동일한 형태
//	    메서드 : 변수와 동일
//	    상수 : 모두 대문자로
//	    클래스 : 첫글자 대문자,나머지는 소문자
	    int helloWorld ="hello World";
	    int leageOfLegends="LEAGE OF LEGENDS";
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
