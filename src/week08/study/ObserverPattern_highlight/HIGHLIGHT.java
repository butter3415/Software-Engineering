package week08.study.ObserverPattern_highlight;

import java.util.ArrayList;
import java.util.List;

public class HIGHLIGHT implements subject{
    private List<Observer> lights;

    private String albumName;
    private String albumDate;

    public HIGHLIGHT() {
        lights = new ArrayList<Observer>();
    }

    @Override
    public void registerLight(Observer o) {
        lights.add(o);
    }

    @Override
    public void removeLight(Observer o) {
        lights.remove(o);
    }

    @Override
    public void notifyLight() {
        for (Observer light : lights){
            light.update();
            // light.update(albumName, albumDate);
        }
    }

    public void promotion(){
        notifyLight();
    }

    public void setPromotion(String albumName, String albumDate){
        this.albumName = albumName;
        this.albumDate = albumDate;
        promotion();

    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumDate() {
        return albumDate;
    }
}
