import java.util.ArrayList;
import java.util.List;


public class DeeJay extends Staff{

    private int amountSongsANight;

    private List<Genre> genres = new ArrayList<Genre>();


    public DeeJay(String name, int amountSongsANight, List<Genre> genres) {
        super(name);
        this.amountSongsANight = amountSongsANight;
        this.genres = genres;
    }

    public int getAmountSongsANight() {
        return amountSongsANight;
    }

    public void setAmountSongsANight(int amountSongsANight) {
        this.amountSongsANight = amountSongsANight;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }



    public String playASong(){

        //randomize the genres on your list(no need to junit this random part)
        //Just make sure you add +1 to amountSongsEachNight
        //You can't ever exceed 7 songs each night, otherwise it returns the
        //underlying phrase





//        Random random = new Random();
//        int randomGenre = random.nextInt(genres.size());
//        Genre genre = genres.get(randomGenre);
//        playARequest(genre);

        // Shuffle the list of genres to randomize the order
//        Collections.shuffle(genres);
//        // Pick the first genre from the shuffled list
//        Genre selectedGenre = genres.get(0);
//        // Increment the song counter
//        amountSongsEachNight++;
//        // Check if the maximum number of songs has been reached
//        if (amountSongsEachNight > 7) {
//            return "I've played enough songs for tonight!";
//        }
//        // Play a song from the selected genre
//        String song = selectedGenre.playRandomSong();
//        return "Playing a " + selectedGenre + " song: " + song;
//    }

        return "No more songs to play";

    }

    public void playARequest(Genre genre){
        //throws an exception if this genre is
        //not in the genres of this Deejay
        //else, just play the genre and add one to the amountEachNight
        if(genres.contains(genre)){
            amountSongsANight++;
        }
        else{
            throw new IllegalArgumentException("This genre is not in this Deejay");
        }
    }




}
