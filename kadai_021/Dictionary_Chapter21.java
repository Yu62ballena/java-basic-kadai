package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dicWords = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
		dicWords.put("apple", "りんご");
		dicWords.put("peach", "桃");
		dicWords.put("banana", "バナナ");
		dicWords.put("lemon", "レモン");
		dicWords.put("pear", "梨");
		dicWords.put("kiwi", "キウィ");
		dicWords.put("strawberry", "いちご");
		dicWords.put("grape", "ぶどう");
		dicWords.put("muscat", "マスカット");
		dicWords.put("cherry", "さくらんぼ");
	}
	
	public void result(String searchWord) {
		if(dicWords.containsKey(searchWord)) {
			String meaning = dicWords.get(searchWord);
			System.out.println(searchWord + "の意味は" + meaning);
		} else {
			System.out.println(searchWord + "は辞書に存在しません");
		}
	}
	

}
