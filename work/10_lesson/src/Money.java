public class Money {

    private long rubles;

    private byte cents;

    public Money(long rubles, byte cents) {
        if (rubles < 0 || cents < 0 || cents > 99) {
            System.out.println("ERROR!!!");
        } else {
            this.rubles = rubles;
            this.cents = cents;
        }
    }


    public byte getCents() {
        return cents;
    }

    public long getRubles() {
        return rubles;
    }

    public String getDescription() {
        return "" + rubles + "," + cents;
    }
}
