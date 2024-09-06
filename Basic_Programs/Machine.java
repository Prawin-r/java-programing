package Basic_Programs;

class Machine {
    private static int idCounter = 0; 
    private int productId;
    private String productName;
    private double productPrice;
    private int productWarranty;

    
    public Machine(String productName, double productPrice, int productWarranty) {
        this.productId = generateUniqueId();
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWarranty = productWarranty;
    }

   
    private static int generateUniqueId() {
        return idCounter++;
    }

    
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductWarranty() {
        return productWarranty;
    }

    
    public String toString() {
        return "Machine-" +"productId=" + productId + ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productWarranty=" + productWarranty 
                ;
    }

    public static void main(String[] args) {
        Machine machine1 = new Machine("Machine A", 999.99, 12);
        Machine machine2 = new Machine("Machine B", 1499.99, 24);
        Machine machine3 = new Machine("Machine C", 1999.99, 36);
        
        System.out.println(machine1);
        System.out.println(machine2);
        System.out.println(machine3);
    }
}
