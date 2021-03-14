## **Приложение Body Mass Index.**
 
 **[Main](https://github.com/maxim-valov/Body_Mass_Index/blob/master/src/Main.java)**

 ```java
 public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 100.50;
        double height = 187;
        double bmi
        bmi = service.calculate(weight,height);
        System.out.println (bmi);
    }
}
 ```

 **[BodyMassIndexService](https://github.com/maxim-valov/Body_Mass_Index/blob/master/src/BodyMassIndexService.java)**

 ```java
 public class BodyMassIndexService {
    public double calculate (double weight,double height) {
        double bmi = weight / ((height * height)/10000);
        return bmi;
    }
}
 ```
 ***Примечание** Вес указывается в килограммах, рост - в сантиметрах.
