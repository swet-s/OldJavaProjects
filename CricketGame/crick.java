 

import java.util.*;

class crick {
    public static void match2() {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter delay you want for each ball(in Seconds)[eg 0.5 sec] :-");
        double sec = Input.nextDouble();
        System.out.print("Enter no of Overs:-");
        int o = Input.nextInt();
        int x = 0;
        for (int loop = 0; ; loop++) {
            System.out.print(" Choice:-\n1.Tournament\n2.Single Match\n\nEnter your Choice:-");
            int ch = Input.nextInt();
            switch (ch) {
                case 1:
                    Tournament.tour(o, sec);
                    break;
                case 2:
                    for (int m = 0; ; m++) {
                        System.out.print("\fEnter team 1:-");
                        String t1 = Input.next();
                        System.out.print("Enter team 2:-");
                        String t2 = Input.next();
                        Cricket.match(o, sec, t1, t2);
                        System.out.print("\nWant more,Enter Yes or No:-");
                        String ma = Input.next();
                        if (ma.charAt(0) == 'y' || ma.charAt(0) == 'Y')
                            continue;
                        else {
                            System.out.print("Hope you enjoyed,Bye...               (Press 'X' button on the Top-right corner)");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong Choice");
                    x++;
            }
            if (x == 1) {
                x = 0;
                continue;
            } else
                break;
        }
    }
}