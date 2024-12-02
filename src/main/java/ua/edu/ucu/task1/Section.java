package ua.edu.ucu.task1;

public abstract class Section {
    private int denomination; //номінал
    private Section next;

    public Section(int denomination){
        this.denomination = denomination;
    }

    public void setNext(Section next){
        this.next = next;
    }

    public boolean hasNext(){
        return next!=null;
    }

    public void process(int amount){
        int leftover = amount % denomination;
        if(leftover!=0){
            if (hasNext()){
                next.process(leftover);
            } else{
                throw new IllegalArgumentException("invalid amount");
            }
        }
        System.out.println("Denomination: "+denomination+"\nQuantity: "+amount/denomination);
    }

}
