package src.LLDwithMC.Medium.MovieBookingSystem;

public class MovieBookingService {
    private static volatile MovieBookingService instance=null;

    private MovieBookingService(){};

    public static MovieBookingService getInstance(){
        if(instance==null){
            synchronized (MovieBookingService.class){
                if(instance==null){
                    instance=new MovieBookingService();
                }
            }
        }
        return instance;
    }
    //add

    //update

//    remove



}
