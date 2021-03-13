## **Приложение Body Mass Index.**
 
 **[Main](https://github.com/maxim-valov/Body_Mass_Index/blob/master/src/Main.java)**

 ```java
 public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weihgt = 100.50;
        double heihgt = 187;
        double bmi = service.calculate(weihgt,heihgt);
        System.out.println (bmi);
    }
}
 ```

 **[BodyMassIndexService](https://github.com/maxim-valov/Body_Mass_Index/blob/master/src/BodyMassIndexService.java)**

 ```java
 public class BodyMassIndexService {
    public double calculate (double weihgt,double heihgt) {
        double bmi = weihgt / ((heihgt * heihgt)/10000);
        return bmi;
    }
}
 ```