package org.acme;

public enum ProductEnum {
    ARROZ("Arroz", 2.50),
    FRIJOLES("Frijoles", 3.00),
    LENTEJAS("Lentejas", 1.75),
    AZUCAR("Azúcar", 1.50),
    SAL("Sal", 0.90),
    ACEITE("Aceite", 4.20),
    HARINA("Harina", 2.00),
    PASTA("Pasta", 1.20),
    LECHE("Leche", 1.60),
    PAN("Pan", 1.10);

    private final String name;
    
    private final double price;

    ProductEnum(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
