package model.servicio;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="servicio")
    private String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tarea> tareas;
}
