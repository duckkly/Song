package sg.edu.rp.c346.id22011765.song;

import androidx.annotation.NonNull;

public class Song {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song(int id,String title, String singers, int year, int stars){

        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public String getTitle(){
        return title;
    }

    public String getSingers(){
        return singers;
    }

    public int getYear(){
        return year;
    }

    public int getStars(){
        return stars;
    }

    @NonNull
    @Override
    public String toString(){
        return id + "\n" +singers + "\n" + title + "\n" + year + "\n" + stars;
    }

}
