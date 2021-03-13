public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weihgt = 100.50;
        double heihgt = 187;
        double bmi = service.calculate(weihgt,heihgt);
        System.out.println (bmi);
    }
}
