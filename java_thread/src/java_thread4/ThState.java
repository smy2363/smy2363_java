package java_thread4;

public enum ThState {
	
	NEW, RUNNABLE, BLOCKED,
	WATING, TIMED_WATING,
	TERMINATED

}

/*

 	상수들의 클래스처럼 사용할 수 있는 방법 - Enum
 	
  	<자바>
 	final int num=20;
 	num=30; 오류
 
 
 	<자바스크립트>
	const num=10;
	num=30;  오류



*/
