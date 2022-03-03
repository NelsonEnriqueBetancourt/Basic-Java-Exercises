package com.example.REST.Modelos;


import javax.persistence.*;

@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCURSOS")
    private Integer id;

    @Column(name = "NOMBRECURSOS")
    private String NombreCurso;

    @Column(name = "CANTIDADHORAS")
    private int CantidadHoras;

    public Curso(){
        super();

    }

    public Curso(Integer id, String nombreCurso, int cantidadHoras){
        super();
        this.id=id;
        this.NombreCurso=nombreCurso;
        this.CantidadHoras=cantidadHoras;

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        NombreCurso = nombreCurso;
    }

    public int getCantidadHoras() {
        return CantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        CantidadHoras = cantidadHoras;
    }
}
