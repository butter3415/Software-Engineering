package week08.study.ObserverPattern_highlight;

public class promotion {
    public static void main(String[] args) {
        HIGHLIGHT highlight = new HIGHLIGHT();

        Light lightjYE = new Light(highlight);

        highlight.setPromotion("Switch On", "24년 03월 12일");
        highlight.setPromotion("Give You My All", "23년 10월 16일");
        highlight.setPromotion("AFTER SUNSET", "22년 11월 07일");
        highlight.setPromotion("DAYDREAM", "22년 03월 21일");

    }
}
