package com.example.chernovil;

public class Game {
    private String Name ;
    private String jant ;
    private int god_izdanie ;
    private int ocenka ;
    public Game(String name, String jant, int god_izdanie, int ocenka) {
        this.Name = name;
        this.jant = jant;
        this.god_izdanie = god_izdanie;
        this.ocenka = ocenka;
    }
    public  String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJanr() {
        return jant;
    }

    public void setJanr(String janr) {
        this.jant = janr;
    }

    public int getGod_izdanie() {
        return god_izdanie;
    }

    public void setGod_izdanie(int god_izdanie) {
        this.god_izdanie = god_izdanie;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }
}

