<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- cook.jsp --%>

<%
	//  form으로 전달받은 전송해준 데이터 받기(파라미터)
	//  데이터 받아서 food, price, rest 라는 name으로 쿠키에 저장하기
	// 만료시간은 1시간 10분으로 설정
	
	
	request.setCharacterEncoding("UTF-8");
	
	String food=request.getParameter("food");
	String price=request.getParameter("price");
	String rest=request.getParameter("rest");
	
	// 기존 쿠키가 존재한다면 가져와서 새로입력한 값과 합치기
	Cookie[] cooks = request.getCookies();
	for(Cookie cook:cooks){
		if(cook.getName().equals("food")) food=cook.getValue()+"-"+food;
		if(cook.getName().equals("price")) price=cook.getValue()+"-"+price;
		if(cook.getName().equals("rest")) rest=cook.getValue()+"-"+rest;
	}
	
	
	Cookie food_cook = new Cookie("food",food);
	Cookie price_cook = new Cookie("price",price);
	Cookie rest_cook = new Cookie("rest",rest);
	
	food_cook.setMaxAge(4200);
	price_cook.setMaxAge(4200);
	rest_cook.setMaxAge(4200);
	
	response.addCookie(food_cook);
	response.addCookie(price_cook);
	response.addCookie(rest_cook);
	
	response.sendRedirect("cook_read.jsp");
	

%>





<%
	// 쿠키의 종류
	// 세션 쿠키 - 세션처럼 정해진 기간없이 클라이언트가 연결을 끊으면 삭제된다.
	// 영구 쿠기 - 기간이 정해져있는 쿠키
	// 인증 쿠키 - 사용자 정보를 저장하고 있는 쿠키, 로그인유지
	// 추적 쿠키 - 사용자가 브라우저에서의 활동을 기록하는 쿠키
	// 좀비 쿠키 - 쿠키가 삭제된후에 다시 생성된다.

	
	// 웹 서버에서 쿠키를 생성
// 	Cookie ck=new Cookie("name", "이순신");
	//ck.setMaxAge(3600); // 초단위 설정

	// 생성된 쿠키글 클라이언트에게 전송
	//response.addCookie(ck);
	
	// 웹 서버에서 쿠키 삭제하는 방법
	// 클라이언트 쿠키 가져오기
// 	Cookie[] cooks= request.getCookies();
	
// 	for(Cookie c: cooks){
// 		if(c.getName().equals("name") ){
// 			c.setMaxAge(0);
// 			response.addCookie(c); // 쿠키의 만료시간을 0으로 변경하고 클라이언트에게 전송
// 			break;
// 		}
// 	}
	
	
	
%>  	