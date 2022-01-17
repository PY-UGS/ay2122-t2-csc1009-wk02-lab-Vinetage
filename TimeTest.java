public class TimeTest
{
    public static void main(String[] args)
    {
        Time time1 = new Time();
        time1.showTime();

        Time time2 = new Time();
        time2.setHour(14);
        time2.setMinute(30);
        time2.showTime();
    }
}
