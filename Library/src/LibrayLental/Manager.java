package LibrayLental;

import java.util.Scanner;

public class Manager implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("도서관 관리 프로그램");
            System.out.println("1. 도서 대여 및 반납");
            System.out.println("2. 관리자 메뉴");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                new MemberActive().start();
            } else if (choice == 2) {
                new Admin().start();
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
