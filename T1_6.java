public class T1_6 {

    String name;
    String say;

    T1_6(String name, String say){
        this.name = name;
        this.say = say;
    }

    public static void main(String[] args) {
    	T1_6 dog1 = new T1_6("Spot", "Ruff!");
    	T1_6 dog2 = new T1_6("Scruffy", "Wurf!");

        dog1.display();
        dog2.display();

        T1_6 dog3 = dog1;
        System.out.println("\n dog3 == dog1: "+ (dog3 == dog1));
        System.out.println("og3.equals(dog1): "+ dog3.equals(dog1));
    }

    public void display(){
        System.out.printf("The dog %s says %s \n", this.name, this.say);
    }
}