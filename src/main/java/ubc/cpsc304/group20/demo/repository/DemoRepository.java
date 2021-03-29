package ubc.cpsc304.group20.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ubc.cpsc304.group20.demo.model.Performance;
import ubc.cpsc304.group20.demo.wrapper.PerformanceAttendanceByDate;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<Performance, Long> {

    @Query( value = "SELECT * " +
                    "FROM performance",
            nativeQuery = true)
    List<Performance> getAllPerformance();

    @Query( value = "SELECT year, month, date, SUM(attendance_number) AS totalAttendance " +
                    "FROM performance " +
                    "GROUP BY year, month, date",
            nativeQuery = true)
    List<Object[]> getPerformanceAttendanceByDate();
}
