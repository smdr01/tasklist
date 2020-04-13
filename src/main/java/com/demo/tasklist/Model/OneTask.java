package com.demo.tasklist.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class OneTask {
    @Id
    private String Id;
    private String taskName;
    private String notes;
    private int daysToComplete;
    @Indexed(direction = IndexDirection.ASCENDING)
    private Date dateAdded;
    private Date deadline;

    public OneTask(String taskName, String notes, int daysToComplete, Date dateAdded, Date deadline) {
        this.taskName = taskName;
        this.notes = notes;
        this.daysToComplete = daysToComplete;
        this.dateAdded = dateAdded;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(int daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
