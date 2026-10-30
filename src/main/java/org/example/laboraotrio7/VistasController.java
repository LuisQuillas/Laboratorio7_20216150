package org.example.laboraotrio7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistasController {

    @GetMapping({"/", "/vista1"})
    public String vista1() { return "vista1"; }

    @GetMapping("/vista2")
    public String vista2() { return "vista2"; }

    @GetMapping("/vista3")
    public String vista3() { return "vista3"; }
}
