import java.util.ArrayList;

public class HockeyDatabase {
    public static void showMenu(){
        ArrayList<String> players = new ArrayList<>();

        while(true){
            System.out.println("1. Skapa ny player");
            System.out.println("2. Uppdatera player");
            System.out.println("3. Ta bort player");
            System.out.println("4. Lista alla");
            System.out.println("5. Avsluta");

            System.out.print("Vad vill du göra:");
            String input = System.console().readLine();
            if(input.equals("5")){
                break;
            }
            else if(input.equals("1")){
                System.out.println("***********");
                System.err.println("SKAPA NY PLAYER");
                System.out.println("***********");
                System.out.print("Vad heter spelaren:");
                String newPlayerName = System.console().readLine();
                players.add(newPlayerName);                
            }
            else if(input.equals("4")){
                System.out.println("***********");
                System.err.println("LISTA ALLA");
                System.out.println("***********");
                for(String name : players){
                    System.out.println(name);
                }
            }
        } 

    } 
}
