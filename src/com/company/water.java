package com.company;

public class water extends nature implements printTable{

    private int temperatura;
    public water(String name, String sostoyanie, String form, int temperatura) {
        super(name, sostoyanie, form);
        this.temperatura=temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void prin() {
        System.out.println(".Название " + getName() + "Состояние " + getSostoyanie() + "форма " + getForm() + "температура " + getTemperatura());
    }

}
