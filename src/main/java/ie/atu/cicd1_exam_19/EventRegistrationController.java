package ie.atu.cicd1_exam_19;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/registrations")
public class EventRegistrationController {

    private final List<EventRegistration> Registrations = new ArrayList<>();

    @GetMapping
    public List<EventRegistration> getRegistrations(@RequestParam (value = "ticketCode")  String ticketCode) {
        return Registrations;
    }

    @PostMapping("/registrations")
    public EventRegistration addRegistration(@RequestBody EventRegistration registration) {
        Registrations.add(registration);
        return registration;
    }

    @PutMapping
    public EventRegistration updateRegistration(@RequestParam (value = "ticketCode") String ticketCode, @RequestBody EventRegistration registration) {
        registration.setTicketCode(ticketCode);
        return registration;

    }

    @DeleteMapping
    public void deleteRegistration(@RequestParam (value = "ticketCode") String ticketCode) {
        Registrations.removeIf(registration -> registration.getTicketCode().equals(ticketCode));
    }


}
