package news.configuration;

import news.repositories.NewsRepository;
import news.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;




@Component
public class DataBaseLoader implements CommandLineRunner {

    private final NewsRepository repo;


    @Autowired
    public DataBaseLoader(NewsRepository repo) {

        this.repo = repo;

    }

    @Override
    public void run(String... strings) throws Exception {

        repo.save(new News(LocalDate.of(2020, 3, 5), "novinaA","opisanie na novina 1","dylyg tekst na novina 1"));
        repo.save(new News(LocalDate.of(2020, 3, 4), "novinaB","opisanie na novina 2","dylyg tekst na novina 2"));
        repo.save(new News(LocalDate.of(2020, 3, 3), "novinaC","opisanie na novina 3","dylyg tekst na novina 3"));
        repo.save(new News(LocalDate.of(2020, 3, 2), "novinaD","opisanie na novina 4","dylyg tekst na novina 4"));
        repo.save(new News(LocalDate.of(2020, 3, 1), "novinaE","opisanie na novina 5","dylyg tekst na novina 5"));
    }

}

