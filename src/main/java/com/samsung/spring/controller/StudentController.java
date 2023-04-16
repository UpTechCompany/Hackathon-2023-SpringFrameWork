package com.samsung.spring.controller;

import com.samsung.spring.domain.Emergency;
import com.samsung.spring.domain.User;
import com.samsung.spring.service.EmergencyImpl;
import com.samsung.spring.service.EmergencyService;
import com.samsung.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final UserService userService;
    private final EmergencyService emergencyService;

    @PostMapping("/user")
    public User add(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable long id) {
        return userService.getById(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id){
        userService.deleteById(id);
    }

    @PostMapping("/emergency")
    public Emergency addEmergency(@RequestBody Emergency emergency){
        return emergencyService.addEmergency(emergency);
    }

    @GetMapping("/emergency")
    public List<Emergency> getAllEmergency() {
        return emergencyService.getAllEmergency();
    }

    @GetMapping("/emergency/{id}")
    public Emergency getByIdEmergency(@PathVariable long id) {
        return emergencyService.getByIdEmergency(id);
    }

    @PutMapping("/emergency")
    public Emergency updateEmergency(@RequestBody Emergency emergency){
        return emergencyService.updateEmergency(emergency);
    }

    @DeleteMapping("/emergency/{id}")
    public void deleteByIdEmergency(@PathVariable long id){
        emergencyService.deleteByIdEmergency(id);
    }
}
