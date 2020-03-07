package news.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate date;

    private String title;

    private String shortDescription;

    private String text;

    public News(LocalDate date, String title, String shortDescription, String text) {
        this.date = date;
        this.title = title;
        this.shortDescription = shortDescription;
        this.text = text;
    }

    public News(){}
}
