public class MethodDemos {


    public static void addAndPrintAge(int age){
        age++;
        System.out.println(age);//53
    }

    public static void addAndPrintAgeForPlayer(Player player){
        player.setAge(player.getAge()+1);
        System.out.println(player.getAge());
    }
    // 1. ByRef/ByValue
    // 2. return 
    // 3. debug och step av metodanrop
    // 3. egen tid

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2){
           min = n2;
        }
        else{
           min = n1;
        }
        return min; 
     }

     public static float minFunctionF(float n1, float n2) {
        float min;
        if (n1 > n2){
           min = n2;
        }
        else{
           min = n1;
        }
        return min; 
     }


    public static void run(){
        //int i = 12.0;
        double aa = 12.23;
        float tal1f = 12.23f;
        float tal2f = 12.11f;
        float minstaF = minFunctionF(tal1f, tal2f);

        int tal1 = 12;
        int tal2 = 23;
        System.out.println("Innan");
        int minsta2 = 12+12;
        int minsta = minFunction(tal1,tal2);
        System.out.println("Klar");
        

        Player player = new Player();
        player.setAge(52);
        player.setName("Peter Forsberg");
        player.setTeam("Colorado");
        System.out.println(player.getAge()); // 52
        addAndPrintAgeForPlayer(player); // 53
        System.out.println(player.getAge());
        System.out.println("Klart");
        
        int age = 52;
        System.out.println(age); // 52
        addAndPrintAge(age);//53
        System.out.println(age); //52
        return;



        // int smallest = minFunction(12,13);
        // System.out.println(smallest);         

        // int i = 12;
        // int smallest2 = minFunction(120,i);
        // System.out.println(smallest2);         


    }
}
