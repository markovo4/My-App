package app;

public enum DayOfWeek implements WeekAdvisor {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public void advise() {

        String message = switch (this) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    "якщо це будній день з понеділка по четвер включно, друкувати в консоль пораду, як бути продуктивним на роботі";
            case FRIDAY ->
                    "Happy Friday!";
            case SATURDAY, SUNDAY ->
                    "якщо це вихідні, то надрукувати в консоль, які місця ви б порекомендували відвідати";
        };

        System.out.println(message);
    }
}
