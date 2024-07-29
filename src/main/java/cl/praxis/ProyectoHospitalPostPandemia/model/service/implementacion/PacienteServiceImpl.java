package cl.praxis.ProyectoHospitalPostPandemia.model.service.implementacion;

import cl.praxis.ProyectoHospitalPostPandemia.ProyectoHospitalPostPandemiaApplication;
import cl.praxis.ProyectoHospitalPostPandemia.model.dto.Paciente;
import cl.praxis.ProyectoHospitalPostPandemia.model.service.interfaz.PacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    private List<Paciente> pacienteList;
    private static final Logger logger = LoggerFactory.getLogger(ProyectoHospitalPostPandemiaApplication.class);


    public PacienteServiceImpl() {
        pacienteList = new ArrayList<>();
        pacienteList.add(new Paciente(1, "Jacob", "Diaz", 'M', 45, "+5698775625", "jdiaz@yahoo.com"));
        pacienteList.add(new Paciente(2, "Maria", "Gonzalez", 'F', 34, "+5691234567", "maria.gonzalez@example.com"));
        pacienteList.add(new Paciente(3, "Luis", "Martinez", 'M', 29, "+5692345678", "luis.martinez@example.com"));
        pacienteList.add(new Paciente(4, "Ana", "Lopez", 'F', 53, "+5693456789", "ana.lopez@example.com"));
        pacienteList.add(new Paciente(5, "Carlos", "Garcia", 'M', 41, "+5694567890", "carlos.garcia@example.com"));
        pacienteList.add(new Paciente(6, "Sofia", "Hernandez", 'F', 37, "+5695678901", "sofia.hernandez@example.com"));
        pacienteList.add(new Paciente(7, "David", "Rodriguez", 'M', 32, "+5696789012", "david.rodriguez@example.com"));
        pacienteList.add(new Paciente(8, "Laura", "Perez", 'F', 28, "+5697890123", "laura.perez@example.com"));
        pacienteList.add(new Paciente(9, "Miguel", "Sanchez", 'M', 50, "+5698901234", "miguel.sanchez@example.com"));
        pacienteList.add(new Paciente(10, "Isabella", "Ramirez", 'F', 26, "+5699012345", "isabella.ramirez@example.com"));
        pacienteList.add(new Paciente(11, "Javier", "Torres", 'M', 38, "+5690123456", "javier.torres@example.com"));
        pacienteList.add(new Paciente(12, "Valeria", "Flores", 'F', 47, "+5691234568", "valeria.flores@example.com"));
        pacienteList.add(new Paciente(13, "Ricardo", "Vazquez", 'M', 35, "+5692345679", "ricardo.vazquez@example.com"));
        pacienteList.add(new Paciente(14, "Carmen", "Castro", 'F', 39, "+5693456780", "carmen.castro@example.com"));
        pacienteList.add(new Paciente(15, "Jose", "Morales", 'M', 42, "+5694567891", "jose.morales@example.com"));
        pacienteList.add(new Paciente(16, "Natalia", "Ortiz", 'F', 33, "+5695678902", "natalia.ortiz@example.com"));
        pacienteList.add(new Paciente(17, "Pedro", "Gutierrez", 'M', 36, "+5696789013", "pedro.gutierrez@example.com"));
        pacienteList.add(new Paciente(18, "Elena", "Ruiz", 'F', 31, "+5697890124", "elena.ruiz@example.com"));
        pacienteList.add(new Paciente(19, "Manuel", "Munoz", 'M', 48, "+5698901235", "manuel.munoz@example.com"));
        pacienteList.add(new Paciente(20, "Paula", "Jimenez", 'F', 27, "+5699012346", "paula.jimenez@example.com"));
    }

    public PacienteServiceImpl(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public List<Paciente> findAll() {
        logger.info("Ejecutando findAll() de PacienteServiceImpl");
        return pacienteList;
    }
}
