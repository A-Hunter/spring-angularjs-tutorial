package spring.mvc.tuto.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.mvc.tuto.entities.BlogEntry;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
@Controller
public class BlogEntryController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry ){
        return entry;
    }

    /**
     @RequestMapping("/test")
     public ResponseEntity<Object> test(){

     BlogEntry blogEntry= new BlogEntry();
     blogEntry.setTitle("The Spring MVC tutorial !");
     return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
     }
     */
    ///////////////////////////////////
    /**
     @RequestMapping("/test")
     public @ResponseBody BlogEntry test(){

     BlogEntry blogEntry= new BlogEntry();
     blogEntry.setTitle("The Spring MVC tutorial !");
     return blogEntry;
     }
     */
}
