package entidades;

import jakarta.persistence.*;

@Entity
@Table(name="carreras")
public class Carrera {

    @Column(name = "id")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nombre;
    private String abreviatura;

    public Carrera(){

    }

    public Carrera(long id, String nombre, String abreviatura){

        this.id = id;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                '}';
    }
}
