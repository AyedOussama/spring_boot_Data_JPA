package com.ayed.jpa_docker_alibouali.Model.embedded;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "orders")

public class Order {
    @EmbeddedId
    private OrderId id;
    private String order_info;
    private String onotherField;
    @Embedded
    private Adress adress;
}
