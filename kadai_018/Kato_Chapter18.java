package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤";
	public String givenName  = "";
	public String address    = "東京都中野区◯✕";
	

	private void commonIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です。");
		System.out.println("住所は" + address + "です。");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}