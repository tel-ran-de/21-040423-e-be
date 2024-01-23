package de.telran.config;

import de.telran.exception.UserNotActivatedException;
import de.telran.exception.UserNotFoundException;
import de.telran.exception.UsersNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class BadRequestResolver extends ResponseEntityExceptionHandler {
    @ExceptionHandler({UsersNotFoundException.class, UserNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Map<String, String>> errorHandling(Exception e) {
        if(e instanceof UsersNotFoundException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(Map.of("error", "users not found"));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(Map.of("error", "something wrong"));
        }
    }


    @ExceptionHandler({UserNotActivatedException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Map<String, String>> userNotActive(Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(Map.of("error", "users not activated yet, please check mailbox"));
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Map<String, Object>> errorBadRequestHandling(MethodArgumentTypeMismatchException ex) {
        return ResponseEntity.badRequest().body(Map.of("error", "incorrect input", "value", ex.getValue() == null ? "" : ex.getValue()));
    }


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Map<String, Object> constraintViolationExceptionHandler(ConstraintViolationException ex) {
       Map<String, Object> res = new HashMap<>();
        ex.getConstraintViolations()
                .forEach(violation -> {res.put(violation.getPropertyPath().toString(), violation.getMessage());});
        return res;
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatusCode status,
                                                                  WebRequest request) {
        Map<String, Object> res = new HashMap<>();
        ex.getBindingResult().getAllErrors()
                .forEach(error -> {res.put(((DefaultMessageSourceResolvable) error.getArguments()[0]).getDefaultMessage(), error.getDefaultMessage());});
        return ResponseEntity.badRequest().body(res);
    }
}
