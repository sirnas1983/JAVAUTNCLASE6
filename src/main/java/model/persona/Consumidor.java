package model.persona;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(length = 35)
    protected String nombre;

    @Column(length = 35)
    protected String apellido;

    @Column(length = 50)
    protected String email;

    @Column(length = 13)
    protected String nroDoc;

    @Enumerated(EnumType.STRING)
    protected TipoDoc tipoDoc;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    protected Set<Telefono> telefonos;
}
