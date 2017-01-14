package com.william;

/**
 * Klasse der Vegetarier.
 */
public class Vegetarian extends Animal {

    /**
     * Dem Konstruktor wird das Geschlecht des Tiers uebergeben.
     *
     */
    public Vegetarian(boolean female) {
        super(female);
    }

    public Vegetarian(boolean female, String square) {
        super(female, square);
    }

}
