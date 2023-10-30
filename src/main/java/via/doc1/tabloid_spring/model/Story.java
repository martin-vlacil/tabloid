package via.doc1.tabloid_spring.model;

import jakarta.persistence.*;

@Entity(name = "Story")
@Table(name = "story")
public class Story {
    @Id
    private int id;
    private String header;
    private String body;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    public Story() {

    }
    public Story(int id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id = " + id + '\'' +
                ", header = " + header + '\'' +
                ", body = " + body + '\'' +
                "}";
    }
}
