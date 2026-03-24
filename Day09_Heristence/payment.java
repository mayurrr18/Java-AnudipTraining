/*create interface payment with method pay   implement this interface in upi payment and cash payment */

interface payments{
    void pay();
}

class upipayment implements payments{
    public void pay(){
        System.out.println("pay in upi");
    }
}

class cashpayment implements payments{
    public void pay(){

        System.out.println("pay in cash");
    }
}

public class payment {
    public static void main(String[] args) {
        upipayment up=new upipayment();
        up.pay();
        cashpayment cs=new cashpayment();
        cs.pay();
    }
    
}



/*implement multi 
take 3 clases 
rectangle[to acceot data] class compute[calculation] class result[to print op of rectangle] */