package com.sokima.pattern.flyweight;

/**
 * Book Class.
 * It stores extrinsic state of the object.
 * Fields are unique and may be altered at runtime by our application.
 *
 * @author Roman Denysov
 */
public class Book {
    private String name;
    private double price;
    private BookType type;

    public Book() {
    }

    public Book(String name, double price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public BookType getType() {
        return type;
    }
}
