/**
 *
 * @author jeriabegglen
 */

package collectionassignment;

import static kiss.API.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithKiss {
    
    void run() {
    
        Collection<Integer> value = new ArrayList<Integer>();
   
        value.add(9630);
        value.add(8955);
        value.add(4766);
        value.add(5001);
     
        int hours = 0, minutes = 0, seconds = 0, remainder = 0;
        for(int i : value){
            hours = i / 3600;
            remainder = i % 3600;
            minutes = remainder / 60;
            seconds = remainder % 60;
            System.out.println(i + " seconds = " + hours + ":" + minutes + ":" + seconds + ":");
        } 
        
        
    }
    
    void testConvertion() {
        try (Close in = inProvide(9360, EOL)){
            try (Close out = outExpect("24030")){
            }
        }
    
    }
}

