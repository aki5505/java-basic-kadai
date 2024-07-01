package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

    public void main(String[] text) {

        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("apple", "リンゴ");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "イチゴ");
        dictionary.put("grape", "ブドウ");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "サクランボ");

        for (int x = 0; x < text.length; x++) {

            if (dictionary.containsKey(text[x])) {
                System.out.println(text[x] + "の意味は" + dictionary.get(text[x]));

            } else {
                System.out.println(text[x] + "は辞書に存在しません");
            }

        }

    }

}
