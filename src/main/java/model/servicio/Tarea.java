package model.servicio;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tarea")
    private String tarea;

    @Column(name = "duracion")
    private Double duracion;
}
