package cource;

import group.Group;

public class Cource {

    private int cource;
    private String direction;
    private String cafedra;
    private Group group;

    public Cource(int c, String s, String caf, Group g) {
        this.cource = c;
        this.direction = s;
        this.cafedra = caf;
        this.group = g;
    }

    public int getCource() {
        return cource;
    }

    public String getDirection() {
        return direction;
    }

    public void setCource(int nameCource) {
        this.cource = nameCource;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCafedra() {
        return cafedra;
    }

    public void setCafedra(String cafedra) {
        this.cafedra = cafedra;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Cource{"  + '\n' +
                "cource=" + cource  + '\n' +
                ", direction='" + direction + '\n' +
                ", cafedra='" + cafedra + '\n' +
                ", group=" + group  + '\n' +
                '}';
    }
}
