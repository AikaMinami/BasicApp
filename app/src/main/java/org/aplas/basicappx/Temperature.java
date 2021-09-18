package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    Temperature(){
        this.celcius = 0;
    }

    public void setCelcius(double celci) {
        this.celcius = celci;
    }
    public void setFahrenheit(double farenheit) {
        this.celcius = convert("°F", "°C", farenheit);
    }
    public void setKelvins(double kelvin) {
        this.celcius = convert("K", "°C", kelvin);
    }

    public double getCelcius() {
        return this.celcius;
    }
    public double getFahrenheit() {
        double celciusToFar = convert("°C", "°F", celcius);
        return celciusToFar;
    }
    public double getKelvins() {
        double celciusToKelv = convert("°C", "K", celcius);
        return celciusToKelv;
    }

    public double convert(String oriUnit, String convUnit, double value){
        double convert = 0;

        switch (oriUnit){
            case "°C":
                convert = value;
                break;
            case "°F"  :
                convert = (value-32)*5/9;
                break;
            case "K" :
                convert = value-273.15;
                break;
        }

        switch (convUnit){
            case "°C":
                convert = convert;
                break;
            case "°F"  :
                convert = convert*9/5+32;
                break;
            case "K" :
                convert = convert+ 273.15;
                break;
        }
        return convert;
    }

}