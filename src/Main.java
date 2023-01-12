import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int payment = 1100;
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = initialAccount + payment + bonus;

        System.out.println("На счету:" + finalAccount);


    }
}