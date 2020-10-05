import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class EntryToLogRunner{
   public static void main(String[] args){
        String key = "OpenSesame!";
        EntryToLog etl = new EntryToLog(key);
        etl.guessPassword();

   }


}
