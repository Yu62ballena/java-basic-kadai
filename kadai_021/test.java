package kadai_021;
import java.util.HashMap;


	public class test {

	   public static void main(String[] args) {
	      HashMap<Integer,String> humanMap = new HashMap<Integer,String>();

	      humanMap.put(1,"Kato");
	      humanMap.put(2,"Tanaka");
	      humanMap.put(3,"Yamada");
			
	      System.out.println("キーが1の人の値は" + humanMap.get(1));
	      System.out.println("キーが2の人の値は" + humanMap.get(2));
	      System.out.println("キーが3の人の値は" + humanMap.get(3));

	   }

	}


