package dao;

import model.Appointment;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 16.12.16.
 */
public interface AppointmentDao {

    // Создает новую запись и соответствующий ей приём
    void addAppointment(long id);

    // Возвращает приём соответствующий записи с первичным ключом id или null
    Appointment getAppointment(long id);

    // Возвращает список приёмов соответствующих всем записям в базе данных
    List<Appointment> getAllAppointments();

    // Сохраняет состояние приёма в базе данных
    void setAppointment(long id);

    // Удаляет запись о приёме из базы данных
    void deleteAppointment(long id);
}
