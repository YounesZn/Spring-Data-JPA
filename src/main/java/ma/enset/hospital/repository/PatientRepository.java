package ma.enset.hospital.repository;

import jakarta.transaction.Transactional;
import ma.enset.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Modifying @Transactional
    @Query("update Patient p set p.name=:x where p.id = :y")
    void setUserInfoById(@Param("x") String name , @Param("y") int id);

    @Override
    void deleteById(Long aLong);

    Patient findByName(String mc);
}
