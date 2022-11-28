public class T1_4 {
    String usr;
    float x;
    
    T1_4(String usr, float x){
        this.usr = usr;
        this.x = x;
    }
    
    public static void main(String[] args){
    	T1_4 object = new T1_4("Aleksandra", 151.512f);
        System.out.println("The nickname: "+object.usr);
    }
}