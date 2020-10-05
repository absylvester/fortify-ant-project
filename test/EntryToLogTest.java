import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class EntryToLogTest{

   String key = "unlockDoor";
   EntryToLog entryLog = new EntryToLog(key);
   
   @Test
   public void testDisplayKey(){
     assertEquals(key, entryLog.displayKey());
   }

}
