package com.sw.paymentservices.userAccount;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    Authentication authentication ;
    public UserController(Authentication authentication)
    {
        this.authentication=authentication;
    }
    @RequestMapping (value = "/signup",method = RequestMethod.POST)
    public ResponseEntity<String> signUp(@RequestBody UserAccount userAccount)
    {
        return  ResponseEntity.status(HttpStatus.CREATED).body(authentication.signUp(userAccount));
    }
    @GetMapping(value="/signin")
    public ResponseEntity<String> signIn(@RequestBody UserAccount userAccount)
    {
        return ResponseEntity.ok(authentication.signIn(userAccount));
    }
    @GetMapping(value = "/users/search")
    public ResponseEntity<UserAccount> search(@RequestParam  ("email") String email,@RequestParam ("password") String password)
    {
        return ResponseEntity.ok(authentication.check(email,password));
    }

}
