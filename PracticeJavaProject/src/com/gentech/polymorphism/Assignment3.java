package com.gentech.polymorphism;

abstract class Weather {
    abstract void seasons();
}

class summer extends Weather {
    void seasons() {
        String Name = "Summer";
        System.out.println("Season name: " + Name);
        System.out.println("March, April, May, June");
        System.out.println();
    }
}

class Winter extends Weather {
    void seasons() {
        String Name = "Winter";
        System.out.println("Season name: " + Name);
        System.out.println("November, December, January, February");
        System.out.println();
    }
}

class Spring extends Weather {
    void seasons() {
        String Name = "Spring";
        System.out.println("Season name: " + Name);
        System.out.println("July, August, September, October");
        System.out.println();
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Weather r = null;

        summer o1 = new summer();
        Winter o2 = new Winter();
        Spring o3 = new Spring();

        r = o1;
        r.seasons();

        r = o2;
        r.seasons();

        r = o3;
        r.seasons();
    }
}
