package com.william;

/**
 * Oberklasse fuer Tiere.
 */
public class Animal {

    // Attribute fuer den allen Tieren gemeinen Teil des Tierzustands
    public boolean female; // Weibchen?
    public boolean alive;  // Lebendig?
    public String square;  // Auf welchem Feld? (genau zwei Zeichen, z. B. "e4")
    public String initSquare;
    public Position position; // Auf welchem Spielbrett?


    /**
     * Dem Konstruktor wird das Geschlecht des Tiers uebergeben.
     *
     */
    public Animal(boolean female) {
        this.female = female;
        this.alive = true;
    }

    public Animal(boolean female, String square) {
        this.female = female;
        this.square = square;
        this.initSquare = square;
        this.alive = true;
    }


    /**
     * Ermittelt die moeglichen Zuege gemaess den Spielregeln,
     * die das Tier von seinem Feld aus in der aktuellen Position
     * ausfuehren kann.
     *
     * Muss von jeder einzelnen Tierklasse ueberschrieben werden.
     */
    public Move[] possibleMoves(){
        return null;
    }


    /**
     * Wird aufgerufen nach jeder Spielrunde
     * (quasi am Ende vom Tag - jede Spielrunde zaehlt als ein Tag).
     *
     *  Muss in jeder einzelnen Tierklasse ueberschrieben sein!
     */
    public void sunset(){
        // Methode (und Klasse Animal) sollten eigentlich als abstract deklariert sein.
        // Kommt spaeter in der Vorlesung noch dran...
        // Zum Verstaendnis reicht es, dass diese Methode ueberschrieben werden muss.
        // (Die folgende Zeile wird dann auch nie ausgefuehrt.)
        throw new RuntimeException("Method sunset should have been overridden");
    }

    public void resetSquare() {
        this.square = this.initSquare;
    }

    public char getX() {
        return this.square.charAt(0);
    }

    public int getY() {
        return Character.getNumericValue(this.square.charAt(1));
    }

}
