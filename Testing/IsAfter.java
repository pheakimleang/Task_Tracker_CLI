package Testing;
//import java.time.LocalDateTime Package
import java.time.LocalDate;
import java.time.LocalDateTime;
public class IsAfter {
    public static void main(String[] args){
        //let's say my app release in 2026-09-05
        LocalDate releaseDate = LocalDate.parse("2026-09-05");
        //and today is 2026-09-04
        LocalDate today = LocalDate.parse("2026-09-04");

        //expected output will be
        //"The App is not out yet"
        if (today.isAfter(releaseDate)){
            System.out.println("The App had already been released!");
        } else{
            System.out.println("The App is not out yet");
        }
    }
}
