package model.prestacion;

import jakarta.persistence.*;
import lombok.Data;
import model.persona.Consumidor;
import model.persona.DiaSem;
import model.persona.FranjaHoraria;
import model.persona.Prestador;

@Data
@Entity
@Table(name = "prestacion")
public class Prestacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Boolean finalizado;

    @Column
    private Double duracionAprox;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_consumidor",referencedColumnName = "id")
    private Consumidor consumidor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_prestador",referencedColumnName = "id")
    private Prestador prestador;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="id_horario", referencedColumnName = "id")
    private FranjaHoraria franjaHoraria;

    @Enumerated(EnumType.STRING)
    private DiaSem diaSem;
}
