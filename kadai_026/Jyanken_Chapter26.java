package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーの場合はrockの頭文字の「r」を入力して下さい");
			System.out.println("チョキの場合はscissorsの頭文字の「s」を入力して下さい");
			System.out.println("パーの場合はpaperの頭文字の「p」を入力して下さい");
			
			String rsp1 = scan.nextLine();
			if(!"r".equals(rsp1) && !"s".equals(rsp1) && !"p".equals(rsp1)) {
				System.out.println("「r」「p」「s」以外の文字が入力されています。「r」「p」「s」のいずれかを入力して下さい。");
			} else {
				return rsp1;
			}
		}
	}
	
	public String getRandom() {
		String[] rps2 = {"r", "s", "p"};
		 int random = (int) Math.floor(Math.random() * rps2.length);
		 
		 return rps2[random];
	}
	
	public void playGame() {
		String me = getMyChoice();
		String you = getRandom();
		
		HashMap<String,String> choice = new HashMap<String,String>();
		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");
		
		System.out.println("自分の手は" + choice.get(me) + ",対戦相手の手は" + choice.get(you));
		
		 if (me.equals(you)) {
		        System.out.println("あいこです。");
		    } else if ((me.equals("r") && you.equals("s")) 
		    		|| (me.equals("s") && you.equals("p")) 
		    		|| (me.equals("p") && you.equals("r"))) {
		        System.out.println("自分の勝ちです。");
		    } else if((me.equals("r") && you.equals("p")) 
		    		|| (me.equals("s") && you.equals("r")) 
		    		|| (me.equals("p") && you.equals("s"))){
		        System.out.println("自分の負けです。");
		    }
	}
}
