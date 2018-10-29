package com.ssolis.modelo;

import com.wmorales.interfaces.IVisualizable;
import java.util.Date;
/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Movie extends Film implements IVisualizable {
 private int id,timeViewed;
  
  public Movie(){
  
  }  

    public Movie(int id, int timeViewed, String title, String genre, int duration, short year, boolean viewed) {
        super(title, genre, duration, year, viewed);
        this.id = id;
        this.timeViewed = timeViewed;
    }

   

    public int getId() {
        return id;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }
    
  
  
    @Override
    public Date startToSee(Date dateI) {
    return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime()>dateI.getTime()){
            setTimeViewed((int)(dateF.getTime()-dateI.getTime()));
        }else {
            setTimeViewed(0);
        }
    }

    @Override
    public String toString() {
        return "\n :: MOVIE ::"
                + "\n Title" + getTitle()
                + "\n Genero" + getGenre();
    }

   //hacere en un areglko  areaylist de todaas las peliculas


}

