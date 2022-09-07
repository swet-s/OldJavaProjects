 

import java.util.*;

public class Run_Cube {
    static char[][] cube = Moves.CC();

    public static void main(String[] args) {
        Print.print_cube();
    }

    public static char[][] run() {
        Scanner input = new Scanner(System.in);
        String key = input.next();
        char key_char = key.charAt(0);
        if (key_char == 'F') {
            cube = Moves.F();
        }
        if (key_char == 'B') {
            cube = Moves.B();
        }
        if (key_char == 'U') {
            cube = Moves.U();
        }
        if (key_char == 'D') {
            cube = Moves.D();
        }
        if (key_char == 'L') {
            cube = Moves.L();
        }
        if (key_char == 'R') {
            cube = Moves.R();
        }
        if (key_char == 'X') {
            cube = Moves.X();
        }
        if (key_char == 'Y') {
            cube = Moves.Y();
        }
        if (key_char == 'f') {
            cube = Moves.F();
            cube = Moves.F();
            cube = Moves.F();
        }
        if (key_char == 'b') {
            cube = Moves.B();
            cube = Moves.B();
            cube = Moves.B();
        }
        if (key_char == 'u') {
            cube = Moves.U();
            cube = Moves.U();
            cube = Moves.U();
        }
        if (key_char == 'd') {
            cube = Moves.D();
            cube = Moves.D();
            cube = Moves.D();
        }
        if (key_char == 'l') {
            cube = Moves.L();
            cube = Moves.L();
            cube = Moves.L();
        }
        if (key_char == 'r') {
            cube = Moves.R();
            cube = Moves.R();
            cube = Moves.R();
        }
        if (key_char == 'x') {
            cube = Moves.X();
            cube = Moves.X();
            cube = Moves.X();
        }
        if (key_char == 'y') {
            cube = Moves.Y();
            cube = Moves.Y();
            cube = Moves.Y();
        }
        if (key_char == 'Q') {
            cube = Moves.Solve();
        }
        if (key_char == 'S') {
            cube = Moves.Scramble();
        }
        return cube;
    }
}








































