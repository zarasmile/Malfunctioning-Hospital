package dao;

import model.Specialty;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 16.12.16.
 */
public interface SpecialtyDao {

    // Создает новую запись и соответствующую ей специальность
    void addSpecialty(long id);

    // Возвращает специальность соответствующую записи с первичным ключом id или null
    Specialty getSpecialty(long id);

    // Возвращает список специальностей соответствующих всем записям в базе данных
    List<Specialty> getAllSpecialties();

    // Сохраняет состояние специальности в базе данных
    void setSpecialty(long id);

    // Удаляет запись о специальности из базы данных
    void deleteSpecialty(long id);
}
