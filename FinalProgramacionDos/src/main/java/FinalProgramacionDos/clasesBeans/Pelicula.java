/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProgramacionDos.clasesBeans;


import java.io.Serializable;

import jakarta.validation.constraints.Null;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {
    @Id
    private int idPelicula;
    private int duracion_min;
    private String nombre;
    private String sinopsis;
    private String apto_publico;
    private Date fecha_estreno;
    private String director;
    

    public Pelicula() {
        this(0, 0, "", "", "", null, "");
    }

    public Pelicula(int id) {
        this.idPelicula = id;
    }
    

    public Pelicula(int id, int duracion_min, String nombre_pelicula, String sinopsis, String apto_publico,
            Date fechaDeEstreno, String director) {
        this.idPelicula = id;
        this.duracion_min = duracion_min;
        this.nombre = nombre_pelicula;
        this.sinopsis = sinopsis;
        this.apto_publico = apto_publico;
        this.fecha_estreno = fechaDeEstreno;
        this.director = director;

    }

    public int getId() {
        return idPelicula;
    }

    public void setId(int id) {
        this.idPelicula = id;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public String getNombre_pelicula() {
        return nombre;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre = nombre_pelicula;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getApto_publico() {
        return apto_publico;
    }

    public void setApto_publico(String apto_publico) {
        this.apto_publico = apto_publico;
    }

    public Date getFechaDeEstreno() {
        return fecha_estreno;
    }

    public void setFechaDeEstreno(Date fechaDeEstreno) {
        this.fecha_estreno = fechaDeEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    /*
    public String getFoto() {
        return fotopeli;
    }

    public void setFoto(String fotox) {
        if (fotox != null && !fotox.isBlank()) {
            this.fotopeli = fotox;
        } else if (!tieneFoto()) {
            this.fotopeli = FOTO_DEFAULT;
        }
    }

    public boolean tieneFoto() {
        return !fotopeli.equals(FOTO_DEFAULT);
    }
*/

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + idPelicula + ", duracion_min=" + duracion_min + ", nombre_pelicula=" + nombre  + '}';
    }
}