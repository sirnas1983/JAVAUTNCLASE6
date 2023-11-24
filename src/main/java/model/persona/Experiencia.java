package model.persona;

import jakarta.persistence.*;
import lombok.Data;
import model.persona.Prestador;

import java.awt.Image;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDate fecha;

    @Column
    private String foto;

    @Column
    private String descripcion;
}
