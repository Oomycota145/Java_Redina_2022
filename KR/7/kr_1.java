package kr_7_1;

class Connection {
	  int id;
	  public Connection(int new_id) {
	    this.id = new_id;
	  }
	  
	}
	class ConnectionManager {
	  Connection[] cons;
	  int len = 0;
	  
	  public boolean isEmpty() {
	    return (len == 0);
	  }
	  public void addCon(Connection con) {
	    Connection[] cons_new = new Connection[len+1];
	    for (int i = 0; i < len; i++) {
	      cons_new[i] = cons[i];
	    }
	    cons_new[len] = con;
	    cons = cons_new;
	    len += 1;
	  }
	  public Connection getNext() {
	    Connection answer = cons[len-1];
	    Connection[] cons_new = new Connection[len-1];
	    for (int i = 0; i < len-1; i++) {
	      cons_new[i] = cons[i];
	    }
	    cons = cons_new;
	    len -= 1;
	    return answer;
	  }
	}
	public class kr_1 {
	  public static void main(String[] args) {
	    Connection c1 = new Connection(1);
	    Connection c2 = new Connection(2);
	    Connection c3 = new Connection(3);
	    Connection c4 = new Connection(5);
	    ConnectionManager cm = new ConnectionManager();
	    cm.addCon(c1);
	    cm.addCon(c2);
	    cm.addCon(c3);
	    cm.addCon(c4);
	    boolean working = true;
	    while(working == true) {
	      System.out.printf("next id: %d\n", cm.getNext().id);
	      working = !cm.isEmpty();
	    }
	    System.out.print("Stop working");
	  }
	}