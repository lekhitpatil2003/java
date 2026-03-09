enum Signal{
    RED,
    YELLOW,
    GREEN
}

public class TrafficSignal {
    public static void main(String[] args) {
        Signal traffic = Signal.RED;

        switch (traffic) {
            case RED:
                System.out.println("Stop. off vehicle Engine.!");
                break;
            
            case YELLOW:
                System.out.println("Ready. on Vehicle Engine.!");
                break;
            
            case GREEN:
                System.out.println("Go.");
                break;
        
            default:
                System.out.println("Invalid traffic light. !!!");
                break;
        }

    }
}
