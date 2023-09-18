package Account;

public class Account {
   private boolean active;
   private int number;
   public Account() {

       this.active = false;
       this.number = 0;
   }
   public void activate() {

       this.active = true;
   }

    public boolean isActive() {

       return this.active;
    }

    public void giveNumber(){
       this.number = 1;
    }
    public int hasNumber() {

        return this.number;
    }
}