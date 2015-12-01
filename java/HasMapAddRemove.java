/**
 * Created by Adarsh on 11/30/2015.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;





public class HasMapAddRemove {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        hmap.put("abc",123);
        hmap.put("xyz",456);
        hmap.put("qpr",789);
        hmap.put("rst",100);

        int retrieval = hmap.get("qpr");
        System.out.println("\n QPR = "+ retrieval);

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){

            Map.Entry mapentry = (Map.Entry)iterator.next();
            System.out.println("Key :"+mapentry.getKey() + "\t Value :"+ mapentry.getValue() );
        }

        System.out.print("\n\n****\n");

        //int var = hmap.get("abc");
        hmap.remove("rst");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){

            Map.Entry mapentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key :"+mapentry2.getKey() + "\t Value :"+ mapentry2.getValue() );
        }

    }



}
