package Loop;

import java.util.ArrayList;

public class For_Loop_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> carlist =new ArrayList<>();
		
		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		carlist.add("car5");
		for (int i=0;i<carlist.size();i++)
		{
			//System.out.println(carlist.get(i));   (or)
			String car = carlist.get(i);
			System.out.println(car);
		}
	}

}
