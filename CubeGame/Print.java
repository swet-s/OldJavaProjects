 

public class Print {
    static char[][] cube = Moves.CC();

    public static void print_cube() {
        cube = Run_Cube.run();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(cube[i][j]);
                if (j % 3 == 2){
                    System.out.println();
                }
            }
            System.out.println();
        }
        print_cube();
    }
}
