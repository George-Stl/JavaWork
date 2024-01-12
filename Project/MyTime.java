package Project;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        this(System.currentTimeMillis());
    }
    public MyTime(long elapseTime){
        setTime(elapseTime);
    }
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000;
        second= (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        int totalHours = (int) (totalMinutes / 60);
        hour = (totalHours % 24);

    }

    public static void main(String[] args) {
        MyTime time = new MyTime();
        System.out.println("Текущее время GMT: " + time.getHour() +
                ":" + time.getMinute() + ":" + time.getSecond());
        MyTime timeMillis = new MyTime(123456789L);
        System.out.println("Время 123456789L: " + timeMillis.getHour() +
                ":" + timeMillis.getMinute() + ":" + timeMillis.getSecond());
        MyTime timeSpec = new MyTime(5, 23, 55);
        System.out.println("Заданное пользователем время: " + timeSpec.getHour() +
                ":" + timeSpec.getMinute() + ":" + timeSpec.getSecond());
        timeMillis.setTime(555550000L);
        System.out.println("Время 555550000L: " + timeMillis.getHour() +
                ":" + timeMillis.getMinute() + ":" + timeMillis.getSecond());
    }
}
