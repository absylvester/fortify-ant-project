import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class EntryToLog {

   private String password;

   public EntryToLog(String password){
       this.password = password;
   }

   public String displayKey(){
       System.out.println(password);
       return password;
   }

   
   private static final Logger logger = LogManager.getLogger(EntryToLog.class);

   public void guessPassword(){
       // Logger logger = LogManager.getLogger(EntryToLog.class);
        //Enter data using BufferReader
        BufferedReader reader =
                   new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String entry;
        System.out.println("Try and guess the password!");
      try{
        while((entry = reader.readLine()) != null)
        {
             if(entry.matches(password)){
                 logger.info("You got the correct code!  Thanks!");
                 System.out.println("Correct!");
                 break;
             }else{
                logger.warn("Incorrect code!");
                System.out.println("Wrong password. Please try again.");
            }
        }
       }catch(IOException e){
            logger.error("Something went wrong . . .");
       }       

   }
   
}
