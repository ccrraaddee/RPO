package ru.iu3.rpo.backend.controllers;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
=======
>>>>>>> 65e24588140698f9893926921a61c6092d360c15
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:3000")
=======
>>>>>>> 65e24588140698f9893926921a61c6092d360c15
@RestController
@RequestMapping("/api/v1")
public class SampleController {

    @GetMapping("/title")
    public String getTitle(){
        return "<title>Hello from Backend</title>";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 65e24588140698f9893926921a61c6092d360c15
