package news.configuration;

import news.entities.News;
import news.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.GregorianCalendar;


@Component
public class DataBaseLoader implements CommandLineRunner {

    private final NewsRepository repo;

    @Autowired
    public DataBaseLoader(NewsRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {

        repo.save(new News(new GregorianCalendar(2020, Calendar.MARCH, 8).getTime(),
                "More than 300 coronavirus cases in the US",
                "US health experts advise seniors to stay home | More than 100,000 people infected worldwide | South Korea death toll rises to 46",
                "There are now more than 7,000 cases of the novel coronavirus in South Korea\n" +
                        "From CNN’s Sophie Jeong in Seoul\n" +
                        "\n" +
                        "South Korea’s Centers for Disease Control and Prevention has announced 274 additional cases of the coronavirus, bringing the national total to 7,041.\n" +
                        "\n" +
                        "The vast majority of cases are in the southern city of Daegu and the surrounding North Gyeongsang province.\n" +
                        "\n" +
                        "Two more deaths from the virus were reported earlier today, bringing the country's total to 46 fatalities during the epidemic."));
        repo.save(new News(new GregorianCalendar(2020, Calendar.MARCH, 7).getTime(),
                "Why the last man standing on the coronavirus cruise ship never gave up",
                "It's why, they say, the experienced Italian sailor is now being hailed as a hero at home and abroad.",
                "(CNN) — His ship may have been to hell and back, becoming a floating coronavirus-infected prison for passengers quarantined at port in Japan, but when the captain of the Diamond Princess cruise ship became the last person aboard to finally step onto dry land, he looked entirely unruffled by the experience.\n" +
                        "If it weren't for the mask on his face, Gennaro Arma, striding purposefully along the dockside in full uniform with hat under arm, might easily have been stepping down from an uneventful trip shuttling passengers from one vacation destination to another.\n" +
                        "But those who know him best say the steadfast calm Arma exhibited throughout the ordeal in which more than 700 people on board the ship tested positive for COVID-19 was typical."));
        repo.save(new News(new GregorianCalendar(2020, Calendar.MARCH, 6).getTime(), "Bill Clinton says he feels 'terrible' that affair has 'unfairly' defined Monica Lewinsky's life",
                "CNN)Bill Clinton reflects emotionally in a new documentary about his 1990s affair with Monica Lewinsky",
                "(CNN)Bill Clinton reflects emotionally in a new documentary about his 1990s affair with Monica Lewinsky, saying that he feels \"terrible\" the affair has defined the former White House intern's life and seeks to explain the sexual relationship as something that he \"did to manage my anxieties for years.\"\n" +
                        "\n" +
                        "Clinton, asked why he entered into the relationship, says it was one of many things he did to cope with the \"pressure,\" \"disappointments\" and \"fears\" of life"));
        repo.save(new News(new GregorianCalendar(2020, Calendar.MARCH, 5).getTime(),
                "Pompeo is 'confident' the US will handle coronavirus 'better than any nation in the world'",
                "Secretary of State Mike Pompeo said Friday that he was \"confident\" that the United States would handle the novel coronavirus ",
                "(CNN)Secretary of State Mike Pompeo said Friday that he was \"confident\" that the United States would handle the novel coronavirus \"better than any nation in the world\" as the Trump administration has been under scrutiny for its initial handling of the coronavirus outbreak.\n" +
                        "\n" +
                        "Pompeo voiced the optimism during an interview with CNBC, in response to a question about whether the US could have as successful a response as China without imposing on people's civil liberties. China imposed severe restrictions on travel in an effort to contain the virus.\n" +
                        "\"I'm confident we can handle it here. I'm confident we'll handle it better than any nation in the world,\" Pompeo said.\n" +
                        "Late last month, the White House assembled a coronavirus task force, with Vice President Mike Pence at the helm.\n" +
                        "Trump has downplayed the threat and made inaccurate statements about the virus, cutting into the efforts of public health experts trying to prepare the public for a possible pandemic.\n" +
                        "Pompeo seemed to blame the Chinese government for the outbreak of the novel coronavirus, which was discovered late 2019 in Wuhan, China, and putting the US \"behind the curve.\"\n" +
                        "\"Remember this is the Wuhan coronavirus that's caused this and the information that we got on the front end of this thing wasn't perfect and has led us now to a place where much of the challenge we face today has put us behind the curve,\" Pompeo said on CNBC.\n" +
                        "Pompeo said it \"has proven incredibly frustrating to work with the Chinese Communist Party to get our hands around the data set, which will ultimately be the solution to both getting the vaccine and attacking this risk.\"\n" +
                        "He did acknowledge he was \"happy\" with the efforts China had taken to slow the spread of the virus.\n" +
                        "Pompeo has specifically used the phrase \"Wuhan coronavirus\" and \"Wuhan virus\" when discussing the illness in recent days, despite the fact that it was officially named by the World Health Organization as COVID-19 or coronavirus disease in February.\n" +
                        "\"Having a name matters to prevent the use of other names that can be inaccurate or stigmatizing. It also gives us a standard format to use for any future coronavirus outbreaks,\" Dr. Tedros Adhanom Ghebreyesus, WHO's Director General, said at the time. Pompeo's comments were aimed at countering disinformation from the Chinese government about the origin of the virus, a State Department official said. A Chinese Foreign Ministry spokesperson said this week they were still tracing the origin of COVID-19, although the first confirmed cases were found in Wuhan."));
        repo.save(new News(new GregorianCalendar(2020, Calendar.MARCH, 4).getTime(),
                "Melania Trump speaks about courage at State Department\n",
                "(CNN)For the fourth consecutive year, first lady Melania Trump on Wednesday attended the International Women of Courage Awards at the State Department",
                "(CNN)For the fourth consecutive year, first lady Melania Trump on Wednesday attended the International Women of Courage Awards at the State Department.\n" +
                        "\n" +
                        "\"I continue to be inspired by the personal stories that accompany each of these extraordinary women,\" Trump said during opening remarks. \"Courage is something that is not easily taught and is closely tied with bravery, humility and sacrifice.\"\n" +
                        "Secretary of State Mike Pompeo also spoke.\n" +
                        "This year's twelve recipients include Sayragul Sauytbay, a Chinese doctor forced by the Chinese Communist Party to teach Chinese to Muslims in a detention camp, ultimately fleeing and using her platform to be among the first to speak publicly against the Chinese government's repressive campaign against Muslims. Also, Amina Khoulani of Syria, a civil rights leader who survived an Assad regime detention center, emerging as founder of \"Families for Freedom,\" a women-led organization for families whose loved ones have disappeared or been detained in Syria.\n" +
                        "Toward the end of the program, awardee Zarifa Ghafari of Afghanistan, gave remarks on behalf of the entire group. At 26, Ghafari became mayor of a town in Wardak province, despite opposition and risk from male colleagues and constituents. She pleaded directly with Trump and Pompeo to not forget the ongoing efforts of women in her region as the United States moves to attempt to negotiate peace with the Taliban.\n" +
                        "\"Women of my generation have not forgotten the reign of the Taliban and we are as always worried for the future,\" Ghafari said. \"Therefore, let me ask for your continued support to ensure that (the) Afghan peace process does not erase the gains that have been made since the dark days of the Taliban regime,\" Ghafari said, turning to face Trump and Pompeo, who were seated behind her as she delivered remarks on stage. The Secretary of State and first lady clapped.\n" +
                        "Last year, the State Department received criticism for removing a previously announced award recipient. Jessikka Aro, a Finnish investigative journalist with a history of breaking stories on Russian propaganda efforts, found her honor rescinded without warning or any explanation from the department."));
    }

}

