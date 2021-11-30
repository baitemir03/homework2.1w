package com.company;

public abstract class nature implements printTable {
    private String name;
    private String sostoyanie;
    private String form;

    public nature(String name, String sostoyanie, String form) {
        this.name = name;
        this.sostoyanie = sostoyanie;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSostoyanie() {
        return sostoyanie;
    }

    public void setSostoyanie(String sostoyanie) {
        this.sostoyanie = sostoyanie;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
