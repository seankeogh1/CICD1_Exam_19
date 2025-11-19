package ie.atu.cicd1_exam_19;

import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.parameters.ValidatedParameter;
import jakarta.servlet.Registration;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class RegistrationExceptionHandler extends RuntimeException {
    public RegistrationExceptionHandler(String Error) {
        super(202 + ": " + Error);
    }

}
