package ie.atu.cicd1_exam_19;

import jakarta.servlet.Registration;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class RegistrationExceptionHandler extends RuntimeException {
    public RegistrationExceptionHandler(String message) {super(message);


    }

}
