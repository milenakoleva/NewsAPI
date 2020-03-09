# NewsAPI

# Example API calls:

# Sorting by title:
http://localhost:8080/api/news?sort=title,asc

http://localhost:8080/api/news?sort=title,desc

# Sorting by date:
http://localhost:8080/api/news?sort=date,asc

http://localhost:8080/api/news?sort=date,desc


# Search by title:
http://localhost:8080/api/news/search/findByTitle?title=Why%20the%20last%20man%20standing%20on%20the%20coronavirus%20cruise%20ship%20never%20gave%20up

# Search by date:
http://localhost:8080/api/news/search/findByDate?date=2020-03-07

# Start the App:
Windows:

$ mvnw.cmd spring-boot:run

Linux:

$ sh mvnw spring-boot:run


# Technical Description:

For the API I have used Java 8 and Spring Data Rest.

For Sorting I use PagingAndSortingRepository from Spring Boot Framework
for serching by date and name I have declared the following 2 methods:

    @RepositoryRestResource(collectionResourceRel = "news", path = "news")
    public interface NewsRepository extends PagingAndSortingRepository<News, Long> {
        List<News> findByTitle(@Param("title") String title);
        List<News> findByDate(@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("date") Date date);
    }

The created entity class is News,

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
    }

I have used the in memory database H2, which is initalized on startup only for demonstration,
with the configuration class DataBaseLoader

I have also added an configuration file for the id-s ExposeIdConfiguration.
Id-s are requested, but not returned by default by Spring Data Rest

A little bit more about the Spring Data Rest: (https://spring.io/projects/spring-data-rest)
Spring Data REST is part of the umbrella Spring Data project and makes it easy to build hypermedia-driven REST web services on top of Spring Data repositories.






For creating the API I have used the following tutorials:
https://www.edureka.co/blog/what-is-rest-api/

https://www.baeldung.com/spring-data-rest-intro

https://auth0.com/blog/spring-data-rest-tutorial-developing-rest-apis-with-ease/

https://hellokoding.com/restful-api-example-with-spring-boot-spring-data-rest-and-mysql/



