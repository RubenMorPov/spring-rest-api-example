package net.runesoft.rest.api.example.controller;

import net.runesoft.rest.api.example.view.ExampleView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/endpoint")
    public ResponseEntity<ExampleView> exampleEndpoint() {
        ExampleView exampleView = new ExampleView();

        exampleView.setName("Rubén");
        exampleView.setMail("ruben.morchon@runesoft.net");
        exampleView.setAge(27);
        exampleView.setRegistered(true);

        return new ResponseEntity<>(exampleView, HttpStatus.OK);
    }
}
