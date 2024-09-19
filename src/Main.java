import cource.Company;
import cource.CourceIT;
import group.FMO.Country;
import group.FMO.GroupFMO;
import group.Group;
import group.IT.GroupITRPO;
import group.IT.Level;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GroupITRPO g = new GroupITRPO(2, 23, 2, Level.BEGINNER, "FMO", Level.BEGINNER);
        System.out.println(g);

        System.out.println();

        GroupFMO g2 = new GroupFMO(2, 23, 2, 1, 3, Country.GERMAN);
        System.out.println(g2);

        System.out.println();

        List<Company> companies = new ArrayList<>();
        companies.add(Company.SOZVEZDIE);
        companies.add(Company.YANDEX);
        CourceIT c = new CourceIT(3, "prinzh", "piit", g, true, companies);
        System.out.println(c);

        System.out.println();

        List<String> sub = new ArrayList<>();
        List<String> teach = new ArrayList<>();
        List<Integer> rooms = new ArrayList<>();

        sub.add("math");
        sub.add("info");
        sub.add("proga");
        teach.add("Sirota");
        teach.add("Popov");
        teach.add("Solomatin");
        rooms.add(479);
        rooms.add(310);
        rooms.add(279);
        Scedule s = new Scedule(sub, rooms, teach, c, g);
        System.out.println(s);

        System.out.println();

        List<Group> list = new ArrayList<>();
        list.add(g);
        list.add(g2);
        for (Group i: list) {
            System.out.println(i);
        }
    }
}
