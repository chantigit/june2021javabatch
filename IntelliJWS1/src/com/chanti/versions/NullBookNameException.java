package com.chanti.versions;

public class NullBookNameException extends  Exception{
    @Override
    public String toString() {
        return this.getClass()+": Book Name should not be null";
    }
}
