package LibrayLental;

import java.util.Scanner;

public class Admin implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디: ");
        String adminId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String adminPw = scanner.nextLine();

        if (validateAdmin(adminId, adminPw)) {
            adminMenu();
        } else {
            System.out.println("올바르지 않은 아이디 또는 비밀번호입니다.");
        }
    }

    private boolean validateAdmin(String adminId, String adminPw) {
        // 관리자 인증 로직
        // 예시로 간단히 admin, adminPass로 설정
        return adminId.equals("admin") && adminPw.equals("adminPass");
    }

    private void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("관리자 메뉴");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                updateBook();
            } else if (choice == 3) {
                deleteBook();
            } else if (choice == 0) {
                System.out.println("관리자 메뉴를 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void addBook() {
        // 도서 등록 로직
        System.out.println("도서 등록 완료");
    }

    private void updateBook() {
        // 도서 수정 로직
        System.out.println("도서 수정 완료");
    }

    private void deleteBook() {
        // 도서 삭제 로직
        System.out.println("도서 삭제 완료");
    }
}

