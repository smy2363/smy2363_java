package LibrayLental;

import java.util.Scanner;

public class MemberActive implements ManagerActive {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("회원번호 입력: ");
        String memberId = scanner.nextLine();	

        if (checkMember(memberId)) {
            System.out.println("1. 대여");
            System.out.println("2. 반납");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                borrowBook(memberId);
            } else if (choice == 2) {
                returnBooks(memberId);
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        } else {
            System.out.println("올바른 회원번호가 아닙니다.");
        }
    }

    private boolean checkMember(String memberId) {
        // 회원번호 검증 로직 (간단히 항상 true로 설정)
        return true; 
    }

    private void borrowBook(String memberId) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 코드 입력: ");
        String bookCode = scanner.nextLine();
        // 대여 처리 
        System.out.println(bookCode + " 책 대여 완료");
    }

    private void returnBooks(String memberId) {
        // 반납 처리 
        System.out.println("대여 중인 모든 책 반납 완료");
    }
}
