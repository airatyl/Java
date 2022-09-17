package ru.mirea.kvbo01.bilyaletdinova.task4;

public enum Season {
    summer(22),
    autumn(10),
    winter(-10),
    spring(15);
    private final int temp;
    Season(int temp){
        this.temp=temp;
    }
    public int getTemp(){
        return this.temp;
    }
    public String getDescription(){

        if (temp==22) {
            return "Теплое время года";
        }
        return "Холодное время года";
    }
}