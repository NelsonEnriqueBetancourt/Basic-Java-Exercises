import javax.persistence.*;

@Entity
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Nombre", length = 50)
    private String Nombre;
    @Column(name = "Opciones", length = 50)
    private String Opciones;

    public Printer(Integer id, String nombre, String opciones){
        super();
        this.id=id;
        this.Nombre=nombre;
        this.Opciones=opciones;
    }

    public Printer(){
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getOpciones() {
        return Opciones;
    }

    public void setOpciones(String opciones) {
        Opciones = opciones;
    }
}
