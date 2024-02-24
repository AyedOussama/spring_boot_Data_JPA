package com.ayed.jpa_docker_alibouali.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder

@MappedSuperclass
public class BaseEntitty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime last_updatedAt;
    private String createdBy;
    private String  last_updatedBy;
}
