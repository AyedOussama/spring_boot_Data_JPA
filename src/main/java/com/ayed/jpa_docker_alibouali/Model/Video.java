package com.ayed.jpa_docker_alibouali.Model;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;
import org.hibernate.boot.jaxb.mapping.marshall.PolymorphismTypeMarshalling;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V") for single table only
//@PrimaryKeyJoinColumn(name = "video_id") for joined table only
@Polymorphism(type= PolymorphismType.EXPLICIT)
public class Video extends Ressources{
    private int length;
}
