package dao;

import model.Doctor;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 15.12.16.
 */
public interface DoctorDao {

    // Создает новую запись и соответствующего ей доктора
    void addDoctor(long id);

    // Возвращает доктора соответствующего записи с первичным ключом id или null
    Doctor getDoctor(long id);

    // Возвращает список докторов соответствующих всем записям в базе данных
    List<Doctor> getAllDoctors();

    // Сохраняет состояние доктора в базе данных
    void setDoctor(long id);

    // Удаляет запись о докторе из базы данных
    void deleteDoctor(long id);
}
