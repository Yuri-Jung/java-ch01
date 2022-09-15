package java_test;

public class Java_ch2 {

	public static void main(String[] args) {
		System.out.println("정상실행");
		
//		여러가지 데이터 타입으로 변수 선언
//		기본 타입 : boolean(논리형), char(문자형), byte(정수), short, int(기본값), long, float(실수형), double(실수형 기본값)
//		레퍼런스 타입 : class, array, String(문자열형)
		
		boolean flagA = true; //TRUE false이런거만 써야 한다. 숫자,문자 노노
		boolean flagB = false;
		System.out.println(flagA);
		System.out.println(flagB);
		
		char charA = 'A';  //문자 한 글자만 넣는 거 가능. ABCD이렇게 쓰면 안된다.
		char charB = 'B';
		System.out.println(charA);
		System.out.println(charB);
		charA ='한';
		System.out.println(charA);
		charB = '\uae00'; //한 글이라고 출력이 된다. 유니코드 아스키코드
		System.out.println(charB);
		
		byte byteA = 100;
		short shortA = 100;
		int intA= 100;
		long longA = 100L; //long 타입이 정수의 기본 데이터 타입인
//		int형 보다 크기가 크기 때문에 데이터를 저장할 경우 int형과의 구분을
//		위해서 데이터 뒤에 반드시 L을 붙여서 사용
		System.out.println(byteA);
		System.out.println(shortA);
		System.out.println(intA);
		System.out.println(longA);
		
		float floatA =3.14F;
//		float 타입은 실수형 기본 데이터 타입인 double형과의 구분을 위해 데이터 뒤에 f붙여 사용
		double doubleA = 3.14;
		System.out.println(floatA);
		System.out.println(doubleA);
		
//		String : 래퍼런스 타입의 데이터 타입
//		주로 문자열을 저장하기 위한 데이터 타입으로 아주 많이 사용되기 때문에 기본 타입처럼 사용가능.
//		이스케이프 문자와 함께 사용할 수 있음
//		'+'기호를 사용하여 문자열 연산(연결)이 가능
		String strA ="문자열 데이터 타입";
		String strB = "문자열 저장하기 위한 클래스 타입";
		String strC = "편의를 위해 기본 데이터 타입처럼 사용";
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(strC);
		
//		이스케이프 문자 : 문자열 내에서 특수한 기능을 사용하기 위한 문자
//		\n : 줄바꿈
//		\t : tab 사용한 것과 동일한 효과
//		\"" : 문자열 내에서 "를 표시
//	     \' : 문자열 내에서 ' 표시
//		 \\ : 문자열 내에서 \표시
		
		String str1 = "이스케이프 \n 문\t자 사용하기";
		System.out.println(str1);
		
		System.out.println("문자열 내에서 작은 따옴표 출력'''''");
//		문자열은 큰 따옴표로 감싸고 문자는 작은 따옴표로 감싸여진다 
		char char1 = '\''; //작은 따옴표 한 개만 출력되게 
//		문자로써의 작은 따옴표를 저장 / 출력하고자 하는 경우 \'사용한다.
		System.out.println(char1);
		
//		문자로써의 큰 따옴표를 저장/출력하고자 할 경우 \"
		System.out.println("\""); //(""")출력 불가능=> \"
//		문자로써의 역슬레쉬를 저장 혹은 출력하고자 할 경우 \\사용한다.
		System.out.println("문자로써의 \\를 출력");
//		\만 사용하면 안된다. \는 이스케이프문자 시작할 때 사용한다. 그걸로 인식하기 때문에 오류난다.
		
		String strOri = new String("원래는 이렇게 사용");
		System.out.println(strOri);
		String strCur = "그냥 이렇게 사용";
		System.out.println(strCur);
	}

}
