package com.company;

import java.util.jar.Attributes;

public class Main {


    public static void main(String[] args) {
        water water = new water("\n  water  ", "\n  сейчас он жидкий", "\n  стаканообразное", 23);
        fire fire = new fire("\n  fire ", "\n  я незнаю какого состояния огонь. но огонь состоит в состоянии огня", "\n  огнеобразное",
                "\n  желтый, красный , синий, оранжевый");
        wind wind = new wind("\n  wind ", "\n  газообразное", "\n  ветренная", 10);


        String NameClass = "water";

        switch (NameClass) {
            case "fire":
                fire.prin();
                break;

            case "water":
                water.prin();
                break;

            case "wind":
                wind.prin();
                break;
        }


    }
}
