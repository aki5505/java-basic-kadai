package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

    public String getMyChoice() {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (input.equals("r") || input.equals("s") || input.equals("p")) {

            return input;

        } else {
            System.out.println("入力が正しくありません");
            return getMyChoice();
        }

    }

    public static String getRandom() {

        String[] j = { "r", "s", "p" };

        int k = (int) Math.floor(Math.random() * 3);

        return j[k];

    }

    public void playGame() {

        System.out.println("自分のじゃんけんの手を入力しましょう" + "\n" + "グーはrockのrを入力しましょう" + "\n" + "チョキはscissorsのsを入力しましょう" + "\n" +
                "パーはpaperのpを入力しましょう");

        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("r", "グー");
        hashMap.put("s", "チョキ");
        hashMap.put("p", "パー");

        String me = getMyChoice();
        String rival = getRandom();

        System.out.println("自分の手は" + hashMap.get(me) + "," + "対戦相手の手は" + hashMap.get(rival));

        if (me.equals(rival)) {
            System.out.println("あいこです");
        } else if (me.equals("r") && rival.equals("p")) {
            System.out.println("自分の負けです");
        } else if (me.equals("r") && rival.equals("s")) {
            System.out.println("自分の勝ちです");
        } else if (me.equals("s") && rival.equals("r")) {
            System.out.println("自分の負けです");
        } else if (me.equals("s") && rival.equals("p")) {
            System.out.println("自分の勝ちです");
        } else if (me.equals("p") && rival.equals("s")) {
            System.out.println("自分の負けです");
        } else if (me.equals("p") && rival.equals("r")) {
            System.out.println("自分の勝ちです");
        }

    }

}
