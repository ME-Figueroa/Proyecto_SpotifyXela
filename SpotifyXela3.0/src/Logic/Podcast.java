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
public class Podcast {
    private String nombrep,Artista,episodio, archivo,fecha,genero;
    private boolean fav;
    static public ArrayList<Podcast> pod = new ArrayList();

    public Podcast(String nombrep, String Artista, String episodio, String archivo, String fecha, String genero) {
        this.nombrep = nombrep;
        this.Artista = Artista;
        this.episodio = episodio;
        this.archivo = archivo;
        this.fecha = fecha;
        this.genero = genero;
    }

    public String getNombrep() {
        return nombrep;
    }

    public String getArtista() {
        return Artista;
    }

    public String getEpisodio() {
        return episodio;
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
