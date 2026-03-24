class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void totalCost() {
        int total = price * quantity;
        System.out.println("Total cost of " + name + ": " + total);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2);
        Product p2 = new Product("Mobile", 20000, 3);

        p1.totalCost();
        p2.totalCost();
    }
}

