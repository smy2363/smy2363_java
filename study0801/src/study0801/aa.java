package study0801;


public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num=new int[] {10,20,30,40,50,60};
		
		
		for(int i=0; i<num.length;i++) {
			
			System.out.println(num[i]);
		}
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		for(int i=15; i<=79; i++) {
			System.out.println(i);
		}
		
		for(int i=21; i<=32; i++) {
			System.out.println(i);
		}
		
		for(int i=1; i<=15; i++) {

			if (i==7) {
				System.out.println("확인");
			}else if(i==10) {
				System.out.println("정답");
			}else if(i==12) {
				System.out.println("실패");
			}else{
				System.out.println(i);
			}
		}
		
		
		int num1=5;
		int num2=10;
		
		if(num1<num2) {
			System.out.println(num1);
		}else  {
			System.out.println(num2);
		}
		
	book bo=new book();
	
	bo.title="나는자연인";
	bo.page=598;
	
	System.out.println(bo.title);
	System.out.println(bo.page);
	
	int 게시글=20;
	if(게시글>=10) {
		System.out.println("등업");
	}else{
		System.out.println("등업실패");
	}
	
	int 글갯수=6;
	int 댓글=3;
	if((글갯수>=5)&&(댓글>=5)) {
		System.out.println("등업");
	}else {
		System.out.println("등업실패");
	}
	
	Movie mo=new Movie();
	Movie mo1= new Movie();
	
	mo.setTitle("사람");
	
	mo.setDic("모모");
	mo.setYear(2092);
	
	mo1.setTitle("마음");
	mo1.setDic("치즈");
	mo1.setYear(2002);
	
	if(mo.getYear()<mo1.getYear()) {
		System.out.println(mo);
	}else {
		System.out.println(mo1);
	}
	
	
	
	
	
		
	}

}
