package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] checkArray = {"apple", "banana", "grape", "orange"};
		
		for(String search: checkArray) {
			dictionary.result(search);
		}
	}

}
