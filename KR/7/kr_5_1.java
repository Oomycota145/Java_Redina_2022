package kr_7_1;

class Word {
	  String body;
	  
	  public Word(String word) {
	    this.body = word;
	  }
	}
	class Sent {
	  Word[] arrayw;
	  
	  public Sent(Word[] array) {
	    this.arrayw = array;
	  }
	  @Override
	  public String toString() {
	    String answer = "";
	    for(Word w: this.arrayw) {
	      answer += w.body;
	    }
	    return answer;
	  }
	}
	class Text{
	  Sent[] body;
	  Sent head ;
	  
	  public Text(Sent[] body, Sent head) {
	    this.body = body;
	    this.head = head;
	  }
	  public void printBody() {
	    String answer = "";
	    for(Sent s: this.body) {
	      answer += s.toString();
	    }
	    System.out.println(answer);
	  }
	  public void printHead() {
	    String answer = this.head.toString();
	    System.out.println(answer);
	  }
	  public void addToText(Sent addition) {
	    Sent[] new_array = new Sent[this.body.length + 1];
	    for (int i = 0; i < this.body.length; i++) {
	      new_array[i] = this.body[i];
	    }
	    new_array[this.body.length] = addition;
	    this.body = new_array;
	  }
	}
	public class kr_5_1 {

	  public static void main(String[] args) {
	    Word w1 = new Word("Hello, ");
	    Word w2 = new Word("my ");
	    Word w3 = new Word("friend!");
	    Word w4 = new Word("Hello");
	    Word[] wa1 = new Word[] {w1};
	    Word[] wa1_2 = new Word[] {w2};
	    Sent s1 = new Sent(wa1);
	    Sent s1_2 = new Sent(wa1_2);
	    Word[] wa2 = new Word[] {w3};
	    Sent s2 = new Sent(wa2);
	    Word[] wa3 = new Word[] {w4};
	    Sent s3 = new Sent(wa3);
	    Sent[] sa = new Sent[] {s1, s1_2};
	    Text t = new Text(sa, s3);
	    System.out.print("Our text is:\n");
	    t.printHead();
	    t.printBody();
	    t.addToText(s2);
	    System.out.print("And now our text is:\n");
	    t.printHead();
	    t.printBody();
	  }

	}