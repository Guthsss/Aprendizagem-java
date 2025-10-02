package Temperatura;

public class Conversor_temp {
    private double celcius;

    public Conversor_temp(double celcius) {
        this.celcius = celcius;
    }
    public void fahrenheit () {
        System.out.println(this.celcius * 1.8 + 32);
    }
    public void kelvin () {
        System.out.println(this.celcius + 273);
    }
}
