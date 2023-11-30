package no.snusgavekort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/giftcard")
    public String giftcard() {
        return "giftcard";
    }

}
