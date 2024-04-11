package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public Jyanken_Chapter26() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}
	
	public String getMyChoice() {
		while(true) {
			System.out.println("r、s、pのどれかを入力してエンターを押してください");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			
			if ( input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input;
			} else {
				System.out.println("無効な入力です。r、s、pのどれかを入力してください。");
			}
		}
	}
	
	public String getRandom() {
		String[] oppChoice = {"r", "s", "p"};
		
		double choiceNum = Math.floor(Math.random() * 3 );
		int choiceNumInt = (int) choiceNum;
		
		return oppChoice[choiceNumInt];
	}
	
	private void win() {
		System.out.println("自分の勝ちです");
	}
	
	private void draw() {
		System.out.println("あいこです");
	}
	
	private void lose() {
		System.out.println("自分の負けです");
	}
	
	public void playGame(String myChoice, String oppChoice) {
		HashMap<String, String> jyankenTranslate = new HashMap<String, String>();
		jyankenTranslate.put("r", "グー");
		jyankenTranslate.put("s", "チョキ");
		jyankenTranslate.put("p", "パー");
		
		String myJyanken = jyankenTranslate.get(myChoice);
		String oppJyanken = jyankenTranslate.get(oppChoice);
		
		System.out.println("自分の手は" + myJyanken + "、相手の手は" + oppJyanken);
		
		if(myChoice.equals(oppChoice)) {
			draw();
		} else if (myChoice.equals("r") && oppChoice.equals("s") 
				|| myChoice.equals("s") && oppChoice.equals("p") 
				|| myChoice.equals("p") && oppChoice.equals("r")) {
			win();
		} else {
			lose();
		}
	}
}
