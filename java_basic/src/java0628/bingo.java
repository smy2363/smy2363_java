package java0628;

import java.util.Random;
import java.util.Scanner;

public class bingo {
    private static final int SIZE = 5; // 빙고판의 크기
    private int[][] map = new int[SIZE][SIZE]; // 빙고판
    private int endCount = 0; // 완성된 빙고 줄 수

    public static void main(String[] args) {
        bingo game = new bingo();
        game.start();
    }

    public void start() {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        // 숫자 배치
        for (int n = 1; n <= SIZE * SIZE; n++) {
            int row = r.nextInt(SIZE);
            int col = r.nextInt(SIZE);
            if (map[row][col] != 0) {
                n--;
            } else {
                map[row][col] = n;
            }
        }

        // 게임 루프
        while (true) {
            printBingoBoard();

            // 사용자 입력 받기
            System.out.println("번호를 선택하세요 (1-25):");
            int number = scanner.nextInt();
            markNumber(number);

            // 빙고 체크
            checkBingo();

            // 빙고가 5개 이상이면 게임 종료
            if (endCount >= 5) {
                System.out.println("빙고 완성! 게임 종료!");
                break;
            }
        }

        scanner.close();
    }

    // 빙고판 출력
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

    // 입력 처리
    private void markNumber(int number) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == number) {
                    map[i][j] = 0; // 선택된 숫자를 0으로 표시
                }
            }
        }
    }

    // 빙고 체크
    private void checkBingo() {
        int end = 0;

        // 가로 체크
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

        // 세로 체크
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

        // 대각선 체크
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != 0) diagonal1 = false;
            if (map[i][SIZE - 1 - i] != 0) diagonal2 = false;
        }
        if (diagonal1) end++;
        if (diagonal2) end++;

        endCount = end;
        System.out.println("현재 빙고 줄 수: " + endCount);
    }
}