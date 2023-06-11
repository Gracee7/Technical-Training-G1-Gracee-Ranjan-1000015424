//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

import java.util.ArrayList;
//import java.util.List;

public class CaptialConversion {

    public static ArrayList<String> capitalize(ArrayList<String> arr) {
        ArrayList<String> capitalizedArr = new ArrayList<String>();
        for (String str : arr) {
            String capitalizedStr = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            capitalizedArr.add(capitalizedStr);
        }
        return capitalizedArr;
    }
public static void main (String args[])
{
   ArrayList<String> al = new ArrayList<String>();
   al.add("hello");
   al.add("java");
   capitalize(al);

}

}
