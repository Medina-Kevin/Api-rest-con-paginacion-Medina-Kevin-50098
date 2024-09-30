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
@Table(name = "autor")
public class Autor extends Base{

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Biografia", length = 1500)
    private String biografia;

    //Relacion entre autor y libro
    @OneToMany(mappedBy = "autores", cascade = CascadeType.ALL)
    private List<Libro> libros;
}
