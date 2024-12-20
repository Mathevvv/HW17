import java.util.Date;

public class Wine {
    public Wine(String name, String tradeMark, String country, String description, Date dateOfFilling) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.description = description;
        this.dateOfFilling = dateOfFilling;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfFilling() {
        return dateOfFilling;
    }

    public void setDateOfFilling(Date dateOfFilling) {
        this.dateOfFilling = dateOfFilling;
    }


    private String name;
    private String tradeMark;
    private String country;
    private String description;
    private Date dateOfFilling;
}
