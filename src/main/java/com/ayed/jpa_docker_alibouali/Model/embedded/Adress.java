package com.ayed.jpa_docker_alibouali.Model.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Embeddable
public class Adress {
    private String street;
    private String city;
    private String houseNumber;
    private String zipCode;
}
