class Clock {
    public void showTime() {
        System.out.println("Tells only time, day, and date");
    }
}

class Watch extends Clock {
    public void showWatchFeatures() {
        System.out.println("Can set alarm");
        System.out.println("Lights option is available");
    }
}

class SmartWatch extends Watch {
    public void showSmartWatchFeatures() {
        System.out.println("Can be used to make phone calls");
        System.out.println("Can take photos");
        System.out.println("Can be used as a simple phone");
    }
}

public class smartwatch {
    public static void main(String[] args) {
        System.out.println("------ Advantages of Smart Watch -------");

        SmartWatch sw = new SmartWatch();
        sw.showTime();
        sw.showWatchFeatures();
        sw.showSmartWatchFeatures();
    }
}
