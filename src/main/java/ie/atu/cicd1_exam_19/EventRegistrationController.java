package ie.atu.cicd1_exam_19;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestControllerAdvice
@RestController
@RequestMapping("/registrations")
public class EventRegistrationController {

    private final List<EventRegistration> Registrations = new ArrayList<>();

    @GetMapping
    public List<EventRegistration> getRegistrations(@Valid @RequestParam (value = "ticketCode")  String ticketCode) {
        return Registrations;
    }

    @PostMapping()
    public  EventRegistration addRegistration(@Valid @RequestBody EventRegistration registration) {
        Registrations.add(registration);
        return registration;

    }

    @PutMapping
    public EventRegistration updateRegistration(@Valid @RequestParam (value = "ticketCode") String ticketCode, @RequestBody EventRegistration registration) {
        registration.setTicketCode(ticketCode);
        return  registration;

    }

    @DeleteMapping
    public void deleteRegistration(@Valid @RequestParam (value = "ticketCode") String ticketCode) {
        Registrations.removeIf(registration -> registration.getTicketCode().equals(ticketCode));

    }




}
