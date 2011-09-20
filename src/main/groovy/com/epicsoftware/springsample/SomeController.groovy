package com.epicsoftware.springsample

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/hello.htm")
class SomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String showUserForm() {
        def x = "123"
        print "hello guys ..."
        return ""
    }
}
