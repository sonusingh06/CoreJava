package com.collectionframework.map;

public class HashMapDemo {
    public static void main(String[] args) {
        java.util.HashMap<String,Integer> hashMap= new java.util.HashMap<>(12,0.56f);
        hashMap.put("Sonu Singh",33);
        hashMap.put("Rutuparna Das",39);
        hashMap.put("Sujata Singh",83);
        //Here it replace the older value 33 and modify to 12
        hashMap.put("Sonu Singh",12);

        /*
        Don't give the Proper Order As you Created
        Map shows like {Key=Value,...}
         */
        System.out.println("Get The Map:"+hashMap);
        /*
        Remove & Get operation by key
        Return value if key is correct otherwise null.
         */
        System.out.println(hashMap.remove("Sonu Singh"));
        System.out.println(hashMap.get("Sonu Singh"));

        System.out.println(hashMap.containsKey("Sonu Singh"));
        System.out.println(hashMap.containsValue(12));
        System.out.println();


        System.out.println(hashMap.size());
        hashMap.clear(); //Return Void
        System.out.println(hashMap);

    }
}