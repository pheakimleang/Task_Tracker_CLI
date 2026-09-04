package Testing;
//import java.time.LocalDateTime Package
import java.time.LocalDate;
import java.time.LocalDateTime;
public class IsAfter {
    public static void main(String[] args){
        /*
        How to use the isAfter();
        #In Java, isAfter() is a built-in method used to check if a specific date,
            time, or instant occurs chronologically after another specified date or time.
            It evaluates the comparison and returns a boolean value (true or false)
        */

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
