public class Item {
    private String name;
    private double price;
    private int quantity;
    private String type;

    public Item(String name, double price, int quantity, String type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public double calculateTax() {
        switch (type.toLowerCase()) {
            case "raw":
                return price * 0.155;
            case "manufactured":
                return price * 0.205;
            default:
                return 0;
        }
    }

    public double finalPrice() {
        return price + calculateTax();
    }

    @Override
    public String toString() {
        return String.format("Item Name: %s, Item Price: %.2f, Sales Tax Liability: %.2f, Final Price: %.2f",
                name, price, calculateTax(), finalPrice());
    }
}
