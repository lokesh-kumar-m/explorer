package com.spring.explorer.exploringspring;

public class Topics {
    private long id;
    private String name;


    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Topic id:"+id+", name: "+name+" ";
    }

    public Topics(long id,String name){
        super();
        this.id=id;
        this.name=name;
    }
}

