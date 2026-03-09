package ENUM;

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class TestEnum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println(today);
    }
}
