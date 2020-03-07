package news.repositories;


import news.entities.News;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "news", path = "news")
public interface NewsRepository extends PagingAndSortingRepository<News, Long> {

    List<News> findByTitle(@Param("title") String title);
//    List<News> findByDate(@Param("date") String date);//todo to check date !


}