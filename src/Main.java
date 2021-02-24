import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random meurnd = new Random();

        int indice = meurnd.nextInt(args.length);
        System.out.println("Vencedor: " + args[indice]);

    }

}