import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Adarsh on 12/1/2015.
 */
public class CheckForAnagrams {

    public static void main(String[] args){
        String one = "radeon";
        System.out.println(one.length());
        String two = "dreno";
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        for(int i=0; i<one.length();i++){
            if(!hmap.containsKey(one.charAt(i))) {
                hmap.put(one.charAt(i), 1);
            }
            else{
                int temp = hmap.get(one.charAt(i));
                temp += 1;
                hmap.replace(one.charAt(i),temp);
            }
        }

        for(int i=0; i<two.length();i++){
            if(!hmap.containsKey(two.charAt(i)) || hmap.get(two.charAt(i)) <= 0) {
                //hmap.put(one.charAt(i), 1);
                return;
            }
            else{
                int temp = hmap.get(two.charAt(i));
                temp -= 1;
                hmap.replace(one.charAt(i),temp);
            }
        }

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry mentry= (Map.Entry)iterator.next();
            if(!mentry.getValue().equals(0)){
                System.out.println("Not Anagrams");
                return;
            }


        }

        System.out.println("The given strings are anagrams!");
    }

}
