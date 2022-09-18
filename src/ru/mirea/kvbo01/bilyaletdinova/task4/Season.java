package ru.mirea.kvbo01.bilyaletdinova.task4;

public enum Season {
    summer(22){
        public String getDescription(){
            return "Теплое время года";
        }
    },
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
        return "Холодное время года";
    }
}