package com.altran.iot.queue;

/**
 * @author <a href="mailto:bard.lind@gmail.com">Bard Lind</a>
 */
public class Queue {

    private final String id;
    private final int size;

    public Queue(String id, int size) {
        this.id = id;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getId() {
        return id;
    }
}
