// string buffer

public class mutablestring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mahima");
        System.out.println(sb.capacity()); // 16 + 6
        System.out.println(sb.length()); // 6 
        // new capacity = old capacity*2 + 2;
        //               = 16*2 + 2;

        sb.append("Chandel");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
      // if new capacity is become less then the length of the string become the new capacity. 

       sb.append("Chandel, kanpur, Utter pradesh, India, Nationalitiy Indian ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
    
}
