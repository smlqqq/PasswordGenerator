import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Temp temp = new Temp();
        temp.start();

    }

    private static char[] Password(int len) {

        System.out.print("Your new password is: ");

        String upper = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String lower = "abcdefghijklmnopqrstuwxyz";
        String numbers = "01234567890";
        String symbols = "!@#$%^&";

        String val = upper + lower + numbers + symbols;

        Random random = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++){
            password[i] = val.charAt(random.nextInt(val.length()));
        }
        return password;
    }

    static class Temp extends Thread{
        public void run() {
            int length = 15;
            try {
                System.out.println("Loading…\n" +
                        "█▒▒▒▒▒▒▒▒▒");
                Thread.sleep(1000);
                System.out.println("10%\n" +
                        "███▒▒▒▒▒▒▒");
                Thread.sleep(1000);
                System.out.println("30%\n" +
                        "█████▒▒▒▒▒ ");
                Thread.sleep(1000);
                System.out.println("50%\n" +
                        "███████▒▒▒");
                Thread.sleep(1000);
                System.out.println("80%\n" +
                        "████████▒▒");
                Thread.sleep(1000);
                System.out.println("100%\n" +
                        "██████████");
                Thread.sleep(600);
                System.out.println(Password(length));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

