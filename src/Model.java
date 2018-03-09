import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;

/**
 * @AUTHOR Joachim Pihlgren, joapih-6
 */
public class Model
{
	private ListProperty<Mp3> mp3s;

	public Model()
	{
		setMp3s(new SimpleListProperty<>());
	}

	public ListProperty<Mp3> getMp3s()
	{
		ListProperty<Mp3> copy = new SimpleListProperty<>();
		for(Mp3 mp3 : mp3s)
		{
			copy.add(new Mp3(mp3.getTitle().toString(), mp3.getAuthor().toString(), mp3.getYear().toString(),
					mp3.getNrOfTracks().toString()));
		}
		return copy;
	}

	public void setMp3s(ListProperty<Mp3> mp3s)
	{
		this.mp3s = mp3s;
	}

	public void addMp3(String name, String author, String year, String nrOfTracks)
	{
		mp3s.add(new Mp3(name, author, year, nrOfTracks));
	}

	public void removeMp3(Mp3 incomingMp3)
	{
		Mp3 mp3ToRemove = null;
		for(Mp3 mp3 : mp3s)
		{
			if(areEqual(incomingMp3, mp3))
			{
				mp3ToRemove = mp3;
			}
		}
		if(mp3ToRemove != null)
		{
			mp3s.remove(mp3ToRemove);
		}
	}

	private boolean areEqual(Mp3 first, Mp3 second)
	{
		if(!first.getTitle().equals(second.getTitle()))
		{
			if(first.getAuthor().equals(second.getAuthor()))
			{
				if(first.getYear().equals(second.getYear()))
				{
					if(first.getNrOfTracks().equals(second.getNrOfTracks()))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
