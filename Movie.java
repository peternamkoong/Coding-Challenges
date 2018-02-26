public class Movie {
	//Instance Variables
	private String title;
	private int rating;
	
	//Constructors
	public Movie(String newTitle, int newRating) {
		this.title = newTitle.toUpperCase();
		if (newRating <= 10 && newRating >= 0)
			this.rating = newRating;
	}
	
	public Movie(Movie newMovie) {
		this.title = newMovie.getTitle().toUpperCase();
		if (newMovie.getRating() <= 10 && newMovie.getRating() >= 0)
			this.rating = newMovie.getRating();
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	
	public int getRating() {
		return rating;
	}
	
	//Setters
	public void setTitle(String newTitle) {
		newTitle = newTitle.toUpperCase();
		this.title = newTitle;
	}
	
	public void setRating(int newRating) {
		if (newRating <= 10 && newRating >= 0)
			this.rating = newRating;
	}
	
	//Methods
	public char getCategory() {
		char Category = 'F';
		if (rating == 10 || rating == 9)
			Category = 'A';
		else if (rating == 8 || rating == 7)
			Category = 'B';
		else if (rating == 6 || rating == 5)
			Category = 'C';
		else if (rating == 4 || rating == 3)
			Category = 'D';
		else
			Category = 'F';
		return Category;
	}
}
