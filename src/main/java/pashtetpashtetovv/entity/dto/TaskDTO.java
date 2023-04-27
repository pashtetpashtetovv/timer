package pashtetpashtetovv.entity.dto;

public class TaskDTO {

    private String id;

    private String shortName;

    private String longName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
    public String toString() {
        return "TaskDTO{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                '}';
    }

    public TaskDTO(String id, String shortName, String longName) {
        this.id = id;
        this.shortName = shortName;
        this.longName = longName;
    }

}
