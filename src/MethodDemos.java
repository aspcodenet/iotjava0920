public class MethodDemos {

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


    public static void addAndPrintAge(int age){
        age++;
        System.out.println(age);
    }
     

    // 1. ByRef/ByValue
    // 2. return 
    // 3. debug och step av metodanrop
    // 3. egen tid
    public static void run(){
        int age = 52;
        System.out.println(age);
        addAndPrintAge(age);
        System.out.println(age);




        int smallest = minFunction(12,13);
        System.out.println(smallest);         

        int i = 12;
        int smallest2 = minFunction(120,i);
        System.out.println(smallest2);         


    }
}
