package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// �迭 - ���� ������Ÿ���� �����Ͱ� ����Ǵ� ������ ���������� �Ǿ��ִ� ����
		
//		
//		int[] a= {10,20,30};
//		System.out.println(a[0]+"  "+a[1]);
//		
//		int b[]= {30,40,50};
//		System.out.println(Arrays.toString(b));
//		
//		int[] arr=new int[10];
//		// �迭�� ���� 10�� ����
//		int[] brr=new int[] {10,20,30,40};
//		
//		int size=15;
//    	int[] arr2=new int[size]; 
//    	
//    	System.out.println(arr2[0]);
//    	
    	// �迭 ���� ���
    	// ������Ÿ��[] �迭�̸� = new ������Ÿ��[�迭ũ��];
    	
//    	int[] money=new int[5]; //5���� intŸ�� ������ ���� �迭
//    	money[0]=5000;
//    	money[1]=12000;
//    	money[2]=4000;
//    	money[3]=43000;
//    	money[4]=50000;
//    	
//    	// 10000�̻��� �� ���
//    	for(int i=0; i<money.length; i++) {
//    		if(10000<=money[i]) {
//    		System.out.println(money[i]);
//    	}
//     }
    	
    	int[] A��=new int[3];
    	A��[0]=89;
    	A��[1]=78;
    	A��[2]=93;
    	
    	int[] B��=new int[3];
    	B��[0]=56;
    	B��[1]=84;
    	B��[2]=72;
    	
    	System.out.println("A�� ���� :" +Arrays.toString(A��));
    	System.out.println("B�� ���� :" +Arrays.toString(B��));
    	
    	// A��, B�� ���� �߿��� 80�� �̻� ���
    
    	for(int i=0; i<A��.length; i++){
    		if(A��[i]>=80)
    			System.out.println(A��[i]);
    		if(B��[i]>=80)
    			System.out.println(B��[i]);
    			
    		}
    		
    	int[] ���г�=new int[A��.length+B��.length];
    	
    	// �����ҹ迭, ��������ε���, �����ҹ迭, ������ġ�ε���, �?
    	System.arraycopy(A��,0,���г�,0,A��.length); // �迭 ����
    	System.arraycopy(B��,0,���г�,3,B��.length);
    	
    	for(int i=0; i<���г�.length; i++) {
    		if(���г�[i]>=80)
    			System.out.println(���г�[i]);
    
    	}
    	
    	Arrays.sort(���г�); //����
    	System.out.println(Arrays.toString(���г�));
    	
    	boolean same=Arrays.equals(A��, B��);
    	System.out.println("A��, B�� �迭�� ������?"+same);
    	
    	
//    	for(int i=0; i<A��.length; i++) {
//    		
//    		���г�[i] = A��[i];
//    		���г�[i+3]=B��[i];
//    		
//    	}
//    	
    	
    	
//    	for(int i=0; i<���г�.length; i++) {
//    		if(i<3)
//    		 ���г�[i]=A��[i];
//    	
//    		else 
//    		���г�[i]=B��[i-3];
//    		
    	}
    	
	
	
	}


