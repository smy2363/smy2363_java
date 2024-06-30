package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		// 반복문 - for, while, do~while
		// for(초기값; 조건식; 증감식){반복내용}
		// 조건식이 거짓이 될때까지 중괄호안의 내용이 계속 실행된다.
		// 초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식
		// -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 ->
		// -> 조건식 비교 -> 거짓이라면 -> 끝

//		for(int i=1; i<=17; i+=2) {
//			System.out.println("아... 반복문...."+i);
//			}
//		
//		for(int i=1; i<=17; i++) {
//			System.out.println("아... 반복문...."+i);
//			i++;
//			}
//		
//		for(int i=1; i<10; i++) {
//			System.out.println("아... 반복문...."+((2*i)-1));
//			i++;
//			}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
////		
//		int num=1;
//		int a=1;
//		
//		num=num+a;
//		System.out.println(num); // 2
//		a++;
//		
//		num=num+a;
//		System.out.println(num); // 4
//		a++;
//		
//		num=num+a;
//		System.out.println(num); // 7
//		a++;
//		
//		int num=1;
//		
//		for(int a=1; a<=5; a++) {
//		num+=a;
//		System.out.println(num);
//		}
		
		//1부터 내가 입력한 숫자까지의 총합을 구하세요


		
//		int num1;
//		
//		System.out.printf("숫자를 입력하세요 :");
//		num1=scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=num1; i++)
//		{sum =sum+i;
//			System.out.println("총합: "+sum);
//		}
//		
		
//		for(int i=1;true; i++) {
//			if(i>6)break;
//			System.out.println("무한루프");
//		}
		
		// 반복문은 작성하려면 몇번 반복되는가, 언제 반복문이 종료되어야 하는가
		// 반복문 종료시점에 대해서 먼저 생각해야 한다.
		// for문, while문, do~while 문 모두 언제 반복이 끝나야하는가를 
		// 찾지못하면 작성할 수 없다.(무한루프이든, n번 반복이든)
		
//		int num1=-1;
//		for(;num1!=0;) {
//			System.out.printf("정수 입력 : ");
//			 num1=scan.nextInt();
//		}
		

//		for(;true;) {
//			System.out.printf("정수 입력 : ");
//			 int num=scan.nextInt();
//			 if(num==0)break;
//		}
//		

//		for(;true;) {
//			System.out.printf("정수 입력 : ");
//			 int num=scan.nextInt();
//			 if(num==0)return;
//		}
		
		
		//무한루프 종료시키는방법
		//1. if문의 조건식이 참이되면  break  실행
		//2. for(;조건식;)
		//3. return; - 반복문코드가 있는 메서드를 종료시키기때문에
		//			   반복문도 종료된다.
		// break; - 반복문, switch 사용가능
		// 			if문 단독으로는 break사용 불가
		//if(10>5)break; 이거 오류!! (조건없이 사용했기때문에)
		
		// continue; 
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"번째 반복 시작");
//			if(i%3==0)continue;
//			System.out.println(i+"번째 반복 진행중");
//			System.out.println(i+"번째 반복 마지막내용");
//		}
//		
//		
//		// 자바의 랜덤
//		int random=(int)Math.floor(Math.random()*50)+1;
	
		// 랜덤의 범위(1~50)
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수일경우 반복문 종료
		
//		for(;true;) {
////			int random1=(int)Math.floor(Math.random()*50)+1;
////			double random1=Math.floor(Math.random()*50)+1;
////			int random1=Interger.parseInt(Math.random()*50)+1;
//			int random1=(int)(Math.random()*50)+1;
//			if(random1 %11 == 0)break;
//			
//			System.out.println(random1);
//		}
//		
		
		// up & down 만들기
		// 컴퓨터가 제시한 숫자 맞추기
		// 컴퓨터제시하는 숫자는 랜덤으로(랜덤범위 20~100)
		// 컴퓨터가 제시한 숫자가 74 라면
		// 내가 입력한 숫자가 40일 경우  up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
		
		

//		int com=(int)(Math.random()*81)+20;
//		for(;true;) {
//			int user=scan.nextInt();
//			System.out.println("숫자를 적으세요:"+user);
//			if(com>user) {
//				System.out.println("Up!!");
//			}else if(com==user){
//				System.out.println("정답");
//				break;
//			}else{
//				System.out.println("Down!!");}
//				
//			}
//		 }
//	

		//이름이 있는 반복문
//		int sum=0;
//		
//		 더하기:for(int i=1;i<=10; i++) {
//			 for(int k=1; k<=4;k++) {
//			if(sum+k>=40)break 더하기;
//			sum=sum+k;
//			System.out.println(i+"  "+k);
//			 }
//			System.out.println(i); 
//		    sum=sum+i;
//		 }
//		 if(sum<40) {	
//			System.out.println("sum 출력: "+ sum);
//		}
//		 
		 
		// 베스킨라빈스 31
		// 컴퓨터와 나하고 둘이 한다.
		// 한번에 제시할 수 있는 숫자는 최소 1개, 최대 3개
		// 31을 입력하면 패배
		
		
		int num=1;
		
		베스킨:
		for(;;) {
			System.out.println("숫자 몇개: ");
			int user=scan.nextInt();
			System.out.print("나 : ");
			for(int u=1;u<=user; u++) {
				System.out.print(num+"  "  );
				if(num==31) break 베스킨;
				num++;
			}

			int com=(int)(Math.random()*3)+1;
			System.out.print("com : ");
			for(int c=1;c<=com;c++) {
				System.out.print(num + " ");
				if(num==31) break 베스킨;
				num++;
			}
			System.out.println();
		}
		
		
		
		
	}
}

	

