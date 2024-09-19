package cource;

import group.Group;

import java.util.List;

public class CourceIT extends Cource {

    private boolean availableOnlineEdu;
    private List<Company> partnerСompanies;

    public CourceIT(int c, String s, String caf, Group g) {
        super(c, s, caf, g);
    }

    public CourceIT(int c, String s, String caf, Group g, boolean online, List<Company> comp) {
        super(c, s, caf, g);
        availableOnlineEdu = online;
        partnerСompanies = comp;
    }

    public List<Company> getPartnerСompanies() {
        return partnerСompanies;
    }

    public boolean getAvailableOnlineEdu() {
        return availableOnlineEdu;
    }

    public void setAvailableOnlineEdu(boolean availableOnlineEdu) {
        this.availableOnlineEdu = availableOnlineEdu;
    }

    public void setPartnerСompanies(List<Company> partnerСompanies) {
        this.partnerСompanies = partnerСompanies;
    }

    @Override
    public String toString() {
        return "CourceIT{"  + '\n' +
                "cource=" + super.getCource()  + '\n' +
                ", direction='" + super.getDirection()  + '\n' +
                ", cafedra='" + super.getCafedra()  + '\n' +
                ", group=" + super.getGroup()  + '\n' +
                ", availableOnlineEdu=" + availableOnlineEdu  + '\n' +
                ", partnerСompanies=" + partnerСompanies  + '\n' +
                '}';
    }
}
