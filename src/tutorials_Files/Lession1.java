import java.util.ArrayList;

class Shufflel {

    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                System.out.print("-");
            }
            x = x - 1;
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            if (x == 1) {
                System.out.print("-");
                System.out.print("d");
            }
            x = x - 1;
        }
    }
}

class Exercise1a {

    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            } else {
                System.out.println("Small x");
                x = x + 10;
            }
        }
    }
}

class Exercise1c {

    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 2;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

class Echo {

    int count = 0;

    void hello() {
        System.out.print("helloooo.....");
    }
}

class EchoTestDrive {

    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

class Hobbits {

    String name;
}

class HobbitsTest {

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}

class testArrays {

    public static void main(String[] args) {
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.print("island = ");
            System.out.println(islands[ref]);
        }
    }
}

class ArrayListMagnet {

    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printList(a);

        if (a.contains("three")) {
            a.add("four");
        }

        a.remove(2);
        printList(a);

        if (a.indexOf("four") == 3) {
            a.add(4, "4.2");
        }
        printList(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printList(a);
    }
}
//output
//zero one two three
//zero one three four
//zero one three four 4.2
//zero one three four 4.2
