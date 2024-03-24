package com.deploy2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class SumController {

    private Random random = new Random();
    @GetMapping("/random")
    public ResponseEntity<Integer> randomSum(){
        Integer sum = random.nextInt() + random.nextInt();
        return ResponseEntity.ok().body(sum);
    }
}
