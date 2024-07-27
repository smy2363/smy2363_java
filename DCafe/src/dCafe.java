import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cafe.Drink;
import cafe.Member;
import cafe.Reservation;
import cafe.Robot;
import cafe.Table;



public class dCafe {
static Map<Integer, Table> ta = new HashMap<>();   // 테이블 관리
static Map<String, Member> mem = new HashMap<>();  // 멤버 관리
static Map<String, Reservation> res = new HashMap<>(); // 예약 관리
static Map<String, Drink> dr = new HashMap<>();    // 음료 관리


    public static void main(String[] args) {

    	
    	
    	// 초기 데이터 설정
    	initializeData();
        Scanner scanner = new Scanner(System.in);

        // 멤버 등록
        System.out.println("이름을 적어주세요 : "); // 사용자에게 이름 입력 요청
        String name = scanner.nextLine(); // 사용자가 입력한 이름 저장
        System.out.println("전화번호를 적어주세요 : "); // 사용자에게 전화번호 입력 요청
        String phoneNumber = scanner.nextLine(); // 사용자가 입력한 전화번호 저장
        Member member = new Member(name, phoneNumber); // 입력된 이름과 전화번호로 새로운 멤버 객체 생성
        mem.put(phoneNumber, member); // 멤버를 해시맵에 저장

        // 예약 생성
        System.out.println("원하는 예약시간을 적어주세요:"); // 예약 시간을 입력받음
        String time = scanner.nextLine(); // 사용자가 입력한 예약 시간 저장
        System.out.println("주문할 음료를 적어주세요:"); // 주문할 음료 입력받음
        String drinkName = scanner.nextLine(); // 사용자가 입력한 음료 이름 저장

        // 음료 확인
        if (!dr.containsKey(drinkName)) { // 입력된 음료가 음료 목록에 없으면
            System.out.println("원하시는 음료가 없습니다"); // 음료가 없다고 알림
            return; // 프로그램 종료
        }

        // 이용 가능한 테이블 찾기
        int tableNumber = findAvailableTable(); // 이용 가능한 테이블 찾기
        if (tableNumber == -1) { // 이용 가능한 테이블이 없으면
            System.out.println("이용가능한 테이블이 없습니다."); // 이용가능한 테이블이 없다고 알림
            return; // 프로그램 종료
        }

        // 테이블 예약 설정 및 예약 저장
        Table table = ta.get(tableNumber); // 테이블 객체 가져오기
        table.setReserved(true); // 테이블을 예약된 상태로 변경
        Reservation reservation = new Reservation(time, tableNumber, drinkName, phoneNumber, false); // 예약 정보로 새로운 예약 객체 생성
        res.put(phoneNumber, reservation); // 예약을 해시맵에 저장

        System.out.println("전화번호 " + phoneNumber + " 으로 " + time + " 시에 " + drinkName + " 음료로 예약되었습니다. 테이블 번호는 " + tableNumber+"번입니다");

        // 체크인
        System.out.println("체크인할 전화번호를 입력하세요"); // 체크인 시 전화번호 입력 요청
        phoneNumber = scanner.nextLine(); // 사용자가 입력한 전화번호 저장

        // 예약 확인 및 체크인 메시지 출력
        if (res.containsKey(phoneNumber)) { // 입력된 전화번호로 예약이 있으면
            Reservation reservation1 = res.get(phoneNumber); // 예약 객체 가져오기
            System.out.println("환영합니다, " + phoneNumber + "! 주문하신 음료 (" + reservation1.getDrinkPick() + ") 가 준비됩니다.");

            // 음료 준비 및 배달
            Robot robot = new Robot(); // 로봇 객체 생성
            Drink drink = dr.get(reservation1.getDrinkPick()); // 예약된 음료 객체 가져오기
            robot.serving(drink, reservation1.getTableNumber()); // 로봇이 음료를 배달하도록 함
        } else {
            System.out.println("해당전화번호로 예약이 없습니다. " + phoneNumber); // 예약이 없다고 알림
        }

        scanner.close(); // 스캐너 닫기
    }

    // 초기 데이터 설정
    private static void initializeData() {
        // 테이블 초기화
        for (int i = 1; i <= 10; i++) { // 1부터 10까지의 숫자를 순회하며
            ta.put(i, new Table(i)); // 각 숫자(i)를 테이블 번호로 하는 새로운 테이블 객체를 생성하여 해시맵에 추가
        }

        // 음료 초기화
        dr.put("아메리카노", new Drink("아메리카노", 3000)); // 커피 음료를 해시맵에 추가
        dr.put("카페라떼", new Drink("카페라떼", 3500)); // 차 음료를 해시맵에 추가
        dr.put("오렌지쥬스", new Drink("오렌지쥬스", 4000)); // 주스 음료를 해시맵에 추가
        dr.put("우유", new Drink("우유", 3000)); // 우유 음료를 해시맵에 추가
        dr.put("복숭아 아이스티", new Drink("복숭아아이스티", 3000)); // 아이스티 음료를 해시맵에 추가
    }

    // 이용 가능한 테이블 찾기
    private static int findAvailableTable() {
        for (Table table : ta.values()) { // 모든 테이블을 순회하며
            if (!table.isReserved()) { // 예약되지 않은 테이블을 찾음
                return table.getTableNumber(); // 예약되지 않은 테이블 번호 반환
            }
        }
        return -1; // 이용 가능한 테이블이 없을 때
    }
}
