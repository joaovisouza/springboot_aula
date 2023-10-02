package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB-PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel>  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProcuct;
    private String name;
    private BigDecimal value;

    public UUID getIdProcuct() {
        return idProcuct;
    }

    public void setIdProcuct(UUID idProcuct) {
        this.idProcuct = idProcuct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
