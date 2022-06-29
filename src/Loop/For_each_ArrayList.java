package Loop;

import java.util.ArrayList;

public class For_each_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> carlist = new ArrayList<>();
           carlist.add("car 1");
           carlist.add("car 2");
           carlist.add("car 3");
           carlist.add("car 4");

           for(String data :carlist)
           {
        	   System.out.println(data);
           }
           
           
	}

}
