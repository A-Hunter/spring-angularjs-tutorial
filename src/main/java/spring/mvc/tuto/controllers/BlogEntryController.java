package spring.mvc.tuto.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.mvc.tuto.controllers.resources.BlogEntryResource;
import spring.mvc.tuto.controllers.resources.BlogEntryResourceAssembler;
import spring.mvc.tuto.entities.BlogEntry;
import spring.mvc.tuto.services.BlogEntryService;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
@Controller
@RequestMapping(value = "/rest/blog-entries")
public class BlogEntryController {

    private BlogEntryService service;

    public BlogEntryController(BlogEntryService service) {
        this.service = service;
    }

    @RequestMapping(value = "/{blogEntryId}", method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> getBlogEntry(@PathVariable Long blogEntryId){
        BlogEntry entry = service.find(blogEntryId);
        if (entry != null) {
            BlogEntryResource blogEntryResource = new BlogEntryResourceAssembler().toResource(entry);
            return new ResponseEntity<BlogEntryResource>(blogEntryResource, HttpStatus.OK);
        }else {
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }
    }

    ////////////////////// 1
    /**
     @RequestMapping("/test")
     public ResponseEntity<Object> test(){

     BlogEntry blogEntry= new BlogEntry();
     blogEntry.setTitle("The Spring MVC tutorial !");
     return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
     }
     */
    ////////////////////// 2
    /**
     @RequestMapping("/test")
     public @ResponseBody BlogEntry test(){

     BlogEntry blogEntry= new BlogEntry();
     blogEntry.setTitle("The Spring MVC tutorial !");
     return blogEntry;
     }
     */
    ////////////////////// 3
    /**
     @RequestMapping(value = "/test", method = RequestMethod.POST)
     public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry ){
     return entry;
     }
     */
}
