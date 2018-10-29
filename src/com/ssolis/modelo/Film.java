package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Film {
 private  String title;
 private  String genre;
 private  int duration;
 private short year;
 public Film()
 { }
    public Film(String title, String genre, int duration, short year, boolean viewed) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
    }
 private boolean viewed;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    

    public void setGenre(String genre) {
        this.genre = genre;
    }
   
    public String getGenre() {
        return genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getYear() {
        return year;
    }
    

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public boolean getisViewed() {
        return viewed;
    }
    public String isViewed(){
    String visto="";
        if (viewed==true) {
            visto="SÌ";
        }
        else {
        visto="NO";
        }
        
    return visto;
    
    }


}


