package dao;

import model.Specialty;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 16.12.16.
 */
public interface SpecialtyDao {

    void addSpecialty(long id);

    Specialty getSpecialty(long id);

    List<Specialty> getAllSpecialties();

    void setSpecialty(long id);

    void deleteSpecialty(long id);
}
