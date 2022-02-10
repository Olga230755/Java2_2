public class Main {
    public static void main(String[] args) {
        //начальный баланс
        int balance = 500;
        //сумма пополнения
        int debet = 1050;
        //сумма для расчета бонуса
        int bonusbase = 100;
        int bonus = debet / bonusbase;
        int bfinalbalance = balance + debet + bonus;
        int finalbalance = balance + debet;

        if (debet > 1000) {
            System.out.println("Баланс счета: " + bfinalbalance);
            System.out.println("В том числе бонус:" + bonus);
        } else {
            System.out.println("Баланс счета: " + finalbalance);
            System.out.println("В том числе бонус: 0");
        }


    }
}
