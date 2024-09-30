package com.example.inicial1.entities;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Localidad extends Base{

    @Column(name = "denominacion")
    private String denominacion;

    //Relacion entre localidad y domicilio
    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
    private List<Domicilio> domicilios;


}
