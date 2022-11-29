package t5_1;

import java.util.Arrays;

public class Text {
    private String title;
    private Sentence[] text;

    public Text(String title, Sentence[] text) {
        this.title = title;
        this.text = text;
    }

    public void addSentence(Sentence sentence){
        Sentence[] tempArray = new Sentence[text.length + 1];

        for (int i = 0; i < text.length; i++) {
            tempArray[i] = text[i];
        }

        tempArray[tempArray.length - 1] = sentence;

        text = tempArray;
    }

    public void show(){
        System.out.println(title);
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Arrays.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(text);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        for (Sentence sentence : this.text) {
            text.append(sentence.toString());
        }

        return text.toString();
    }
}
