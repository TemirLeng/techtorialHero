import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class practice5 {
    private static final Logger LOG= LoggerFactory.getLogger(practice5.class);
    public static void printNumbers(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                LOG.info("FINRA");
            } else if (i % 3 == 0) {
                LOG.info("Fin");
            } else if (i % 5 == 0) {
                LOG.info("RA");
            } else {
               // LOG.info(i);
            }

        }
    }public static void main (String[]args){
        printNumbers(30);
    }

}
