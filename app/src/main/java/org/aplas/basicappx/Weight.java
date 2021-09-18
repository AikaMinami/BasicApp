package org.aplas.basicappx;

public class Weight {
    private double gram;

    Weight(){
        gram = 0;
    }

    public void setGram(double gram) {this.gram = gram;}

    public void setOunce(double ounce){this.gram = convert("Onc", "Grm", ounce);}

    public void setPound(double pound){this.gram = convert("Pnd", "Grm", pound);}

    public double getGram(){return this.gram;}

    public double getOunce(){return convert("Grm", "Onc", this.gram);}

    public double getPound(){return convert("Grm", "Pnd", this.gram);}

    double convert(String oriUnit, String convUnit, double value) {
        double val = 0;

        switch (oriUnit) {
            case "Grm":
                val = value;
                break;
            case "Onc":
                val = value * 28.3495231;
                break;
            case "Pnd":
                val = value * 453.59237;
                break;
        }

        switch (convUnit) {
            case "Grm":
                val = val;
                break;
            case "Onc":
                val = val / 28.3495231;
                break;
            case "Pnd":
                val = val /453.59237;
                break;
        }
        return val;
    }
}
