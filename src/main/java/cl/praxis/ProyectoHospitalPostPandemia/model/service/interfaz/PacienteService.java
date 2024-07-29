package cl.praxis.ProyectoHospitalPostPandemia.model.service.interfaz;

import cl.praxis.ProyectoHospitalPostPandemia.model.dto.Paciente;
import java.util.List;

public interface PacienteService {

    List<Paciente> findAll();
}
