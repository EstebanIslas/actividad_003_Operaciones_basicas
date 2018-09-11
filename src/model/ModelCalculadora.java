package model;

public class ModelCalculadora {

    private float num1;
    private float num2;

    private int num1_resta;
    private int num2_resta;

    private double num1_div;
    private double num2_div;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public int getNum1_resta() {
        return num1_resta;
    }

    public void setNum1_resta(int num1_resta) {
        this.num1_resta = num1_resta;
    }

    public int getNum2_resta() {
        return num2_resta;
    }

    public void setNum2_resta(int num2_resta) {
        this.num2_resta = num2_resta;
    }

    public double getNum1_div() {
        return num1_div;
    }

    public void setNum1_div(double num1_div) {
        this.num1_div = num1_div;
    }

    public double getNum2_div() {
        return num2_div;
    }

    public void setNum2_div(double num2_div) {
        this.num2_div = num2_div;
    }

    public float Suma() {
        float resultado;
        resultado = num1 + num2;
        return resultado;
    }

    public int Resta() {
        int resultado;
        resultado = num1_resta - num2_resta;
        return resultado;
    }

    public float Multiplicacion() {
        float resultado;
        resultado = num1 * num2;
        return resultado;
    }

    public double Division() {
        double resultado;
        resultado = num1_div / num2_div;
        return resultado;
    }

    public float Modulo() {
        float resultado;
        resultado = num1 % num2;
        return resultado;
    }

}
