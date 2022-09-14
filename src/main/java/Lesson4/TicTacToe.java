package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int MAP_SIZE = 5;
    private static final int WIN_SIZE = 3;

    private static final char DOT_EMPTY = '#';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final String HEADER_SYMBOL = "$";
    private static final String SPACE_SYMBOL = " ";

    private static final char[][] MAP = new char[MAP_SIZE][MAP_SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount = 0;

    public static void main(String[] args) {
        turnGame();


    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void playGame() {
        while (true){
            humanTurn();//Ход человека
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }//Проверка на конец игры

            aiTurn();//Ход компьютера
            printBodyMap();
            if (checkEnd(DOT_AI)) {
                break;
            }//Проверка на конец игры
        }
    }

    private static boolean checkEnd(char symbol) {
        if(checkWin(symbol)){
            if (symbol == DOT_HUMAN) {
                System.out.println("Победа ваша!!!");
            } else {
                System.out.println("Увы, робот победил.");
            }
            return true;
        }
        if (checkDraw()){
            System.out.println("Это ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= MAP_SIZE * MAP_SIZE;

    }

    private static boolean checkWin(char symbol) {
        int hor = 0;
        int vert = 0;
        int diagOne = 0;
        int diagTwo = 0;

        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    hor++;
                } else if (MAP[i][j] != symbol && hor < WIN_SIZE) {
                    hor = 0;
                }
                if (MAP[j][i] == symbol) {
                    vert++;
                } else if (MAP[i][j] != symbol && vert < WIN_SIZE) {
                    vert = 0;
                }
            }
            if (hor >= WIN_SIZE || vert >= WIN_SIZE){
                return true;

            }

        }
        for (int j = 0; j < MAP_SIZE; j++) {
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = j + i;
                if (k < MAP_SIZE) {
                    if (MAP[i][k] == symbol) {
                        diagOne++;
                    } else if (MAP[i][k] != symbol && diagOne < WIN_SIZE) {
                        diagOne = 0;
                    }
                }
                if (diagOne >= WIN_SIZE) {
                    return true;
                }
            }
        }
        for (int j = 1; j < MAP_SIZE; j++) {
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = j + i;
                if (k < MAP_SIZE) {
                    if (MAP[k][i] == symbol) {
                        diagOne++;
                    } else if (MAP[k][i] != symbol && diagOne < WIN_SIZE) {
                        diagOne = 0;
                    }
                }
                if (diagOne >= WIN_SIZE) {
                    return true;
                }
            }
        }
        for (int j = 0; j < MAP_SIZE; j++) {
            diagTwo = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = (MAP_SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < MAP_SIZE) {
                    if (MAP[l][k] == symbol) {
                        diagTwo++;
                    } else if (MAP[l][k] != symbol && diagTwo < WIN_SIZE) {
                        diagTwo = 0;
                    }
                }
                if (diagTwo >= WIN_SIZE) {
                    return true;
                }
            }
        }
        for (int j = 1; j < MAP_SIZE; j++) {
            diagTwo = 0;
            for (int i = 0; i < MAP_SIZE; i++) {
                int k = (MAP_SIZE - 1) - j - i;
                if (k >= 0) {
                    if (MAP[i][k] == symbol) {
                        diagTwo++;
                    } else if (MAP[i][k] != symbol && diagTwo < WIN_SIZE) {
                        diagTwo = 0;
                    }
                }
                if (diagTwo >= WIN_SIZE) {
                    return true;
                }
            }
        }
        return false;

    }

    private static void aiTurn() {
        System.out.println("\nХод компьютера");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(MAP_SIZE);
            columnNumber = random.nextInt(MAP_SIZE);

        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;

    }

    private static void humanTurn() {
        System.out.println("\nХод человека");
        int rowNumber;
        int columnNumber;

        while (true){
            System.out.println("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.println("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;
            if (isCellFree(rowNumber, columnNumber)){
                break;
            }

            System.out.printf("Ошибка, ячейка с координатами %s:%s уже используется!", rowNumber + 1, columnNumber + 1);

        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;


    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_SYMBOL + SPACE_SYMBOL);
        for (int i = 0; i < MAP_SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void initMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

}
