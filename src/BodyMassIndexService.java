public class BodyMassIndexService {
    public double calculate (double weight,double height) {
        double bmi;
        bmi = weight / ((Math.pow(height,2)/10000));
        return bmi;
    }
}
