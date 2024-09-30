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
@Audited

public class Libro extends Base{

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Fecha")
    private int fecha;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Paginas")
    private int paginas;

    @Column(name = "Autor")
    private String autor;

    //Relacion de libro con persona
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_persona")
    private Persona persona;

    //Relacion de libro con autor
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_autor")
    private Autor autores;
}
