public class Main {
    public static void main(String[] args) {
        int curentAcount = 200;
        int refill = 1300;
        int bonusDivider = 100;
        int bonus = 0;
        if (refill >=1000)
            bonus = refill/bonusDivider;
        int finalAmount = curentAcount+refill+bonus;
        System.out.println(finalAmount);
    }
}