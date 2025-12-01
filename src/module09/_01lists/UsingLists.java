package module09._01lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class UsingLists {

	public static void main(String[] args) {
		ArrayList<String> rainbow1 = new ArrayList<String>();

		String[] rainbow = new String[7];

		rainbow[0] = "red";
		rainbow[1] = "orange";
		rainbow[2] = "yellow";
		rainbow[3] = "green";
		rainbow[4] = "blue";
		rainbow[5] = "indigo";
		rainbow[6] = "violet";
		
		rainbow1.add("red");
		rainbow1.add("orange");
		rainbow1.add("yellow");
		
		System.out.println(rainbow);
		System.out.println(rainbow1.get(0));
		System.out.println(rainbow1.size());
		rainbow1.set(2,"Boo!");

		//your code here!!
		
		LinkedList<String> slayWords1 = new LinkedList<String>(); 

		String[] slayWords = new String[3];
		
		slayWords[0] = "serving cunt";
		slayWords[1] = "deadpan";
		slayWords[2] = "what the fuck";

		slayWords1.add("hot cheeto dust");
		System.out.println(slayWords1.get(0));
		System.out.println(slayWords1.size());
		slayWords1.add("sticky fingers");

	}
}
