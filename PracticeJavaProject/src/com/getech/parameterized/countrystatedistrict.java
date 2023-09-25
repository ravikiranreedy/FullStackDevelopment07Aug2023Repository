package com.getech.parameterized;
class Country {
    String name;
    int population;
    String capital;

    Country(String co_name, int co_population, String co_capital) {
        name = co_name;
        population = co_population;
        capital = co_capital;

        System.out.println("Country: " + name);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + capital);
        System.out.println("-----------------------------");
    }
}

class State {
    String name;
    String capital;
    int population;

    State(String sta_name, String sta_capital, int sta_population) {
        name = sta_name;
       capital = sta_capital;
        population = sta_population;

        System.out.println("State: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population);
        System.out.println("-----------------------------");
    }
}

class District {
    String name;
    String division;
    int population;

    District(String dis_name, String dis_division, int dis_population) {
       name = dis_name;
       division = dis_division;
        population = dis_population;

        System.out.println("District: " + name);
        System.out.println("Division: " + division);
        System.out.println("Population: " + population);
        System.out.println("-----------------------------");
    }
}
public class countrystatedistrict {

	public static void main(String[] args) {
		Country country = new Country("india",88999898, "delhi");
        State state = new State("karnataka", "bengalur", 398223);
        District district = new District("raichur", "raichur rural", 139107);

	}

}
