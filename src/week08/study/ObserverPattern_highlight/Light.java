package week08.study.ObserverPattern_highlight;

import com.sun.security.jgss.GSSUtil;

public class Light implements Observer{
    private String albumName;
    private String albumDate;

    private HIGHLIGHT highlight;

    // ★
    public Light(HIGHLIGHT highlight) {
        this.highlight = highlight;
        highlight.registerLight(this);
    }

    @Override
    public void update() {
        this.albumName = highlight.getAlbumName();
        this.albumDate = highlight.getAlbumDate();
        System.out.println(albumDate + "에 하이라이트 앨범 "+ albumName +"이 발매됩니다!");
    }

    // push 방법 update
//    @Override
//    public void update(String albumName, String albumDate) {
//        this.albumName = albumName;
//        this.albumDate = albumDate;
//        System.out.println(albumDate + "에 하이라이트 앨범 "+ albumName +"이 발매됩니다!");
//    }

}
