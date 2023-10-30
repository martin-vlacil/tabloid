package via.doc1.tabloid_spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Department")
@Table(name = "department")
public class Department {
    @Id
    private int id;
    private String name;
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "story"
    )
    @JsonIgnore
    private List<Story> stories = new ArrayList<>();

    public Department() {

    }
    public Department(int id, String name, List<Story> stories) {
        this.id = id;
        this.name = name;
        this.stories = stories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "id = " + id + '\'' +
                ", name = " + name + '\'' +
                ", stories = placeholder" +
                "}";
    }
}
