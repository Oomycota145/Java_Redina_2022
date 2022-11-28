public class T1_5 {
    String user;
    float x;
    T1_5(String user, float x){
        this.user = user;
        this.x = x;
    }
    public static void main(String[] args){
    	T1_5 object = new T1_5("Aleksandra", 151.512f);
        object.display();
    }

    public void display(){
        System.out.println("The nickname: "+this.user);
    }
}