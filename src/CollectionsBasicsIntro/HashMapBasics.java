package CollectionsBasicsIntro;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapBasics {
        public static void main(String[] args) {
            // Creating a HashMap for integers
            HashMap<Integer, String> map = new HashMap<>();

            // Adding elements to the HashMap
            map.put(3, "IT");
            map.put(1, "CSE");
            map.put(4, "MECH");
            map.put(2, "ECE");

            // Displaying the initial HashMap
            System.out.println("Initial HashMap: " + map);

            // Adding elements
            map.put(6, "Civil");
            map.put(2, "EEE"); // Updating the value for an existing key
            System.out.println("HashMap after adding and updating elements: " + map);

            // Accessing elements using keys
            System.out.println("Value for key 3: " + map.get(3));

            // Removing elements
            map.remove(1);
            System.out.println("HashMap after removing key 1: " + map);

            // Checking if the HashMap contains a specific key
            System.out.println("Does HashMap contain key 4? " + map.containsKey(4));

            System.out.println("Does HashMap contain value 'cse'? " + map.containsValue("cse"));

            // Iterating through the HashMap
            System.out.println("Iterating through HashMap:");
            for (Integer key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
/*
            for(Map.Entry<Integer,String> i: hashMap.entrySet())
            {
                System.out.println("Key: "+i.getKey()+", Value: "+i.getValue());
            }
*/
            /*for(String val: hashMap.values())
            {
                System.out.println("Values: "+val);
            }*/

            /*HashMap: Allows one null key.
            TreeMap: Does not allow null keys. (sorted output)
            It throws a NullPointerException if you attempt to insert a null key.*/

           // map.put(null,"DS");
          //  System.out.println(map.get(null));
            //map.put(null,"AIML");  //only current null key is allowed.
           // System.out.println(map.get(null));

            System.out.println(map.values());
            System.out.println(map.getOrDefault(10,"GRIET"));  //here griet is default value
            //since key 10 doesn't exists

            map.putIfAbsent(4,"Computers"); //since key 4 is already present it wont affect
          //  map1.putAll(map2);
            map.compute(4,(k,v)->v.concat("CSE"));
            map.computeIfAbsent(1,k->"CSE");
            System.out.println(map);
        }
    }

