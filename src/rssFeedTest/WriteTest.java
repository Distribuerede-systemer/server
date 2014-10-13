package rssFeedTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WriteTest {

  public static void main(String[] args) {
    // create the rss feed
    String copyright = "Copyright hold by Lars Vogel";
    String title = "Eclipse and Java Information";
    String description = "Eclipse and Java Information";
    String language = "en";
    String link = "http://www.vogella.com";
    Calendar cal = new GregorianCalendar();
    Date creationDate = cal.getTime();
    SimpleDateFormat date_format = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
    String pubdate = date_format.format(creationDate);
    Feed rssFeeder = new Feed(title, link, description, language,
        copyright, pubdate);

    // now add one example entry
    FeedMessage feed = new FeedMessage();
    feed.setTitle("RSSFeed");
    feed.setDescription("This is a description");
    feed.setAuthor("nonsense@somewhere.de (Lars Vogel)");
    feed.setGuid("http://www.vogella.com/tutorials/RSSFeed/article.html");
    feed.setLink("http://www.vogella.com/tutorials/RSSFeed/article.html");
    rssFeeder.getMessages().add(feed);

    // now write the file
    RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, "articles.rss");
    try {
      writer.write();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

} 