import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {



    public static Scanner scanner = new Scanner(System.in);
    public static String Motorcycle_File = "Motorcycle.json";

    public static void main(String[] args) throws IOException {
        Motorcycle motorcycle = new Motorcycle();
        JasonReadWrite jasonReadWrite = new JasonReadWrite();

        try {
            motorcycle = jasonReadWrite.readJson(Motorcycle_File);
            System.out.printf("Make %s\nModel %s\nHorsePower %s\nStyle %s\nIs it affordable? %s\n",motorcycle.getMake(),
                    motorcycle.getModel(), motorcycle.getHorsePower(), motorcycle.getSyle(), motorcycle.isReasonablyPriced());
        } catch (FileNotFoundException e) {
            System.out.println("NO MOTORCYCLE INFO STORED!!!");
        }



        System.out.println("Hello please tell me about your Motorcycle.");
        userMotorcycle(motorcycle);
        jasonReadWrite.writeJson(Motorcycle_File, motorcycle);




    }

    public static void userMotorcycle(Motorcycle motorcycle) {
        System.out.println("Who manufactures your bike?");
        String makeAnswer = scanner.nextLine();

        System.out.println("What model is your bike?");
        String modelAnswer = scanner.nextLine();

        System.out.println("How much horsepower does it have?");
        int horsePowerAnswer = Integer.parseInt(scanner.nextLine());

        System.out.println("What style of bike is it?");
        String styleAnswer = scanner.nextLine();

        System.out.println("Is it priced under $10000");
        String isReasonablyPricedAnswer = scanner.nextLine();
        if(isReasonablyPricedAnswer.equalsIgnoreCase("yes")) {
            motorcycle.setReasonablyPriced(true);
        } else {
            motorcycle.setReasonablyPriced(false);
        }

        motorcycle.setMake(makeAnswer);
        motorcycle.setModel(modelAnswer);
        motorcycle.setHorsePower(horsePowerAnswer);
        motorcycle.setSyle(styleAnswer);


    }

}
