package Basic_Programs;

 class HasA {
  private static int orderno;

public int getOrderno() {
	return orderno;
}

public void setOrderno(int orderno) {
	this.orderno = orderno;
}
  HasA(){
	  
  }
  HasA(int orderno){
	  this.orderno=orderno;
	  System.out.println(orderno);
  }
  public static void main(String[] args) {
	System.out.println(orderno);
}
 }
