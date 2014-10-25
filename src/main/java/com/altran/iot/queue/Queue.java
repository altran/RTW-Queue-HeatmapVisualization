package com.altran.iot.queue;

/**
 * @author <a href="mailto:bard.lind@gmail.com">Bard Lind</a>
 */
public class Queue {

    private final String id;
    private final long size;
    private final long lastObservation;

    public Queue(String id, long size,long lastObservation) {
        this.id = id;
        this.size = size;
        this.lastObservation = lastObservation;
    }

    public long getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public long getLastObservation() {
        return lastObservation;
    }
}
