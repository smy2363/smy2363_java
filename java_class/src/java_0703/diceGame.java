package java_0703;

import java.util.Scanner;

public class diceGame {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
	/*
	 	�ֻ��� ���� (����)
	 
	 j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
	 �ֻ����� �ϳ�, �����̴�.
	 �ֻ����� ���� ū ����� �̱��.
	 
	 �ֻ��� �� ���ϴ� �޼���
	 
	 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
	  
	  
	 */
		Dice dice=new Dice();
		
		int j����Dice=dice.random();
		int s����Dice=dice.random();
		
		
		System.out.println("j������ �ֻ��� ���� ? :"+j����Dice);
		System.out.println("s������ �ֻ��� ���� ? :"+s����Dice);
		dice.jDice(j����Dice,s����Dice);
		
	}

}

class Dice{
	
	int random() {
		int randomdice=(int)(Math.random()*6)+1;
		return randomdice;
	    }
	
	void jDice(int j����Dice, int s����Dice) {
		if(j����Dice > s����Dice) {
			System.out.println("j������ �¸�!!!");
		}else if(j����Dice < s����Dice){
			System.out.println("s������ �¸�!!!");
		}else {
			System.out.println("���º�!!!");
		}
	}
		
	
}

