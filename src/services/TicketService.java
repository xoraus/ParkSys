package services;

import models.Gate;
import models.Ticket;
import models.VehicleType;
import repositories.GateRepository;

import java.util.Optional;

public class TicketService {

    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(String vehicleNumber, VehicleType vehicleType, Long gateId){
        // Query the database to get the object using ID

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        gateOptional.get().getCurrentOperator();

        // Save the ticket object and vehicle number in the DB - > Repository

        // 1. Create a Ticket Object

        // 2. Select a particular spot for the vehicle

        // 3. Return the object

        return null;
    }
}
