import java.util.HashMap;
import java.util.Map;

public class Player {
    private String username;
    private Map<String, Integer> fullSkills;
    private Region location;
    private int credits;
    private Region currentRegion;


    public Player(String name, int pilotSkill, int fighterSkill, int merchantSkill, int engineerSkill, Region r, int credits){
        username = name;
        fullSkills = new HashMap<>();
        fullSkills.put("Pilot", pilotSkill);
        fullSkills.put("Fighter", fighterSkill);
        fullSkills.put("Merchant", merchantSkill);
        fullSkills.put("Engineer", engineerSkill);
        currentRegion = r;
        this.credits = credits;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String n) {
        username = n;
    }

    public Map getFullSkills() {
        return fullSkills;
    }

    public int getPilotSkill() {
        return fullSkills.get("Pilot");
    }

    public void setPilotSkill(int pilotSkill) {
        fullSkills.replace("Pilot", pilotSkill);
    }

    public int getFighterSkill() {
        return fullSkills.get("Fighter");
    }

    public void setFighterSkill(int fighterSkill) {
        fullSkills.replace("Fighter", fighterSkill);
    }

    public int getMerchantSkill() {
        return fullSkills.get("Merchant");
    }

    public void setMerchantSkill(int merchantSkill) {
        fullSkills.replace("Merchant", merchantSkill);
    }

    public int getEngineerSkill() {
        return fullSkills.get("Engineer");
    }

    public void setEngineerSkill(int engineerSkill) {
        fullSkills.replace("Engineer", engineerSkill);
    }

    public void setCredits(int c) {
        credits = c;
    }

    public int getCredits() {
        return credits;
    }

    public Region getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(Region currentRegion) {
        this.currentRegion = currentRegion;
    }
}
