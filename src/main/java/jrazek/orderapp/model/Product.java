package jrazek.orderapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Product {
    @Id
    private final java.util.UUID id;
    private String name;
    private int value;

    public Product() {
        id = UUID.randomUUID();
    }
    public Product(UUID id) {
        this.id = id;
    }

    public Product(UUID id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
