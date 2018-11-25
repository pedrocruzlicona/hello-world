package com.example.dto;

public class ListToDo{
    private String toDo;
    private boolean done;
    /**
     * @return the toDo
     */
    public String getToDo() {
        return toDo;
    }

    /**
     * @return the done
     */
    public boolean isDone() {
        return done;
    }

    /**
     * @param done the done to set
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * @param toDo the toDo to set
     */
    public void setToDo(String toDo) {
        this.toDo = toDo;
    }
}