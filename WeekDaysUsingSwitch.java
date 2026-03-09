enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class WeekDaysUsingSwitch {
    public static void main(String[] args) {
        
        Day today = Day.MONDAY;

        System.out.print(today + " : ");

        switch (today) {
            case SUNDAY:
                System.out.println("Aaj Sunday Hai......");
                break;

            case MONDAY:
                System.out.println("It is a Start of Week");
                break;
            
            case TUESDAY:
                System.out.println("It is a 2nd Day of Week");
                break;

            case WEDNESDAY:
                System.out.println("It is a 3nd Day of Week");
                break;

            case THURSDAY:
                System.out.println("It is a 4nd Day of Week");
                break;

            case FRIDAY:
                System.out.println("It is a 5nd Day of Week");
                break;

            case SATURDAY:
                System.out.println("It is a 6nd Day of Week");
                break;
        
            default:
                System.out.println("Invalid Day !!.........");
                break;
        }
    }
}
