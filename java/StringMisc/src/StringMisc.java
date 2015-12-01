import java.util.ArrayList;

/**
 * Created by Adarsh on 11/30/2015.
 */
public class StringMisc {
    String recRevstr = "";


    //HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

    public static void main(String[] args){
        String str = "ABCDEFG";
        //char[] array = "ABCDEFG" ;
        ArrayList one = new ArrayList();
        ArrayList two = new ArrayList();
        String second = "ABCDEFG";
        System.out.println(one == two);
        System.out.println(str.equals(second));
        System.out.println(str.compareTo(second));
        System.out.println("\n "+str);
        //System.out.println(a);


        char[] arr = str.toCharArray();
        String str2 = new String();
        str2 = str2.copyValueOf(arr);
        System.out.println("\n "+arr[5] );
        //System.out.println("\n "+s );
        System.out.println("\n "+ str2);

        reverseString(str);



        //recursiveReverse(str);


    }

    public static void reverseString(String str3){
        System.out.println("\n **** "+ str3);
        String strRev = "";
        for(int i = str3.length() - 1; i >= 0 ; i--){
            strRev += str3.charAt(i);
        }

        System.out.println(strRev);
    }

  /*
    public static void recursiveReverse(String str4){
        System.out.println("\n **** "+ str4);
        String strRecRev = "";

    }
    */
}
