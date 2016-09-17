/**
 * Created by ljj on 16/9/11.
 */
public  class Money implements Expression{

    protected int amount ;
    protected String currency;



    Money times(int multipliter) {
        return new Money(amount * multipliter, currency);
    };

    public Money(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money)obj;
        return amount == money.amount &&
                currency().equals(money.currency());
    }

    public static Money dollar(int amount) {

        return new Money(amount,"USD");
    }

    public static Money franc(int amount) {

        return new Money(amount, "CHF");
    }

    public String currency() {

        return currency;
    }

    public String toString() {
        return amount + " "+ currency;
    }


    public Expression plus(Money addend) {
        return new Money(amount + addend.amount,currency);
    }
}
