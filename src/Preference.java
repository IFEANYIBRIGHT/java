
import java.util.List;

public class Preference {
    private Long id;
    private Integer miniAge;
    private Integer maxAge;
    private List < BodyType > bodyTypes;
    private List < Gender > genders;
    private Integer maxiDistance;
    private List <LoveLanguage> loveLanguages;
    private List < Hobbies > hobbies;

    public Long getId() {
        return id;
    }
    public Integer getMiniAge() {
        return miniAge; }
    public Integer getMaxAge() {
        return maxAge;
    }
    public List<BodyType> getBodyTypes() {
        return bodyTypes;
    }
    public List<Gender> getGenders() {
        return genders;
    }
    public Integer getMaxiDistance() {
        return maxiDistance;
    }
    public List<LoveLanguage> getLoveLanguages() {
        return loveLanguages;
    }
    public List<Hobbies> getHobbies() {
        return hobbies;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setMiniAge(Integer miniAge) {
        this.miniAge = miniAge;
    }
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }
    public void setBodyTypes(List<BodyType> bodyTypes) {
        this.bodyTypes = bodyTypes;
    }
    public void setGenders(List<Gender> genders) {
        this.genders = genders;
    }
    public void setMaxiDistance(Integer maxiDistance) {
        this.maxiDistance = maxiDistance;
    }
    public void setLoveLanguages(List<LoveLanguage> loveLanguages) {
        this.loveLanguages = loveLanguages;
    }
    public void setHobbies(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }
}