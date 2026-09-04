package main.model;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private final int id;
    private final String description;
    private final TaskStatus status;
    private final LocalDateTime createdTime;
    private final LocalDateTime updateTime;

    public Task(int id, String description, TaskStatus status,
                LocalDateTime createdTime, LocalDateTime updateTime){

        this.id = id;
        this.description = description;
        this.status = status;
        this.createdTime = createdTime;
        this.updateTime = updateTime;

    }
    //All get method to return field in the class
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public LocalDateTime getCreatedTime(){
        return createdTime;
    }
    public LocalDateTime getUpdateTime(){
        return updateTime;
    }
    //is updateTime isAfter createdTime
    //the isUpdate return true
    public boolean isUpdate(){
        return updateTime.isAfter(createdTime);
    }

    @Override
    public int compareTo(Task other){
        //use the current ID in task
        //and compare it with other ID that pass into the param
        return Integer.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }
}
