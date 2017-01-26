
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kent Marete
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String firstArg = null;
            if (args.length > 0) {
                firstArg = args[0];
            }
            // call the file to read
            Map<Integer, Float> diffValue = new HashMap<Integer, Float>();
            Map<Integer, Float> result = new HashMap<Integer, Float>();

            Scanner scanner = new Scanner(new File("weather.dat"));
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (lineNumber >= 3 && lineNumber < 33 ) {
                    //System.out.println("line " + lineNumber + " :" + line);
                    String[] numbers = line.split(" ");

                    float MxT = 0;
                    float MnT = 0;
                    int pos = 1;
                    int day = 0;
                    float df = 0;
                    for (String num : numbers) {
                        if (pos <= 3) {
                            if (!num.isEmpty()) {
                                //System.out.println("Pos " + pos + ": " + num);
                                float val = 0;
                                try {
                                    String str = num;
                                    str = str.replaceAll("[^\\d.]", "");
                                    val = Float.parseFloat(str);
                                } catch (Exception e) {
                                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                                    val = 0;
                                }

                                if (pos == 1) {
                                    day = (int) val;
                                } else if (pos == 2) {
                                    MxT = val;
                                } else if (pos == 3) {
                                    MnT = val;

                                    df = MxT - MnT;
                                    if ("showall".equalsIgnoreCase(firstArg)) {
                                        System.out.println("Day " + day + ": " + df);
                                    }
                                    diffValue.put(day, df);
                                }

                                pos++;
                            }
                        }
                    }

                }
                lineNumber++;
            }

            // Get a set of the entries
            Entry<Integer, Float> set = getMaxEntry(diffValue);

            System.out.println(set.getKey() + " " + set.getValue());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Return the maximum key and value of the Entry Map
     *
     * @param map
     * @return
     */
    public static Entry<Integer, Float> getMaxEntry(Map<Integer, Float> map) {
        Entry<Integer, Float> maxEntry = null;
        Float max = Collections.max(map.values());

        for (Entry<Integer, Float> entry : map.entrySet()) {
            Float value = entry.getValue();

            if (null != value && Objects.equals(max, value)) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

}
