//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Time time1 = new Time(8, 9, 59);
        Time time2 = new Time(15, 59, 59);
        Time time3 = new Time(23, 59, 58);


        System.out.println(time1);
        System.out.println("Expected value: 08:09:59");
        time1.tick();
        System.out.println(time1);
        System.out.println("Expected value: 08:10:00");
        System.out.println(time2);
        System.out.println("Expected value: 15:59:59");
        time2.tick();
        System.out.println(time2);
        System.out.println("Expected value: 16:00:00");
        System.out.println(time3);
        System.out.println("Expected value: 23:59:58");
        time3.tick();
        System.out.println(time3);
        System.out.println("Expected value: 23:59:59");
        time3.tick();
        System.out.println(time3);
        System.out.println("Expected value: 00:00:00");
        time1.add(time2);
        System.out.println(time1);
        System.out.println("Expected value: 00:10:00");
    }}
