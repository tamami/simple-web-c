package lab.aikibo.webc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/halo")
    public String halo(@RequestParam(name="nama", required = false, defaultValue = "Java") String nama,
                       Model model) {
        model.addAttribute("nama", nama);
        return "halo";
    }

}
