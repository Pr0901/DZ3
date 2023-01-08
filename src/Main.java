import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int initial_account = 100;
        int payment = 1200;
        int bonus;
        if (payment>1000) {
            bonus = payment/100;
        } else {
            bonus = 0;
        }
        int final_account = initial_account + payment + bonus;

        System.out.println("На счету:" + final_account);


    }
}