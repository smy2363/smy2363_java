package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> list = new ArrayList<>();
		list.add( new Asset("우리은행", 3450000 , "1004-91-123455" , "이순신" ) );
		list.add( new Asset("농협" , 513350 , "34-123-349393" , "김유신") );
		list.add( new Asset("신한은행" , 891003, "394-3412-2323" , "박팽년" ) );
		list.add( new Asset("국민은행" , 899900, "39-2384-19939" , "최무선") );
		list.add( new Asset("우리은행" , 28300, "1002-93-878888" , "문익점" ) );
		list.add( new Asset("신한은행" , 98000, "293-0123-1234" , "이율곡" ) );
		list.add( new Asset("우리은행" , 1920000, "1006-23-123456" , "김시민" ) );
		list.add( new Asset("국민은행" , 932000, "23-2555-29991" , "이율곡" ) );
		
		
		System.out.println("\n====우리은행 을 이용하는 사람====\n");
		for( Asset 우리 : list) {
			if( 우리.getBank().equals("우리은행") ) {
				System.out.println( 우리 );
			}
		}
		
		System.out.println("\n====잔액이 100만원 이상인  사람====\n");
		list.forEach( 백만 -> {
			if(백만.getBalance() >= 1000000) {
				System.out.println(백만);
			}
		}	
		);
	// list.forEach( a-> 실행코드 );
	// list.forEach(a -> { 실행코드; 실행코드; } );
		
		System.out.println("\n====최무선이  우리은행 계좌???  ====\n");             
		
		Asset asset = new Asset("우리은행", 0,"1007-23-128954","최무선");
		if(  !list.contains(asset)  ) {
			list.add(asset);
		}
		
		list.forEach( info -> System.out.println(info ));
		
	
	
	}

}
