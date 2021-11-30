package com.company;

public class wind extends nature implements printTable{
    private int skorost;

    public wind(String name, String sostoyanie, String form,int skorost) {
        super(name, sostoyanie, form);
        this.skorost=skorost;
    }

    public int getSkorost() {
        return skorost;
    }

    public void setSkorost(int skorost) {
        this.skorost = skorost;
    }

    @Override
    public void prin() {
        System.out.println(".\nНазвание " + getName() + "\nСостояние " + getSostoyanie() + "\nформа " + getForm() + "\nскорость " + getSkorost());

    }
}
