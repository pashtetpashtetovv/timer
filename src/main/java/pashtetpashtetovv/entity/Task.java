package pashtetpashtetovv.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task")
public class Task implements Persistable<String> {

    @Id
    private String id;

    private String shortName;

    private String longName;

    @Transient
    private boolean isNew;

    public Task(){}

    public Task(String id, String shortName, String longName) {
        this.id = id;
        this.shortName = shortName;
        this.longName = longName;
    }

    public String getId() {
        return id;
    }

    //public void setId(Long id) {
    //    this.id = id;
    //}

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    @Override
    @Transient
    public boolean isNew() {
        return this.isNew || id == null;
    }

    public Task setAsNew(){
        this.isNew = true;
        return this;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
