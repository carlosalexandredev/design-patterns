package dev.carlos.designpatters.behavioral.chain.billsDispenser;

public class Nota {
    private Integer value;
    private Nota next;

    public Nota(Integer value){
        this.value = value;
    }

    public Nota(Integer value, Nota next){
        this.value = value;
        this.next = next;
    }
}
