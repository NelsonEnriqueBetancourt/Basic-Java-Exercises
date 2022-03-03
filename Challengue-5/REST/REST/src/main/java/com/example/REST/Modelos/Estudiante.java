package com.example.REST.Modelos;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDestudiante")
    private Integer id;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Apellido")
    private String Apellido;

    @Column(name = "Curso")
    private String Curso;

    @Column(name = "Telefono")
    private int Telefono;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "cursosxestudiantes",
              joinColumns=@JoinColumn(name = "IDestudiante"),
              inverseJoinColumns = @JoinColumn(name = "IDCURSOS"))
    private List<Curso>cursos;


    public Estudiante(){
        super();
    }

    public Estudiante(Integer id, String nombre, String apellido, String curso, int telefono){
        super();
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Curso=curso;
        this.Telefono=telefono;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
}
