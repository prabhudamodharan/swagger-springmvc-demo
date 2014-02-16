package com.ak.swaggermvc.demo.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class NoOtherMappingController {

  @RequestMapping(value = {"/some/path/with/no/companions/{businessId}"}, method = GET)
  @ResponseBody
  public Business getSomeBusiness(@PathVariable Integer businessId) {
    return new Business();
  }

}
