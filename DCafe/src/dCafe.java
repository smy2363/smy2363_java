import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cafe.Drink;
import cafe.Member;
import cafe.Reservation;
import cafe.Robot;
import cafe.Table;



public class dCafe {
static Map<Integer, Table> ta = new HashMap<>();   // ���̺� ����
static Map<String, Member> mem = new HashMap<>();  // ��� ����
static Map<String, Reservation> res = new HashMap<>(); // ���� ����
static Map<String, Drink> dr = new HashMap<>();    // ���� ����


    public static void main(String[] args) {

    	
    	
    	// �ʱ� ������ ����
    	initializeData();
        Scanner scanner = new Scanner(System.in);

        // ��� ���
        System.out.println("�̸��� �����ּ��� : "); // ����ڿ��� �̸� �Է� ��û
        String name = scanner.nextLine(); // ����ڰ� �Է��� �̸� ����
        System.out.println("��ȭ��ȣ�� �����ּ��� : "); // ����ڿ��� ��ȭ��ȣ �Է� ��û
        String phoneNumber = scanner.nextLine(); // ����ڰ� �Է��� ��ȭ��ȣ ����
        Member member = new Member(name, phoneNumber); // �Էµ� �̸��� ��ȭ��ȣ�� ���ο� ��� ��ü ����
        mem.put(phoneNumber, member); // ����� �ؽøʿ� ����

        // ���� ����
        System.out.println("���ϴ� ����ð��� �����ּ���:"); // ���� �ð��� �Է¹���
        String time = scanner.nextLine(); // ����ڰ� �Է��� ���� �ð� ����
        System.out.println("�ֹ��� ���Ḧ �����ּ���:"); // �ֹ��� ���� �Է¹���
        String drinkName = scanner.nextLine(); // ����ڰ� �Է��� ���� �̸� ����

        // ���� Ȯ��
        if (!dr.containsKey(drinkName)) { // �Էµ� ���ᰡ ���� ��Ͽ� ������
            System.out.println("���Ͻô� ���ᰡ �����ϴ�"); // ���ᰡ ���ٰ� �˸�
            return; // ���α׷� ����
        }

        // �̿� ������ ���̺� ã��
        int tableNumber = findAvailableTable(); // �̿� ������ ���̺� ã��
        if (tableNumber == -1) { // �̿� ������ ���̺��� ������
            System.out.println("�̿밡���� ���̺��� �����ϴ�."); // �̿밡���� ���̺��� ���ٰ� �˸�
            return; // ���α׷� ����
        }

        // ���̺� ���� ���� �� ���� ����
        Table table = ta.get(tableNumber); // ���̺� ��ü ��������
        table.setReserved(true); // ���̺��� ����� ���·� ����
        Reservation reservation = new Reservation(time, tableNumber, drinkName, phoneNumber, false); // ���� ������ ���ο� ���� ��ü ����
        res.put(phoneNumber, reservation); // ������ �ؽøʿ� ����

        System.out.println("��ȭ��ȣ " + phoneNumber + " ���� " + time + " �ÿ� " + drinkName + " ����� ����Ǿ����ϴ�. ���̺� ��ȣ�� " + tableNumber+"���Դϴ�");

        // üũ��
        System.out.println("üũ���� ��ȭ��ȣ�� �Է��ϼ���"); // üũ�� �� ��ȭ��ȣ �Է� ��û
        phoneNumber = scanner.nextLine(); // ����ڰ� �Է��� ��ȭ��ȣ ����

        // ���� Ȯ�� �� üũ�� �޽��� ���
        if (res.containsKey(phoneNumber)) { // �Էµ� ��ȭ��ȣ�� ������ ������
            Reservation reservation1 = res.get(phoneNumber); // ���� ��ü ��������
            System.out.println("ȯ���մϴ�, " + phoneNumber + "! �ֹ��Ͻ� ���� (" + reservation1.getDrinkPick() + ") �� �غ�˴ϴ�.");

            // ���� �غ� �� ���
            Robot robot = new Robot(); // �κ� ��ü ����
            Drink drink = dr.get(reservation1.getDrinkPick()); // ����� ���� ��ü ��������
            robot.serving(drink, reservation1.getTableNumber()); // �κ��� ���Ḧ ����ϵ��� ��
        } else {
            System.out.println("�ش���ȭ��ȣ�� ������ �����ϴ�. " + phoneNumber); // ������ ���ٰ� �˸�
        }

        scanner.close(); // ��ĳ�� �ݱ�
    }

    // �ʱ� ������ ����
    private static void initializeData() {
        // ���̺� �ʱ�ȭ
        for (int i = 1; i <= 10; i++) { // 1���� 10������ ���ڸ� ��ȸ�ϸ�
            ta.put(i, new Table(i)); // �� ����(i)�� ���̺� ��ȣ�� �ϴ� ���ο� ���̺� ��ü�� �����Ͽ� �ؽøʿ� �߰�
        }

        // ���� �ʱ�ȭ
        dr.put("�Ƹ޸�ī��", new Drink("�Ƹ޸�ī��", 3000)); // Ŀ�� ���Ḧ �ؽøʿ� �߰�
        dr.put("ī���", new Drink("ī���", 3500)); // �� ���Ḧ �ؽøʿ� �߰�
        dr.put("�������꽺", new Drink("�������꽺", 4000)); // �ֽ� ���Ḧ �ؽøʿ� �߰�
        dr.put("����", new Drink("����", 3000)); // ���� ���Ḧ �ؽøʿ� �߰�
        dr.put("������ ���̽�Ƽ", new Drink("�����ƾ��̽�Ƽ", 3000)); // ���̽�Ƽ ���Ḧ �ؽøʿ� �߰�
    }

    // �̿� ������ ���̺� ã��
    private static int findAvailableTable() {
        for (Table table : ta.values()) { // ��� ���̺��� ��ȸ�ϸ�
            if (!table.isReserved()) { // ������� ���� ���̺��� ã��
                return table.getTableNumber(); // ������� ���� ���̺� ��ȣ ��ȯ
            }
        }
        return -1; // �̿� ������ ���̺��� ���� ��
    }
}
