public class BodyMassIndexService {
    public double calculate (double weihgt,double heihgt) {
        double bmi = weihgt / ((heihgt * heihgt)/10000);
        return bmi;
    }
}
