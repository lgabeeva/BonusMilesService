public class Main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
