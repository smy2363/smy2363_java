package homeWork0801;

import java.util.Scanner;

public class homework0801 {

	public static void main(String[] args) {
		
		/* String 메서드
		charAt(int index) - 특정 위치의 문자를 리턴/ 리턴타입 char
		equals(Object anObject) - 두 문자열을 비교 / 리턴타입 boolean
		getBytes() - byte[]로 리턴/ 리턴타입 byte[]
		getBytes(Charset charset) - 주어진 문자셋으로 인코딩한 byte[]로 리턴/리턴타입byte[]
		indexOf(String str) - 문자열 내에서 주어진 문자열의 위치를 리턴/ 리턴타입 int
		length() - 총 문자의 수를 리턴 / 리턴타입 int
		replace (CharSequence target, CharSequence replacement) - target부분을 replacement로 대치한
																	새로운 문자열을 리턴/ 리턴타입 String
		substring(int beginIndex) - beginIndex 위치에서 끝까지 잘라낸 새로운 문자열을 리턴/ 리턴타입 /String
		substring(int beginIndex, int endIndex) - beginIndex위치에서 endIndex 전까지 잘라낸
												새로운 문자열을 리턴합니다. /리턴타입 String
		toLowerCase() - 알파벳 소문자로 변환한 새로운 문자열을 리턴 / 리턴타입 String
		toUpperCase() - 알파벳 대문자로 변환한 새로운 문자열을 리턴/ 리턴타입 String
		trim() - 앞뒤 공백을 제거한 새로운 문자열을 리턴 / 리턴타입 String
		valueOf(int i), valueOf(double d) - 기본타입 값을 문자열로 리턴합니다. / 리턴타입 String															
		
		*/
		
		//charAt() 메소드는 매개값으로 주어진 인덱스의 문자를 리턴한다. (한글자만 선택가능/char로 리턴)
		String subject ="자바 프로그래밍";
		char c1=subject.charAt(0);
		char c2=subject.charAt(4);
		
		System.out.println(subject.charAt(3));
		System.out.println("첫번째 문자는 "+c1);
		System.out.println("네번째 문자는 "+c2);
	
		String str="abcde";
		char c=str.charAt(0);
		char c3=str.charAt(3);
		System.out.println(c);
		System.out.println(c3);
		
		String sto="가나다라 마바사아";
		char a=sto.charAt(3);
		char a2=sto.charAt(8);
		System.out.println(a);
		System.out.println(a2);
		
		String ppe="사과는 맛있어";
		char p=ppe.charAt(5);
		char p1=ppe.charAt(2);
		System.out.println(p);
		System.out.println(p1);
		
		String bana="바나나는 너무너무 맛있어";
		char ba=bana.charAt(7);
		char ba1=bana.charAt(10);
		System.out.println(ba);
		System.out.println(ba1);
		
		String sr="Hello, World";
		
		char d=sr.charAt(0);
		System.out.println(d);
		
		char e=sr.charAt(2);
		System.out.println(e);
		
		char f=sr.charAt(4);
		System.out.println(f);
		
		String bb="사과와 바나나중 어떤게 맛있을까?";
		char r=bb.charAt(5);
		char r1=bb.charAt(9);
		char r2=bb.charAt(13);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		
		String text="프로그래밍 언어 자바";
		char charvalue=text.charAt(6);
		System.out.println(charvalue);

		//equals(Object anObject) - 두 문자열을 비교 / 리턴타입 boolean
		//문자열 비교시 연산자를 꼭 사용해야한다. 
		
		String strVar1=new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		String str1="Strong";
		String str2="Strong";
		String str3=new String("Strong");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3); //주소값이 달라서 false 리턴/그래서 equals를 사용해야함
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3)); //주소값이 달라도 문자열 내용이 같아서 true
		
		String tr1="abc";
		String tr2=tr1;
		String tr3=new String("abc");
		
		System.out.println(tr1==tr2);
		System.out.println(tr1.equals(tr3));
		
		
		//getBytes()- byte[]로 리턴/ 리턴타입 byte[] 문자열을 바이트 배열로 변환할때사용
		//byte[] bytes="문자열".getBytes();
		// 주어진 문자셋으로 인코딩한 byte[]로 리턴
		//byte[] bytes="문자열".getByte(Charset charset);
		
