package com.epicsoftware.springsample

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

class SomeController {
    @RequestMapping("/hello.htm")
    public ModelAndView helloWorld() {
        print "hello guys ..."
        return new ModelAndView("hello")
    }
}
