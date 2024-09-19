package group.IT;

import group.Group;

abstract class GroupIT implements Group {
    private int group;
    private int subgroup;
    private int person;
    private String lastDirection;
    private Level levelOfMath;

    public GroupIT(int gr, int cPerson, int subgr) {
        this.group = gr;
        this.person = cPerson;
        this.subgroup = subgr;
    }

    public GroupIT(int gr, int cPerson, int subgr, Level math, String direct) {
        this(gr, cPerson, subgr);
        this.lastDirection = direct;
        this.levelOfMath = math;
    }

    @Override
    public int getGroup() {return group;}

    @Override
    public void setGroup(int group) {this.group = group;}

    @Override
    public int getPerson() {return person;}

    @Override
    public void setPerson(int person) {this.person = person;}

    @Override
    public int getSubgroup() {return subgroup;}

    @Override
    public void setSubgroup(int subgroup) {this.subgroup = subgroup;}

    public Level getLevelOfMath() {
        return levelOfMath;
    }

    public String getLastDirection() {
        return lastDirection;
    }

    public void setLevelOfMath(Level levelOfMath) {
        this.levelOfMath = levelOfMath;
    }

    public void setLastDirection(String lastDirection) {
        this.lastDirection = lastDirection;
    }

    @Override
    public String toString() {
        return "GroupIT{"  + '\n' +
                "group=" + group  + '\n' +
                ", subgroup=" + subgroup  + '\n' +
                ", person=" + person  + '\n' +
                ", lastDirection='" + lastDirection  + '\n' +
                ", levelOfMath=" + levelOfMath  + '\n' +
                '}';
    }
}
