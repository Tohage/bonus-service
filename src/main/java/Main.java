public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;

        double bonus = service.calculate(amount, registered);

        System.out.println(bonus);
    }
}

