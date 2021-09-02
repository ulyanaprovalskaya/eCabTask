package eu.senla.ecabtask.producer.controller.exceptionhandler;

import eu.senla.ecabtask.exception.BookingNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class ECabExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleAllUncaughtException(Exception exception) {
        log.error("SYSTEM ERROR: " + exception.getMessage());
    }


    @ExceptionHandler(BookingNotFoundException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    protected void handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpStatus status) {

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
    }
}