//		try {
//			byte[] bytes1 = "문자열".getBytes("EUC-KR");
//			byte[] bytes2 = "문자열".getBytes("UTF-8");
//		}catch(UnsupportedEncodingException e) {
//			
//		}
		
		//String str = new String(byte[]byte, String charsetName);
		
		//indexOf(String str) - 문자열 내에서 주어진 문자열의 위치를 리턴/ 리턴타입 int
		// 문자열이 포함되어있지않으면 -1을 반환함
		
		String subject2="자바 프로그래밍";
		int index = subject2.indexOf("프로그래밍");
		
		if(subject.indexOf("프로그래밍") != -1) {
			System.out.println("포함되어있음");
		}else {
			System.out.println("포함되어있지 않음");
		}
		
		String jaana="바나나 맛있어";
		if(jaana.indexOf("바나") != -1) {
			System.out.println("포함되어있음");
		}else {
			System.out.println("포함안됨");
		}
		
		String str5="Hello, world!";
		int position = str5.indexOf('o');
		System.out.println("위치는?"+position);
		
		String bla="사과는 상큼해";
		int bla2=bla.indexOf("큼");
		System.out.println("위치는?"+bla2);
		
		
		//length() - 총 문자의 수를 리턴 / 리턴타입 int
		//문자열의 길이 많은 문자일때 문자수 확인//비밀번호 길이, 배일의길이확인
		
		String sub="자바 프로그래밍";
		System.out.println(sub.length());
		
		String su="ㄴㄹㅇㄴ러ㅏㄴㅇ리ㅏㅓ니ㅏㄹ어";
		System.out.println(su.length());
		
		//replace (CharSequence target, CharSequence replacement) - target부분을 replacement로 대치한
		//새로운 문자열을 리턴/ 리턴타입 String/ 문자열 바꾸기(대치), 사용자 입력 검증 및 필터링, 변수 치환
		
	String oldStr="자바 프로그래밍";
	String newStr=oldStr.replace("자바","JAVA");
	System.out.println(newStr);
	
	String rice="맛있는 밥버거";
	String newrice=rice.replace("밥버거","bobbob");
	System.out.println(newrice);
	
	String lemon="레몬은 너무 시다";
	String lemon2=lemon.replace("레몬은","키위는");
	System.out.println(lemon2);
	
	
	//substring(int beginIndex) - beginIndex 위치에서 끝까지 잘라낸 새로운 문자열을 리턴/ 리턴타입 /String
	//substring(int beginIndex, int endIndex) - beginIndex위치에서 endIndex 전까지 잘라낸
	//문자열 잘라내기 도메인추출, 전화번호 형식변환, 로그파일에서 날짜및 시간추출, 이름과 성 추출, 데이터 분석및 파싱
	
	String ssn="880815-1234567";
	String firstNum=ssn.substring(0,6); //0~6빼고 전부 자르는것
	String secondNum=ssn.substring(7);	// 7부터는 전부표기되고 그전은 전부 자르는것
	
	System.out.println(firstNum);
	System.out.println(secondNum);
	
	String ori="사과는 매일먹어도 맛있네";
	String fir=ori.substring(0,8); //0~8까지 보임
	String sec=ori.substring(9); //9까지 안보임 10부터보임
	System.out.println(fir);
	System.out.println(sec);
	
	String rara="랄랄라 너무나 맛있는 간식";
	String ra1=rara.substring(0,8); //0~8까지보임
	String ra2=rara.substring(8); //8까지 안보임 9부터 보임
	System.out.println(ra1);
	System.out.println(ra2);
	
	//toLowerCase() - 알파벳 소문자로 변환한 새로운 문자열을 리턴 / 리턴타입 String
	//toUpperCase() - 알파벳 대문자로 변환한 새로운 문자열을 리턴/ 리턴타입 String
	
	String original="Java Programming";
	String lowerCase=original.toLowerCase(); //전부 소문자로변환
	String upperCase = original.toUpperCase(); //전부 대문자로 변환
	System.out.println(lowerCase);
	System.out.println(upperCase);
	
	
	String val="SdkslfjASDFDF";
	String vla2=val.toLowerCase();
	String vla3=val.toUpperCase();
	System.out.println(vla2);
	System.out.println(vla3);
	
	String name="AaaBbb";
	
	String nameUp;
	String nameLo;
	nameUp=name.toUpperCase();
	nameLo=name.toLowerCase();
	
	System.out.println("대문자"+ nameUp);
	System.out.println("소문자"+nameLo);
	

	        // 원본 문자열
	        String original1 = "aBBdddAA";
	        // 변환된 문자열을 저장할 변수
	        String converted = "";

	        // 원본 문자열의 각 문자를 하나씩 확인
	        for (int i = 0; i < original1.length(); i++) {
	            char currentChar = original1.charAt(i); // 현재 문자

	            // 소문자인 경우 대문자로 변환
	            if (currentChar >= 'a' && currentChar <= 'z') {
	                converted += (char)(currentChar - ('a' - 'A'));
	            }
	            // 대문자인 경우 소문자로 변환
	            else if (currentChar >= 'A' && currentChar <= 'Z') {
	                converted += (char)(currentChar + ('a' - 'A'));
	            }
	        }

	        // 결과 출력
	        System.out.println("Original: " + original1);
	        System.out.println("Converted: " + converted);
	        
	        
	        //trim() - 앞뒤 공백을 제거한 새로운 문자열을 리턴 / 리턴타입 String
	        //replace로 없어도 됨
	        
	        String trr=" Hi Anna!  ";
	        String stripTrr=trr.strip();
	        System.out.println(stripTrr);
	        System.out.println(trr.replace(" ",""));
	    
	      // valueOf(int i), valueOf(double d) - 기본타입 값을 문자열로 리턴합니다. / 리턴타입 String	
	        
	       
	        int int1=1234;
	        int int2=-1234;
	        
	        String st1=String.valueOf(int1);
	        String st2=String.valueOf(int2);
	        System.out.println("String sr1 :" + st1);
	        System.out.println("String sr2 :" + st2);
	        
	        
	
	        
	    }


	}

	




