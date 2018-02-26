import java.util.ArrayList;
public class Festival {
	//Instance Variables
	private String name;
	private ArrayList<Movie> movieList = new ArrayList<Movie>();

	
	//Constructors
	public Festival(String newName) {
		this.name = newName;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
	
	//Methods
	public void addMovie(Movie newMovie) {
		newMovie = new Movie(newMovie);
		movieList.add(newMovie);
		
	}
	
	public Movie getMovieWithLowestRating() {
		
		Movie Current;
		if (movieList.size() < 1)
			return null;
		else {
			Current = movieList.get(0);
			for (int i = 0; i < movieList.size(); i++) {
				if (movieList.get(i).getRating() < Current.getRating()) {
					Current = movieList.get(i);
				}
			}
		}
		return Current;
	}
}
