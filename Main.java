import java.math.BigDecimal;
import videoStreamer.Movie;
import cars.Sedan;


public class Main {
    public static void main(String[] args) {
        BigDecimal num1= new BigDecimal(34.97845);
        BigDecimal num2= new BigDecimal(-837.382749);

        System.out.println(BigDecimalOperations.rounderToHundredth(num1));
        System.out.println(BigDecimalOperations.rounderToTenthReverser(num1));

        System.out.println(BigDecimalOperations.rounderToHundredth(num2));
        System.out.println(BigDecimalOperations.rounderToTenthReverser(num2));

        // Crear una instancia de Movie
        Movie myMovie = new Movie("Inception", 148, 8.8);

        // Obtener la info
        String movieInfo = myMovie.getInfo();

        // Imprimirla
        System.out.println(movieInfo);

        // Crear una instancia de Sedan
        Sedan mySedan = new Sedan("182746", "Audi", "cuatro latas", 4765);
        String sedanInfo = mySedan.getInfo();
        System.out.println(sedanInfo);

    }



}
