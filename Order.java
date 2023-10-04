class Order {
    private String name;
    private String type;
    private String sugar;
    private int qty;

    public Order(String name, String type, String sugar, int qty) {
        this.name = name;
        this.type = type;
        this.sugar = sugar;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSugar() {
        return sugar;
    }

    public int getQty() {
        return qty;
    }
}
