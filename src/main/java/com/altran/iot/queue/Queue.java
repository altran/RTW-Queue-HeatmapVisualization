package com.altran.iot.queue;

/**
 * @author <a href="mailto:bard.lind@gmail.com">Bard Lind</a>
 */
public class Queue {

    private final String id;
    private final long size;

    public Queue(String id, long size) {
        this.id = id;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public String getId() {
        return id;
    }
}
