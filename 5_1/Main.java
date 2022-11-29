package t5_1;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Nelibi ");
        Word word2 = new Word("si ");
        Word word3 = new Word("mi. ");

        Sentence sentence = new Sentence(new Word[]{
                word1,
                word2,
                word3
        });

        Text text = new Text("Java", new Sentence[]{
                sentence
        });

        text.show();

        text.addSentence(new Sentence(new Word[]{
                new Word("Chci "),
                new Word("jit "),
                new Word("domu "),
                new Word("a "),
                new Word("spat. ")
        }));

        text.show();
    }
}