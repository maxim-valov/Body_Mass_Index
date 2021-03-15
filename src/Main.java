public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 100.5;
        double height = 187;
        double bmi = service.calculate(weight,height);
        System.out.printf("Body Mass Index: %.1f", bmi);
    }
}