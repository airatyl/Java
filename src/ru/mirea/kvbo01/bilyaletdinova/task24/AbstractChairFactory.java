package ru.mirea.kvbo01.bilyaletdinova.task24;

class AbstractChairFactory {

    public VictorianChair createVictoriaChair(int a) {
        return new VictorianChair(a);
    }


    public MagicChair createMagicChai() {
        return new MagicChair();
    }


    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
interface Chair{
}
class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}
class MagicChair implements Chair{
    void doMagic(){
        System.out.println("Magic is done");
    }
    MagicChair(){

    }

    @Override
    public String toString() {
        return "MagicChair{}";
    }
}
class FunctionalChair implements Chair{
    int sum(int a,int b){
        return a+b;
    }
    FunctionalChair(){

    }

    @Override
    public String toString() {
        return "FunctionalChair{}";
    }
}
class Client{
    private Chair chair;
    void sit(){
        System.out.println(chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
