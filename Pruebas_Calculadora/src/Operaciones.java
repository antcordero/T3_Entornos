public class Operaciones {

    private double num1;
    private double num2;

    //Constructor
    public Operaciones() {

    }

    //Getters - Setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //ToString
    @Override
    public String toString() {
        return "Operaciones{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    //Métodos - Operaciones

    /**
     * Metodo para sumar dos números
     * @param num1
     * @param num2
     * @return
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Metodo para restar dos números
     * @param num1
     * @param num2
     * @return
     */
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Metodo para multiplicar dos números
     * @param num1
     * @param num2
     * @return
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Metodo para dividir dos números
     * @param num1
     * @param num2
     * @return
     */
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

}
