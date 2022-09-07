 

class cric {
    public static void main(String[] args) {
        int ec = 1;
        while (true) {
            if (ec == 1)
                System.out.print("\f");
            int exc = 0;
            try {
                crick.match2();
            } catch (Exception e) {
                System.out.println("\fEnter a valid no");
                exc = 1;
            }
            if (exc == 1) {
                ec++;
                continue;
            } else
                break;
        }
    }
}

