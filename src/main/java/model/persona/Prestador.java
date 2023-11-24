package model.persona;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.servicio.Servicio;

import java.time.LocalDate;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Prestador extends Consumidor{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int cobertura;
    @Column
    private String cuit;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNac;

    @Column(name = "foto_perfil")
    private String foto;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prestador_id", referencedColumnName = "id")
    private Set<Experiencia> experiencias;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Servicio> servicios;

    @ElementCollection(targetClass = DiaSem.class)
    @CollectionTable(name = "dias", joinColumns = @JoinColumn(name = "prestador_id"))
    @Column(name = "dia_sem", nullable = false)
    @Enumerated(EnumType.STRING)
    private Set<DiaSem> diaSem;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<FranjaHoraria> franjasHorarias;
}
