package ubc.cpsc304.group20.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String year;
    private String month;
    private String date;
    private String showing;
    private Integer attendanceNumber;

    public Performance() {}

    public Performance(Long id, String year, String month, String date, String showing, Integer attendanceNumber) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.date = date;
        this.showing = showing;
        this.attendanceNumber = attendanceNumber;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", showing='" + showing + '\'' +
                ", attendanceNumber=" + attendanceNumber +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShowing() {
        return showing;
    }

    public void setShowing(String showing) {
        this.showing = showing;
    }

    public Integer getAttendanceNumber() {
        return attendanceNumber;
    }

    public void setAttendanceNumber(Integer attendanceNumber) {
        this.attendanceNumber = attendanceNumber;
    }
}
