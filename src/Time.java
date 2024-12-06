/**
 * The Time class represents a chosen time.
 */

public class Time {
    private int hrs;
    private int mins;
    private int secs;

    /**
     * Constructs a Time object represents a chosen time.
     * @param x represents hours.
     * @param y represents minutes.
     * @param z represents seconds.
     */


    public Time(int x, int y, int z){
        hrs = x;
        mins = y;
        secs = z;
    }

    /**
     * Updates the time by one second accounting for time going over.
     */

    public void tick(){
        secs++;
        if (secs == 60){
            secs -= 60;
            mins++;
        }
        if (mins == 60){
            mins -= 60;
            hrs++;
        }
        if (hrs == 24){
            hrs -= 24;
        }

    }

    /**
     * Adds time to the current time object by using another time object.
     * @param x is the time object being added.
     */

    public void add(Time x){
        secs += x.secs;
        mins += x.mins;
        hrs += x.hrs;
        if (secs >= 60){
            secs -= 60;
            mins++;
        }
        if (mins >= 60){
            mins -= 60;
            hrs++;
        }
        if (hrs >= 24){
            hrs -= 24;
        }
    }

    @Override
    /**
     * @return a string representing the time.
     */
    public String toString() {
        String hours = ""+hrs;
        String minutes = ""+mins;
        String seconds = ""+secs;
        if (hrs < 10)
            hours = "0"+hrs;
        if (mins < 10)
            minutes = "0"+mins;
        if (secs < 10)
            seconds = "0"+secs;
        return hours+":"+minutes+":"+seconds;
    }


}
