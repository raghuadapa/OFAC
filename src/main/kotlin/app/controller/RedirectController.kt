package app.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.view.RedirectView

@Controller
@RequestMapping("/")
class RedirectController {

    @GetMapping("/")
    fun redirectFromRootToSwagger(model: ModelMap): RedirectView {
        return RedirectView("/swagger-ui.html")
    }
}