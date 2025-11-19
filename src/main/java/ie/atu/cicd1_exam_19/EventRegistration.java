package ie.atu.cicd1_exam_19;


import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


@AllArgsConstructor
@Data
public class EventRegistration {
    @NotBlank
    String attendeeName;
    @Email
    String email;
    @Pattern(regexp = "TK-[0-9]{4}")
    String ticketCode;
    @Positive
    int quantity;

}
