package org.dm.model;

public class Seq {
    private int num;
    //----------------------------------------------------------------------------------
    public Seq() {
        num = 0;
    }
    //----------------------------------------------------------------------------------
    public int getNext() {
        return num++;
    }
}