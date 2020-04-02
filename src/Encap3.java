public class Encap3 {
    private long account_number;
    private String alias;
    private float amount;
   // write only just getter
    public long getAccount_number() {
        return account_number;
    }
  //read only just setter
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

