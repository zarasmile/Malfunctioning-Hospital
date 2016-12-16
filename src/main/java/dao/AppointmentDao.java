package dao;

import model.Appointment;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 16.12.16.
 */
public interface AppointmentDao {

    void addAppointment(long id);

    Appointment getAppointment(long id);

    List<Appointment> getAllAppointments();

    void setAppointment(long id);

    void deleteAppointment(long id);
}
