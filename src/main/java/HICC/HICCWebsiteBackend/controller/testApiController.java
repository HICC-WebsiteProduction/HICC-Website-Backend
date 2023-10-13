package HICC.HICCWebsiteBackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class testApiController {

    @GetMapping
    public ResponseEntity<String> test1(){
        return ResponseEntity.ok()
                .body("test api to check Web MVC configuration");
    }

}
