import Exceptions.InvalidOptionException;
import Services.Currencies;
import Services.CurrencyConverter;
import Services.ICurrencyConverter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Currencies from = Currencies.AmericanDolar;
        int scFrom = 0;
        Currencies to = Currencies.MexicanPeso;
        int scTo = 0;
        float amount = 0;
        float resultAmount = 0;
        var sc = new Scanner(System.in);

        ICurrencyConverter service = new CurrencyConverter();

        java.lang.String logo = """                   
         
                         
                    ___  ___  ___  ________   ________     ___    ___\s
                   |\\  \\|\\  \\|\\  \\|\\   ___  \\|\\   __  \\   |\\  \\  /  /|
                   \\ \\  \\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\|\\  \\  \\ \\  \\/  / /
                 __ \\ \\  \\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\  \\ \\    / /\s
                |\\  \\\\_\\  \\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\\\\\  \\  /     \\/ \s
                \\ \\________\\ \\_______\\ \\__\\\\ \\__\\ \\_______\\/  /\\   \\ \s
                 \\|________|\\|_______|\\|__| \\|__|\\|_______/__/ /\\ __\\\s
                                                          |__|/ \\|__|\s
                                                                     \s
                                                                     \s                                                                                                                                                                                  \s
                Made with love by Dtopiast \s                                                                                                                                              \s           """;
        System.out.println(logo);
        System.out.println("Conversor de divisas\s" );
        System.out.println("""
                        Selecciona una opcion valida:
                        
                        (0) Dolar Americano 
                        (1) Peso Mexicano
                        (2) Peso Argentino
                        (3) peso colombiano
                        (4) Real brasile:no
                        (5) Euro
                        
                        (6) salir
                        
                        """);

        do {
            try {

                System.out.println("Coloque la moneda de origen: ");

                scFrom = sc.nextInt();
                switch (scFrom) {
                    case 0 -> {
                        from = Currencies.AmericanDolar;
                    }
                    case 1 -> {
                        from = Currencies.MexicanPeso;
                    }
                    case 2 -> {
                        from = Currencies.ArgentinePeso;

                    }
                    case 3 -> {
                        from = Currencies.ColombianPeso;
                    }
                    case 4 -> {
                        from = Currencies.RealBresileño;
                    }
                    case 5 -> {
                        from = Currencies.Euro;
                    }
                    case 6 -> {
                        System.exit(0);
                    }
                    default -> throw new InvalidOptionException();
                }

                System.out.println("Coloque la moneda a convertir: ");
                scTo = sc.nextInt();
                switch (scTo) {
                    case 0 -> {
                        to = Currencies.AmericanDolar;
                    }
                    case 1 -> {
                        to = Currencies.MexicanPeso;
                    }
                    case 2 -> {
                        to = Currencies.ArgentinePeso;
                    }
                    case 3 -> {
                        to = Currencies.ColombianPeso;
                    }
                    case 4 -> {
                        to = Currencies.RealBresileño;
                    }
                    case 5 -> {
                        to = Currencies.Euro;
                    }
                    case 6 -> {
                        System.exit(0);
                    }
                    default -> throw new InvalidOptionException();
                }
                System.out.println("Coloque el monto: ");
                var scAmount = sc.next().replace(",", ".");
                amount = Float.parseFloat(scAmount);
                resultAmount = service.getConversion(from,to,amount);
                System.out.printf("El resultado es : %.2f%n \s", resultAmount);

            }
            catch (Exception ex)
            {
                System.out.println("Opcion invalida, intentelo otra vez revisando el si el valor es correcto.");
                scFrom = 0;
            }


        } while(scFrom !=6);

    }
}
