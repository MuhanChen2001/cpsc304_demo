package ubc.cpsc304.group20.demo.wrapper;

import java.math.BigDecimal;

public class PerformanceAttendanceByDate {

    private String year;
    private String month;
    private String date;
    private Long totalAttendance;

    public PerformanceAttendanceByDate() {
    }

    public PerformanceAttendanceByDate(String year, String month, String date, Long totalAttendance) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.totalAttendance = totalAttendance;
    }

//    public PerformanceAttendanceByDate(Object[] objects) {
//        this.year = (String) objects[0];
//        this.month = (String) objects[1];
//        this.date = (String) objects[2];
//        this.totalAttendance =  ((BigDecimal) objects[3]).intValue();
//    }

    @Override
    public String toString() {
        return "PerformanceAttendanceByDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", totalAttendance=" + totalAttendance +
                '}';
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

    public PerformanceAttendanceByDate(Long totalAttendance) {
        this.totalAttendance = totalAttendance;
    }
}
