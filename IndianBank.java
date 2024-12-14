public class IndianBank {

  private Long acnum = 0l;
   private double balance = 0;
    private String name=null;


   private int pin=2003;


    public IndianBank() {

    }

    public long getAcnum() {
        return acnum;
    }

    public void setAcnum(long acnum) {
        this.acnum = acnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "IndianBank{" +
                "acnum=" + acnum +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", pin=" + pin +
                '}';
    }
}
