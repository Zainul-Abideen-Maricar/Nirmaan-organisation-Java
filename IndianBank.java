public class IndianBank {

  private int acnum = 123456789;
   private double balance = 20000;
    private String name="zainul";


   private int pin=2003;


    public IndianBank() {

    }

    public int getAcnum() {
        return acnum;
    }

    public void setAcnum(int acnum) {
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
