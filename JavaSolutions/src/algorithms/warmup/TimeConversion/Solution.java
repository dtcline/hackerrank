package algorithms.warmup.TimeConversion;

import java.util.*;

public class Solution {

    static String timeConversion(String s) {
        String[] units = s.split(":");

        boolean isPm = false;
        // assume units.length == 3
        String rawSecs = units[2];
        if (rawSecs.endsWith("PM")) {
            isPm = true;
        }

        String rawHrs = units[0];
        int hours = Integer.valueOf((rawHrs.startsWith("0") ? rawHrs.substring(1, 2) : rawHrs));

        if (isPm && hours < 12) { // special case for earlier afternoon times
            hours += 12;
        }
        if (!isPm && hours == 12) { // special case for midnight
            hours = 0;
        }

        String hoursStr = Integer.toString(hours);
        if (hours < 10) {
            hoursStr = "0" + hoursStr;
        }
        return hoursStr + ":" + units[1] + ":" + rawSecs.substring(0, 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
