package Basic_Programs;
import Basic_Programs.HasA;
import Basic_Programs.OrderConfirm;
public class Hotel {
public static void main(String[] args) {
	HasA c=new HasA(10);
	OrderConfirm b=new OrderConfirm();
	b.setOrderfood(10);
	c.setOrderno(2);
	System.out.println(b);
	System.out.println(c);
	OrderConfirm d =new OrderConfirm();
	b.a.setOrderno(10);
	System.out.println(b.getOrderno().getOrderno());

	//System.out.println(b.a.getOrderno());
	
}
}
