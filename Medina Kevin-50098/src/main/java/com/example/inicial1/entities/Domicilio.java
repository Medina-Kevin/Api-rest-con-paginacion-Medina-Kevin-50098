package com.example.inicial1.entities;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited

public class Domicilio extends Base{

    @JoinColumn(name = "calle")
    private String calle;

    @JoinColumn(name = "numero")
    private int numero;

    //Relacion entre domicilio y localidad
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
