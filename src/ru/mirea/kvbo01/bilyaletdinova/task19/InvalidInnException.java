package ru.mirea.kvbo01.bilyaletdinova.task19;

public class InvalidInnException extends Exception{
    public InvalidInnException(String errorMessage){
        super(errorMessage);
    }
    public InvalidInnException(){
    }
}