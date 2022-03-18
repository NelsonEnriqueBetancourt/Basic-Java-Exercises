package com.example.demo.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clima")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha")
    private String Date;
    
    @Column(name = "lugar")
    private String location;

    @Column(name = "latitud")
    private float latitud;

    @Column(name = "longitud")
    private float longitud;

    @Column(name = "estado")
    private String state;


    public Weather(){
        super();
    }

    public Weather(Integer id, String date, String location, float latitud, float longitud, String state) {
        this.id = id;
        this.Date = date;
        this.location = location;
        this.latitud = latitud;
        this.longitud = longitud;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", Date='" + Date + '\'' +
                ", location='" + location + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;
        Weather weather = (Weather) o;
        return Float.compare(weather.getLatitud(), getLatitud()) == 0 && Float.compare(weather.getLongitud(), getLongitud()) == 0 && getId().equals(weather.getId()) && getDate().equals(weather.getDate()) && getLocation().equals(weather.getLocation()) && getState().equals(weather.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getLocation(), getLatitud(), getLongitud(), getState());
    }
}
