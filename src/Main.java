public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat);
        var paper = 763789;
        System.out.println("paper = " + paper);

        // task 2
        dog += 4;
        System.out.println("dog now is " + dog);
        cat += 4;
        System.out.println("cat now is " + cat);
        paper = paper + 4;
        System.out.println("paper now is " + paper);

        // task 3
        dog -= 3.5;
        System.out.println("dog now is " + dog);
        cat -= 1.6;
        System.out.println("cat now is " + cat);
        paper -= 7639;
        System.out.println("paper now is " + paper);

        // task 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 3;
        System.out.println("friend = " + friend);

        // task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // task 6
        var b1 = 78.2;
        var b2 = 82.7;
        var mass = b1 + b2;
        System.out.println("mass = " + mass);
        System.out.println("difference between masses is " + (b2 - b1));

        // task 7
        var remainWeight = b2 % b1;
        System.out.println("remainder from division is " + remainWeight);

        // task 8
        // 8.1
        var hours = 640;
        System.out.println("hours = " + hours);
        var employees = hours / 8;
        System.out.println("Всего работников в компании - " + employees + " человек.");
        // 8.2
        employees += 94;
        hours = employees * 8;
        System.out.println("Если в компании работает " + employees + " человек, то всего " +
                hours + " часов работы может быть поделено между сотрудниками.");

    }
}