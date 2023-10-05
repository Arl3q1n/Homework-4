public class TemperatureConverter {

    float temp;

    public TemperatureConverter(float temp) {
        this.temp = temp;
    }

    public void toCelsius() {
        System.out.println(temp + " Fahrenheit to Celsius = " + ((5 * (temp - 32)) / 9));
    }

    public void toFahrenheit() {
        System.out.println(temp + " Celsius to Fahrenheit " + ((9 * temp + (32 * 5)) / 5 ));
    }
}
