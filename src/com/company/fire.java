package com.company;

public class fire extends nature implements printTable{

    private String color;

    public fire(String name, String sostoyanie, String form, String color ) {
        super(name, sostoyanie, form);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void prin() {
        System.out.println(".\nНазвание " + getName() + "\nСостояние " + getSostoyanie() + "\nформа " + getForm() + "\nцвета " + getColor());

    }
}
