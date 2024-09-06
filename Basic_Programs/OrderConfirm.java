package Basic_Programs;

public class OrderConfirm {
	private int  orderfood;
	public int getOrderfood(){
		return orderfood;
		
	}
	public void setOrderfood(int orderfood) {
		this.orderfood = orderfood;
	}
	static HasA a=new HasA();
	HasA getOrderno() {
		return a;
	}
	public static void main(String[] args) {
		OrderConfirm b= new OrderConfirm();
		b.a.setOrderno(10);
	
		System.out.println(b.a.getOrderno());
	}}