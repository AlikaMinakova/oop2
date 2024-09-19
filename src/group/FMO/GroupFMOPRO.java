package group.FMO;

public class GroupFMOPRO extends GroupFMO{

    private AddDirection addDirection;

    public GroupFMOPRO(int gr, int cPerson, int subgr) {
        super(gr, cPerson, subgr);
    }

    public GroupFMOPRO(int gr, int cPerson, int subgr, int cLK, int cWL, Country c) {
        super(gr, cPerson, subgr, cLK, cWL, c);
    }

    public GroupFMOPRO(int gr, int cPerson, int subgr, int cLK, int cWL, Country c, AddDirection addDirect) {
        super(gr, cPerson, subgr, cLK, cWL, c);
        this.addDirection = addDirect;
    }

    public AddDirection getAddDirection() {
        return addDirection;
    }

    public void setAddDirection(AddDirection addDirection) {
        this.addDirection = addDirection;
    }

    @Override
    public String toString() {
        return "GroupFMOPRO{"  + '\n' +
                "group=" + super.getGroup()  + '\n' +
                ", subgroup=" + super.getSubgroup()  + '\n' +
                ", person=" + super.getPerson()  + '\n' +
                "countLanguageKnow=" + super.getCountLanguageKnow()  + '\n' +
                ", countWishLanguages=" + super.getCountWishLanguages()  + '\n' +
                ", country=" + super.getCountry()  + '\n' +
                ", addDirection=" + addDirection  + '\n' +
                '}';
    }
}
