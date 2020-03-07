package news.repositories;

import news.entities.News;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "news", path = "news")
public interface NewsRepository extends PagingAndSortingRepository<News, Long> {

    List<News> findByTitle(@Param("title") String title);

    List<News> findByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("date") Date date);


}