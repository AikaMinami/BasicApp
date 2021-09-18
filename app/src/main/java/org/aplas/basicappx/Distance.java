package org.aplas.basicappx;

public class Distance {
    private double meter;

    Distance(){
        this.meter = 0;
    }

    public void setMeter(double mtr) {
        this.meter = mtr;
    }
    public void setInch(double inch) {
        this.meter = convert("Inc", "Mtr", inch);
    }
    public void setMile(double ml) {
        this.meter = convert("Mil", "Mtr", ml);
    }
    public void setFoot(double ft) {
        this.meter = convert("Ft", "Mtr", ft);
    }

    public double getMeter() {
        return this.meter;
    }
    public double getInch() {
        double meterToInch = convert("Mtr", "Inc", meter);
        return meterToInch;
    }
    public double getMile() {
        double meterToMile = convert("Mtr", "Mil", meter);
        return meterToMile;
    }
    public double getFoot() {
        double meterToFoot = convert("Mtr", "Ft", meter);
        return meterToFoot;
    }

    public double convert(String oriUnit, String convUnit, double value){
        double convert = 0;

        switch (oriUnit){
            case "Mtr":
                convert = value;
                break;
            case "Inc"  :
                convert = value/39.3701;
                break;
            case "Mil" :
                convert = value/0.000621371;
                break;
            case "Ft" :
                convert = value/3.28084;
                break;
        }

        switch (convUnit){
            case "Mtr":
                convert = convert;
                break;
            case "Inc"  :
                convert = convert*39.3701;
                break;
            case "Mil" :
                convert = convert*0.000621371;
                break;
            case "Ft" :
                convert = convert*3.28084;
                break;
        }
        return convert;
    }
}
