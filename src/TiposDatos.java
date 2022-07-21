public class TiposDatos {
    public static void main(String[] args) {
        long n = 12345678901l;
        double nD = 123.54;
        float nF = 125.544F;

        var salario = 1000;
        //3% del salario
        var pension = salario * 0.03;
        System.out.println(salario);
        System.out.println(pension);

        var salarioTotal = salario - pension;
        System.out.println(salarioTotal);

        var nombreEmpleado = "Angela Romero";
        System.out.println("El empleado es: " + nombreEmpleado + " El salario es: Q" +salarioTotal );

    }
}
