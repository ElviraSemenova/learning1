public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(102000,false);
        System.out.println(bonus);
        long bonus1 = service.calculate(100050,false);
        System.out.println(bonus1);
        long bonus2 = service.calculate(102000,true);
        System.out.println(bonus2);
        long bonus3 = service.calculate(100050,true);
        System.out.println(bonus3);
    }
}


