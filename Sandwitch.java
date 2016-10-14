import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

public class Sandwitch {
	
	private String sandwitch;
	
	public Sandwitch(){
	}
	
	public static String getSandwitch(String sandwitch){
		
		sandwitch.toLowerCase();
		int index1 = sandwitch.indexOf("chleb") + 5;
		int index2 = sandwitch.lastIndexOf("chleb");
		if (index1 < index2){
			String between = sandwitch.substring(index1, index2);
			System.out.println(between);
			return between;
		}
		else{
			return " ";
		}
	}
	

}
