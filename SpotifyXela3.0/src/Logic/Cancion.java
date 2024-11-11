/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class Cancion {
    private String nombreC,Artista,album, archivo,fecha,genero;
    private boolean fav;
    static public ArrayList<Cancion> can = new ArrayList();

    public Cancion(String nombreC, String Artista, String album, String archivo, String fecha, String genero) {
        this.nombreC = nombreC;
        this.Artista = Artista;
        this.album = album;
        this.archivo = archivo;
        this.fecha = fecha;
        this.genero = genero;
    }

    public String getNombreC() {
        return nombreC;
    }

    public String getArtista() {
        return Artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getArchivo() {
        return archivo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    
}
