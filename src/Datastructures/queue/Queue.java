package Datastructures.queue;

import Datastructures.HTLQueue;

public class Queue implements HTLQueue {

private Element Next;


    @Override
    public void enqueue(int value) {
        Element l = new Element(value);
        Element n = Next;
        if ( Next == null){
            Next = l;
        } else {
        while (n.getNext()!=null){
            n = n.getNext();
        }
        n.setNext(l);
        }

        }



    @Override
    public void dequeue() {
        Next = Next.getNext();
    }


}
