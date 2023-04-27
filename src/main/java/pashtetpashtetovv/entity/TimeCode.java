package pashtetpashtetovv.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection = "timeCode")
public class TimeCode implements Persistable<String> {

    @Id
    private String id;

    private String name;

    private Instant start;

    private Instant finish;

    private String task;

    @Transient
    private boolean isNew;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public String getTaskId() {
        return task;
    }

    public void setTaskId(String taskId) {
        this.task = taskId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TimeCode(String id, String name, Instant start, Instant finish, String task) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.task = task;
    }

    @Override
    public String toString() {
        return "TimeCode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                ", isNew=" + isNew +
                ", task=" + task +
                '}';
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getFinish() {
        return finish;
    }

    public void setFinish(Instant finish) {
        this.finish = finish;
    }

    @Override
    @Transient
    public boolean isNew() {
        return this.isNew || id == null;
    }

    public TimeCode setAsNew(){
        this.isNew = true;
        return this;
    }

}
