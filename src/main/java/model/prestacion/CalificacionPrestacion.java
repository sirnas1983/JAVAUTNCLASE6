package model.prestacion;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Table(name = "calificacion_prestacion")
public class CalificacionPrestacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prestacion_id", referencedColumnName="id")
    private Prestacion prestacion;

    @Column(name="fecha")
    private LocalDate fecha;

    @Column(name="calificacion", length = 5)
    private int calificacion;

    @Column(name = "opinion")
    private String opinion;

}
