package t5_1;

import java.util.Arrays;

public class Sentence {
    private final Word[] sentence;

    public Sentence(Word[] sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        for (Word word : sentence) {
            text.append(word.toString());
        }

        return text.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Arrays.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sentence);
    }
}