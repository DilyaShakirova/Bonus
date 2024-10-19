public class Main {
    public static void main(String[] args) {
        int amount = 154, replenishment = 1001, bonus = 0;
        int finalAmount;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            finalAmount = amount + replenishment + bonus;
        } else {
            finalAmount = amount + replenishment;
        }
        System.out.println("Количество зачисленных бонусов: " + bonus + " руб.");
        System.out.println("Сумма на счету с учётом бонусов: " + finalAmount + " руб.");
    }
}