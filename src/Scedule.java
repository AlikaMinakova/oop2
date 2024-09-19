import cource.Cource;
import group.Group;

import java.util.List;

public class Scedule {
    private List<String> subjects;
    private List<Integer> rooms;
    private List<String> teachers;
    private Cource cource;
    private Group group;

    public Scedule(List<String> sub, List<Integer> room, List<String> teach, Cource c, Group g) {
        this.subjects = sub;
        this.rooms = room;
        this.teachers = teach;
        this.cource = c;
        this.group = g;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setRooms(List<Integer> rooms) {
        this.rooms = rooms;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<Integer> getRooms() {
        return rooms;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public Cource getCource() {
        return cource;
    }

    public Group getGroup() {
        return group;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Scedule{"  + '\n' +
                "subjects=" + subjects  + '\n' +
                ", rooms=" + rooms  + '\n' +
                ", teachers=" + teachers  + '\n' +
                ", cource=" + cource  + '\n' +
                '}';
    }
}
