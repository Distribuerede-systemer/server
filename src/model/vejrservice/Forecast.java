package model.vejrservice;

/**
 * Created by danielfranch on 16/10/14.
 * Constructor til ForecastModel Arraylist
 */
public class Forecast {

    private String date;
    private String celsius;
    private String desc;

    public Forecast(String date, String celsius, String desc) {
        this.date = date;
        this.celsius = celsius;
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    /**
     *  In general, the toString method returns a string
   	 *	that "textually represents" this object
     */
    public String toString() {
        return "Forecast{" +
                "date='" + date + '\'' +
                ", celsius='" + celsius + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
