package news.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String title;

    private String shortDescription;

    @Lob
    @Column
    private String text;

    public News(Date date, String title, String shortDescription, String text) {
        this.date = date;
        this.title = title;
        this.shortDescription = shortDescription;
        this.text = text;
    }

    public News(){}

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getText() {
        return text;
    }
}
