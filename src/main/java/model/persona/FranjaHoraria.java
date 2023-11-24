package model.persona;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "franja_horaria")
public class FranjaHoraria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int horaInicial;

    @Column
    private int horaFinal;

}
