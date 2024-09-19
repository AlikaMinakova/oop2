package group.IT;

public class GroupITRPO extends GroupIT {

    private Level levelOfEnglish;

    public GroupITRPO(int gr, int cPerson, int subgr) {
        super(gr, cPerson, subgr);
    }

    public GroupITRPO(int gr, int cPerson, int subgr, Level math, String direct) {
        super(gr, cPerson, subgr, math, direct);
    }

    public GroupITRPO(int gr, int cPerson, int subgr, Level math, String direct, Level level) {
        super(gr, cPerson, subgr, math, direct);
        this.levelOfEnglish = level;
    }

    public Level getLevelOfEnglish() {return levelOfEnglish;}

    public void setLevelOfEnglish(Level levelOfEnglish) {this.levelOfEnglish = levelOfEnglish;}

    @Override
    public String toString() {
        return "GroupITRPO{"  + '\n' +
                "group=" + super.getGroup()  + '\n' +
                ", subgroup=" + super.getSubgroup()  + '\n' +
                ", person=" + super.getPerson()  + '\n' +
                ", lastDirection='" + super.getLastDirection()  + '\n' +
                ", levelOfMath=" + super.getLevelOfMath()  + '\n' +
                ", levelOfEnglish=" + levelOfEnglish  + '\n' +
                '}';
    }
}
