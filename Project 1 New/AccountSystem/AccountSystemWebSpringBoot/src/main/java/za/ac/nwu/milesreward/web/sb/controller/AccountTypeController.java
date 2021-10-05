package za.ac.nwu.milesreward.web.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.as.domain.service.GeneralResponse;

@RestController
public class AccountTypeController {
    @GetMapping("/ping")
    public GeneralResponse<String> ping(@RequestParam(value = "echo", defaultValue = "pong") String echo)
    {
    return new GeneralResponse<String>( true , echo);
    }
}
