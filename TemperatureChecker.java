//A-2 Ques23

class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureChecker {

    public static void checkTemperature(int temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("Temperature is too hot: " + temperature + "°C");
        } else if (temperature < 5) {
            throw new TooCold("Temperature is too cold: " + temperature + "°C");
        } else {
            System.out.println("Temperature is normal: " + temperature + "°C");
            double fahrenheit = (temperature * 9.0 / 5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the temperature in Celsius: ");
            int temperature = scanner.nextInt();

            // Checking the temperature
            checkTemperature(temperature);

        } catch (TooHot e) {
            // Handling the "TooHot" exception
            System.out.println("Exception: " + e.getMessage());
        } catch (TooCold e) {
            // Handling the "TooCold" exception
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}