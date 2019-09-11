import java.util.Scanner;

public class ConsoleReader {

    public static void run() {
        Scanner command = new Scanner(System.in);

        System.out.println("Enter city code: ");
        boolean running = true;

        while(running){
            String input = command.nextLine();

            if(input.contains("exit")){
                System.out.println("Application Closed");
                running = false;
                break;
            }
            else {
                System.out.println(ApiReader.getCapitalCity(input));
            }
        }
        command.close();
    }
}
