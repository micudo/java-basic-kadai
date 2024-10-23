package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce() {
		this.familyName = "加藤";
		this.address = "東京都中野区〇×";
		
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		eachIntroduce();
		System.out.println();
	}
}
