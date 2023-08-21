package guru.springframework.spring6restmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class ExceptionController {
    //@ExceptionHandler(NotfoundException.class)
    public ResponseEntity handleNotFoundException(){
        System.out.println("In except Handler");
        return ResponseEntity.notFound().build();
    }
}
