package main.java.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private final int id;
    private final String description;
    private final TaskStatus status;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;

    public Task(int id, String description, TaskStatus status,
                LocalDateTime createdTime, LocalDateTime updatedTime){

        this.id = id;
        this.description = description;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;

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
        return updatedTime;
    }
    //is updateTime isAfter createdTime
    //the isUpdate return true
    public boolean isUpdate(){
        return updatedTime.isAfter(createdTime);
    }

    @Override
    public int compareTo(Task other){
        //use the current ID in task
        //and compare it with other ID that pass into the param
        return Integer.compare(this.id, other.id);
    }
    //
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }
    //
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
    //print out all field in a nice way
    //so i Overide the toString(); method
    @Override
    public String toString(){
        return String.format("[Task: %d | Description: %s | Status: %s | Created: %s | Update: %s]"
        ,this.id, this.description, this.status.getTitleCaseStatus(),
                this.createdTime.toString(),
                isUpdate() ? this.updatedTime.toString() : "N/A");

    }
    //check to make sure all task ID is a positive number
    private void checkId(int id) {
        if (id <= 0)
            throw new IllegalArgumentException("Task ID must be positive");
    }
    //check validate the description make sure it not null or empty
    //or larger than 255 letters
    private void checkDescription(String description){
        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be null or empty");
        if (description.length() > 255)
            throw new IllegalArgumentException("Description is too long");
    }
    //update time cannot before the created time
    //throw Exception if that happen
    private void checkUpdateTime(LocalDateTime createdTime, LocalDateTime updatedTime){
        if (updatedTime.isBefore(createdTime)){
            throw new IllegalArgumentException("Updated time cannot be before Created time");
        }
    }
}
