public class input {
    public static void main(String[] args) {
     /*int firstno = Integer.parseInt(args[0]);// string is converted into integer
        int secondno = Integer.parseInt(args[1]);
        int result = firstno + secondno ;
        System.out.println("Result is : "+result);
    // if we forgot to give the argument the it will give us the arrayIndexOutOfBound exception.
     */   
int sum = 0;
     for(int i = 0; i<args.length; i++){
sum = sum +Integer.parseInt(args[i]);

     }
     System.out.println("sum iss "+sum);
    }
}
