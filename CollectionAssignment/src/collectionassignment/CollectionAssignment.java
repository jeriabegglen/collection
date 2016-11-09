
package collectionassignment;

/**
 *
 * @author jeriabegglen
 */
public class CollectionAssignment {

    public String convert(String s1){
        int int1 = Integer.parseInt(s1);
        int hours = 0, remainder = 0, minutes = 0, seconds = 0;
        String dummy;
        hours = int1 / 3600;
        remainder = int1 % 3600;
        minutes = remainder / 60;
        seconds = remainder % 60;
        dummy = "" + hours + minutes + seconds;
        return dummy;
    }
    
}
