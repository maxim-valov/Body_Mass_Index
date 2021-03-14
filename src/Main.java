public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 100.50;
        double height = 187;
        double bmi = service.calculate(weight,height);
        System.out.println ("Body Mass Index: " + bmi);
    }
}