import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @AUTHOR Joachim Pihlgren, joapih-6
 */
public class Mp3
{
	private StringProperty title;
	private StringProperty author;
	private StringProperty year;
	private StringProperty nrOfTracks;

	public Mp3(String title, String author, String year, String nrOfTracks)
	{
		this.setTitle(new SimpleStringProperty(title));
		this.setAuthor(new SimpleStringProperty(author));
		this.setYear(new SimpleStringProperty(year));
		this.setNrOfTracks(new SimpleStringProperty(nrOfTracks));
	}

	public StringProperty getTitle()
	{
		return title;
	}

	public void setTitle(StringProperty title)
	{
		this.title = title;
	}

	public StringProperty getAuthor()
	{
		return author;
	}

	public void setAuthor(StringProperty author)
	{
		this.author = author;
	}

	public StringProperty getYear()
	{
		return year;
	}

	public void setYear(StringProperty year)
	{
		this.year = year;
	}

	public StringProperty getNrOfTracks()
	{
		return nrOfTracks;
	}

	public void setNrOfTracks(StringProperty nrOfTracks)
	{
		this.nrOfTracks = nrOfTracks;
	}
}
