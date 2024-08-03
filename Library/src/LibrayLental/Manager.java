package LibrayLental;

import java.util.Scanner;

public class Manager implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������ ���� ���α׷�");
            System.out.println("1. ���� �뿩 �� �ݳ�");
            System.out.println("2. ������ �޴�");
            System.out.println("0. ����");
            System.out.print("�޴��� �����ϼ���: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                new MemberActive().start();
            } else if (choice == 2) {
                new Admin().start();
            } else if (choice == 0) {
                System.out.println("���α׷��� �����մϴ�.");
                break;
            } else {
                System.out.println("�߸��� �����Դϴ�.");
            }
        }
    }
}
