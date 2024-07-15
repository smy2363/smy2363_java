package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{
	private int balance; //�ܾ�
	private static String bankName = "�踲Bank";
	public BankAccount(int balance) { // ������ �޼���
		this.balance=balance;
	}
	public void showBalance() { // �ܾ� Ȯ�� �޼���
		System.out.println("���� �ܾ� : "+balance);
	}
	
	//�ν��Ͻ� ���� Ŭ����
	class Transaction{ // �ŷ� - �Ա�, ���
		void deposit(int amount) {
			balance = balance + amount;
			System.out.println("�Ա� �ݾ� : "+amount);
		}
		void withdraw(int amount) {
			if(balance >= amount) {
				balance = balance - amount;
				System.out.println("��� �ݾ� : "+amount);
			}else {
				// ��ݾ��� �����ϴٸ�
				System.out.println("�ܾ� ����! ��� �Ұ�");
			}
		}
	}
	
	//���� ���� Ŭ����
	static class BankInfo{
		void showBankName() {
			System.out.println("���� �̸� : " +bankName);
		}
	}
	
	//���� ���� Ŭ����
	public void applyLoan(int amount) { // ���� ��û
		class Loan{ // ���� ����Ŭ���� - ����
			void progress() {
				System.out.println("���� ��û �ݾ� : " + amount);
			}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	// �͸� ���� Ŭ����
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int)(balance*0.03);
				balance += interestMoney;
				System.out.println("���� ���� : " +interestMoney);
			}
		};
		
		interest.run();
	}
	
}


public class InnerClass2 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(3000000);
		account.showBalance();
		
		BankAccount.Transaction tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		
		//���� ����Ŭ���� ��ü ����
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		//���� ����Ŭ���� ���
		account.applyLoan(4000000);
		
		//�͸� ����Ŭ���� ���
		account.interestCalc();
	}

}

/*
	Ŭ���� : BankAccount;
	BankAccount ����Ŭ���� -> 
		�ν��Ͻ����� Ŭ���� : Transaction (�ŷ�)
		���� ���� Ŭ���� : BankInfo(��������)
		���� ���� Ŭ���� : Loan (����)
		�͸� ���� Ŭ���� : Runnable(���ڰ��) 
*/