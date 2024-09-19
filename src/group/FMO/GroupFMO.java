package group.FMO;

import group.Group;

public class GroupFMO implements Group {
    private int group;
    private int subgroup;
    private int person;
    private int countLanguageKnow;
    private int countWishLanguages;
    private Country country;

    public GroupFMO(int gr, int cPerson, int subgr) {
        this.group = gr;
        this.person = cPerson;
        this.subgroup = subgr;
    }

    public GroupFMO(int gr, int cPerson, int subgr, int cLK, int cWL, Country c) {
        this(gr, cPerson, subgr);
        country = c;
        countLanguageKnow = cLK;
        countWishLanguages = cWL;
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

    public Country getCountry() {
        return country;
    }

    public int getCountLanguageKnow() {
        return countLanguageKnow;
    }

    public int getCountWishLanguages() {
        return countWishLanguages;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCountLanguageKnow(int countLanguageKnow) {
        this.countLanguageKnow = countLanguageKnow;
    }

    public void setCountWishLanguages(int countWishLanguages) {
        this.countWishLanguages = countWishLanguages;
    }

    @Override
    public String toString() {
        return "GroupFMO{"  + '\n' +
                "group=" + group  + '\n' +
                ", subgroup=" + subgroup  + '\n' +
                ", person=" + person  + '\n' +
                ", countLanguageKnow=" + countLanguageKnow  + '\n' +
                ", countWishLanguages=" + countWishLanguages  + '\n' +
                ", country=" + country  + '\n' +
                '}';
    }
}
