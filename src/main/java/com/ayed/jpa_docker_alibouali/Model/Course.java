package com.ayed.jpa_docker_alibouali.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntitty{

    private String title;
    private String description;


   @ManyToMany
   @JoinTable(
           name = "course_author",
           joinColumns = @JoinColumn(name = "course_id"),
           inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;


    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
