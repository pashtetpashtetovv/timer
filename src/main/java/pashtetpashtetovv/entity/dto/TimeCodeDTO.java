package pashtetpashtetovv.entity.dto;

import java.time.Instant;

public class TimeCodeDTO {

    private String id;

    private String name;

    private Instant start;

    private Instant finish;

    private String taskId;

    public TimeCodeDTO(String id, String name, Instant start, Instant finish, String task_id) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.taskId = task_id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "TimeCodeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                ", taskId=" + taskId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
