/**
 * Created by ljj on 16/9/16.
 */
public class Bank {
    Money reduce(Expression source,String to) {
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }

}
