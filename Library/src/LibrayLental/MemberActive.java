package LibrayLental;

import java.util.Scanner;

public class MemberActive implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ȸ����ȣ �Է�: ");
        String memberId = scanner.nextLine();	

        if (checkMember(memberId)) {
            System.out.println("1. �뿩");
            System.out.println("2. �ݳ�");
            System.out.print("�޴��� �����ϼ���: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                borrowBook(memberId);
            } else if (choice == 2) {
                returnBooks(memberId);
            } else {
                System.out.println("�߸��� �����Դϴ�.");
            }
        } else {
            System.out.println("�ùٸ� ȸ����ȣ�� �ƴմϴ�.");
        }
    }

    private boolean checkMember(String memberId) {
        // ȸ����ȣ ���� ���� (������ �׻� true�� ����)
        return true; 
    }

    private void borrowBook(String memberId) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("å �ڵ� �Է�: ");
        String bookCode = scanner.nextLine();
        // �뿩 ó�� 
        System.out.println(bookCode + " å �뿩 �Ϸ�");
    }

    private void returnBooks(String memberId) {
        // �ݳ� ó�� 
        System.out.println("�뿩 ���� ��� å �ݳ� �Ϸ�");
    }
}
