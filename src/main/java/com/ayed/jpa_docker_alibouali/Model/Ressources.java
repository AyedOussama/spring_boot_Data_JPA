package com.ayed.jpa_docker_alibouali.Model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@Entity
/*
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Ressource_type")// only with single table
*/
//@Inheritance(strategy = InheritanceType.JOINED)//no dicriminator column needed
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Ressources  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
