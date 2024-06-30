package java0628;

import java.util.Random;
import java.util.Scanner;

public class bingo {
    private static final int SIZE = 5; // �������� ũ��
    private int[][] map = new int[SIZE][SIZE]; // ������
    private int endCount = 0; // �ϼ��� ���� �� ��

    public static void main(String[] args) {
        bingo game = new bingo();
        game.start();
    }

    public void start() {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        // ���� ��ġ
        for (int n = 1; n <= SIZE * SIZE; n++) {
            int row = r.nextInt(SIZE);
            int col = r.nextInt(SIZE);
            if (map[row][col] != 0) {
                n--;
            } else {
                map[row][col] = n;
            }
        }

        // ���� ����
        while (true) {
            printBingoBoard();

            // ����� �Է� �ޱ�
            System.out.println("��ȣ�� �����ϼ��� (1-25):");
            int number = scanner.nextInt();
            markNumber(number);

            // ���� üũ
            checkBingo();

            // ���� 5�� �̻��̸� ���� ����
            if (endCount >= 5) {
                System.out.println("���� �ϼ�! ���� ����!");
                break;
            }
        }

        scanner.close();
    }

    // ������ ���
    private void printBingoBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k < SIZE; k++) {
                if (map[i][k] == 0) {
                    System.out.print("X\t");
                } else {
                    System.out.print(map[i][k] + "\t");
                }
            }
            System.out.println();
        }
    }

    // �Է� ó��
    private void markNumber(int number) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == number) {
                    map[i][j] = 0; // ���õ� ���ڸ� 0���� ǥ��
                }
            }
        }
    }

    // ���� üũ
    private void checkBingo() {
        int end = 0;

        // ���� üũ
        for (int i = 0; i < SIZE; i++) {
            boolean bingoLine = true;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != 0) {
                    bingoLine = false;
                    break;
                }
            }
            if (bingoLine) end++;
        }

        // ���� üũ
        for (int j = 0; j < SIZE; j++) {
            boolean bingoLine = true;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] != 0) {
                    bingoLine = false;
                    break;
                }
            }
            if (bingoLine) end++;
        }

        // �밢�� üũ
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != 0) diagonal1 = false;
            if (map[i][SIZE - 1 - i] != 0) diagonal2 = false;
        }
        if (diagonal1) end++;
        if (diagonal2) end++;

        endCount = end;
        System.out.println("���� ���� �� ��: " + endCount);
    }
}