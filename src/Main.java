public class Main {
    public static void main(String[] args) {
        // Programa de convertidor de celcius a fahrenheit
        double celsius = 32;

        int fahrenheit = (int) (celsius * 1.8) + 32;
        System.out.println("Los celcius en fahrenheit son " + fahrenheit + "grados");
    }
}

/*public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }

} */