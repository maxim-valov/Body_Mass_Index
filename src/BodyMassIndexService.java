public class BodyMassIndexService {
    public double calculate (double weight,double height) {
        double bmi;
        bmi = weight / ((height * height)/10000);
        return bmi;
    }
}
