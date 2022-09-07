 

import java.util.*;

class Moves {
    static int ctr = 0;
    static char[][] cube = CC();

    public static char[][] CC() {
        char cube[][] = new char[6][9];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0) cube[i][j] = 'W';
                if (i == 1) cube[i][j] = 'G';
                if (i == 2) cube[i][j] = 'R';
                if (i == 3) cube[i][j] = 'B';
                if (i == 4) cube[i][j] = 'O';
                if (i == 5) cube[i][j] = 'Y';
            }
        }
        return cube;
    }

    static char[][] Solve() {
        cube = CC();
        return cube;
    }

    static char[][] Scramble() {
        Random rand = new Random();
        for (int i = 1; i <= 20; i++) {
            float randfloat = rand.nextFloat();
            float randint = Math.round(1 + 6 * randfloat);
            if (randint == 1) {
                cube = F();
                System.out.print("F");
            }
            if (randint == 2) {
                cube = U();
                System.out.print("U");
            }
            if (randint == 3) {
                cube = L();
                System.out.print("L");
            }
            if (randint == 4) {
                cube = R();
                System.out.print("R");
            }
            if (randint == 5) {
                cube = B();
                System.out.print("B");
            }
            if (randint == 6) {
                cube = D();
                System.out.print("D");
            }
            if (i != 20)
                System.out.print(",");
        }
        System.out.println("\n");
        return cube;
    }

    static char[][] U() {
        char a, b, c, i, j, k;
        a = cube[3][2];
        cube[3][2] = cube[4][2];
        b = cube[3][1];
        cube[3][1] = cube[4][1];
        c = cube[3][0];
        cube[3][0] = cube[4][0];
        i = cube[2][2];
        cube[2][2] = a;
        j = cube[2][1];
        cube[2][1] = b;
        k = cube[2][0];
        cube[2][0] = c;
        a = cube[1][2];
        cube[1][2] = i;
        b = cube[1][1];
        cube[1][1] = j;
        c = cube[1][0];
        cube[1][0] = k;
        cube[4][2] = a;
        cube[4][1] = b;
        cube[4][0] = c;
        a = cube[0][0];
        cube[0][0] = cube[0][6];
        b = cube[0][1];
        cube[0][1] = cube[0][3];
        c = cube[0][2];
        cube[0][2] = a;
        a = cube[0][5];
        cube[0][5] = b;
        b = cube[0][8];
        cube[0][8] = c;
        c = cube[0][7];
        cube[0][7] = a;
        cube[0][6] = b;
        cube[0][3] = c;
        return cube;
    }

    static char[][] F() {
        char a, b, c, i, j, k;
        a = cube[0][6];
        cube[0][6] = cube[4][8];
        b = cube[0][7];
        cube[0][7] = cube[4][5];
        c = cube[0][8];
        cube[0][8] = cube[4][2];
        i = cube[2][0];
        cube[2][0] = a;
        j = cube[2][3];
        cube[2][3] = b;
        k = cube[2][6];
        cube[2][6] = c;
        a = cube[5][2];
        cube[5][2] = i;
        b = cube[5][1];
        cube[5][1] = j;
        c = cube[5][0];
        cube[5][0] = k;
        cube[4][8] = a;
        cube[4][5] = b;
        cube[4][2] = c;
        a = cube[1][0];
        cube[1][0] = cube[1][6];
        b = cube[1][1];
        cube[1][1] = cube[1][3];
        c = cube[1][2];
        cube[1][2] = a;
        a = cube[1][5];
        cube[1][5] = b;
        b = cube[1][8];
        cube[1][8] = c;
        c = cube[1][7];
        cube[1][7] = a;
        cube[1][6] = b;
        cube[1][3] = c;
        return cube;
    }

    static char[][] R() {
        ctr++;
        char a, b, c, i, j, k;
        a = cube[0][8];
        cube[0][8] = cube[1][8];
        b = cube[0][5];
        cube[0][5] = cube[1][5];
        c = cube[0][2];
        cube[0][2] = cube[1][2];
        i = cube[3][0];
        cube[3][0] = a;
        j = cube[3][3];
        cube[3][3] = b;
        k = cube[3][6];
        cube[3][6] = c;
        a = cube[5][8];
        cube[5][8] = i;
        b = cube[5][5];
        cube[5][5] = j;
        c = cube[5][2];
        cube[5][2] = k;
        cube[1][8] = a;
        cube[1][5] = b;
        cube[1][2] = c;
        a = cube[2][0];
        cube[2][0] = cube[2][6];
        b = cube[2][1];
        cube[2][1] = cube[2][3];
        c = cube[2][2];
        cube[2][2] = a;
        a = cube[2][5];
        cube[2][5] = b;
        b = cube[2][8];
        cube[2][8] = c;
        c = cube[2][7];
        cube[2][7] = a;
        cube[2][6] = b;
        cube[2][3] = c;
        return cube;
    }

    static char[][] L() {
        ctr++;
        char a, b, c, i, j, k;
        a = cube[0][0];
        cube[0][0] = cube[3][8];
        b = cube[0][3];
        cube[0][3] = cube[3][5];
        c = cube[0][6];
        cube[0][6] = cube[3][2];
        i = cube[1][0];
        cube[1][0] = a;
        j = cube[1][3];
        cube[1][3] = b;
        k = cube[1][6];
        cube[1][6] = c;
        a = cube[5][0];
        cube[5][0] = i;
        b = cube[5][3];
        cube[5][3] = j;
        c = cube[5][6];
        cube[5][6] = k;
        cube[3][8] = a;
        cube[3][5] = b;
        cube[3][2] = c;
        a = cube[4][0];
        cube[4][0] = cube[4][6];
        b = cube[4][1];
        cube[4][1] = cube[4][3];
        c = cube[4][2];
        cube[4][2] = a;
        a = cube[4][5];
        cube[4][5] = b;
        b = cube[4][8];
        cube[4][8] = c;
        c = cube[4][7];
        cube[4][7] = a;
        cube[4][6] = b;
        cube[4][3] = c;
        return cube;
    }

    static char[][] B() {
        char a, b, c, i, j, k;
        a = cube[0][0];
        cube[0][0] = cube[2][2];
        b = cube[0][1];
        cube[0][1] = cube[2][5];
        c = cube[0][2];
        cube[0][2] = cube[2][8];
        i = cube[4][6];
        cube[4][6] = a;
        j = cube[4][3];
        cube[4][3] = b;
        k = cube[4][0];
        cube[4][0] = c;
        a = cube[5][8];
        cube[5][8] = i;
        b = cube[5][7];
        cube[5][7] = j;
        c = cube[5][6];
        cube[5][6] = k;
        cube[2][2] = a;
        cube[2][5] = b;
        cube[2][8] = c;
        a = cube[3][0];
        cube[3][0] = cube[3][6];
        b = cube[3][1];
        cube[3][1] = cube[3][3];
        c = cube[3][2];
        cube[3][2] = a;
        a = cube[3][5];
        cube[3][5] = b;
        b = cube[3][8];
        cube[3][8] = c;
        c = cube[3][7];
        cube[3][7] = a;
        cube[3][6] = b;
        cube[3][3] = c;
        return cube;
    }

    static char[][] D() {
        char a, b, c, i, j, k;
        a = cube[1][6];
        cube[1][6] = cube[4][6];
        b = cube[1][7];
        cube[1][7] = cube[4][7];
        c = cube[1][8];
        cube[1][8] = cube[4][8];
        i = cube[2][6];
        cube[2][6] = a;
        j = cube[2][7];
        cube[2][7] = b;
        k = cube[2][8];
        cube[2][8] = c;
        a = cube[3][6];
        cube[3][6] = i;
        b = cube[3][7];
        cube[3][7] = j;
        c = cube[3][8];
        cube[3][8] = k;
        cube[4][6] = a;
        cube[4][7] = b;
        cube[4][8] = c;
        a = cube[5][0];
        cube[5][0] = cube[5][6];
        b = cube[5][1];
        cube[5][1] = cube[5][3];
        c = cube[5][2];
        cube[5][2] = a;
        a = cube[5][5];
        cube[5][5] = b;
        b = cube[5][8];
        cube[5][8] = c;
        c = cube[5][7];
        cube[5][7] = a;
        cube[5][6] = b;
        cube[5][3] = c;
        return cube;
    }

    static char[][] X() {
        char a, b, c;
        char[] cu = new char[9];
        for (int j = 0; j < 9; j++) {
            cu[j] = cube[0][j];
            cube[0][j] = cube[1][j];
            cube[1][j] = cube[5][j];
            cube[5][j] = cube[3][8 - j];
        }
        for (int j = 0; j < 9; j++)
            cube[3][j] = cu[8 - j];
        a = cube[2][0];
        cube[2][0] = cube[2][6];
        b = cube[2][1];
        cube[2][1] = cube[2][3];
        c = cube[2][2];
        cube[2][2] = a;
        a = cube[2][5];
        cube[2][5] = b;
        b = cube[2][8];
        cube[2][8] = c;
        c = cube[2][7];
        cube[2][7] = a;
        cube[2][6] = b;
        cube[2][3] = c;
        a = cube[4][0];
        cube[4][0] = cube[4][2];
        b = cube[4][1];
        cube[4][1] = cube[4][5];
        c = cube[4][6];
        cube[4][6] = a;
        a = cube[4][3];
        cube[4][3] = b;
        b = cube[4][8];
        cube[4][8] = c;
        c = cube[4][7];
        cube[4][7] = a;
        cube[4][2] = b;
        cube[4][5] = c;
        return cube;
    }

    static char[][] Y() {
        char a, b, c;
        for (int j = 0; j < 9; j++) {
            a = cube[1][j];
            cube[1][j] = cube[2][j];
            cube[2][j] = cube[3][j];
            cube[3][j] = cube[4][j];
            cube[4][j] = a;
        }
        a = cube[0][0];
        cube[0][0] = cube[0][6];
        b = cube[0][1];
        cube[0][1] = cube[0][3];
        c = cube[0][2];
        cube[0][2] = a;
        a = cube[0][5];
        cube[0][5] = b;
        b = cube[0][8];
        cube[0][8] = c;
        c = cube[0][7];
        cube[0][7] = a;
        cube[0][6] = b;
        cube[0][3] = c;
        a = cube[5][0];
        cube[5][0] = cube[5][2];
        b = cube[5][1];
        cube[5][1] = cube[5][5];
        c = cube[5][6];
        cube[5][6] = a;
        a = cube[5][3];
        cube[5][3] = b;
        b = cube[5][8];
        cube[5][8] = c;
        c = cube[5][7];
        cube[5][7] = a;
        cube[5][2] = b;
        cube[5][5] = c;
        return cube;
    }
}