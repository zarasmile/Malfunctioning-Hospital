package dao;

import model.Doctor;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 15.12.16.
 */
public interface DoctorDao {

    void addDoctor(long id);

    Doctor getDoctor(long id);

    List<Doctor> getAllDoctors();

    void setDoctor(long id);

    void deleteDoctor(long id);
}
