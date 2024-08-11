package LibrayLental;

import java.util.Scanner;

public class Admin implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("���̵�: ");
        String adminId = scanner.nextLine();
        System.out.print("��й�ȣ: ");
        String adminPw = scanner.nextLine();

        if (validateAdmin(adminId, adminPw)) {
            adminMenu();
        } else {
            System.out.println("�ùٸ��� ���� ���̵� �Ǵ� ��й�ȣ�Դϴ�.");
        }
    }

    private boolean validateAdmin(String adminId, String adminPw) {
        // ������ ���� ����
        // ���÷� ������ admin, adminPass�� ����
        return adminId.equals("admin") && adminPw.equals("adminPass");
    }

    private void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������ �޴�");
            System.out.println("1. ���� ���");
            System.out.println("2. ���� ����");
            System.out.println("3. ���� ����");
            System.out.println("0. ����");
            System.out.print("�޴��� �����ϼ���: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                updateBook();
            } else if (choice == 3) {
                deleteBook();
            } else if (choice == 0) {
                System.out.println("������ �޴��� �����մϴ�.");
                break;
            } else {
                System.out.println("�߸��� �����Դϴ�.");
            }
        }
    }

    private void addBook() {
        // ���� ��� ����
        System.out.println("���� ��� �Ϸ�");
    }

    private void updateBook() {
        // ���� ���� ����
        System.out.println("���� ���� �Ϸ�");
    }

    private void deleteBook() {
        // ���� ���� ����
        System.out.println("���� ���� �Ϸ�");
    }
}

