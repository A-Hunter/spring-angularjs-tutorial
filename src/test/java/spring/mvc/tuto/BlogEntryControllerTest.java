package spring.mvc.tuto;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spring.mvc.tuto.controllers.BlogEntryController;
import spring.mvc.tuto.entities.BlogEntry;
import spring.mvc.tuto.services.BlogEntryService;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController controller;

    /**
     * Initiate a service and injects in our controller :
     * lookup the setup() method
     */
    @Mock
    private BlogEntryService service;

    private MockMvc mockMvc;
    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void getExistingBlogEntry() throws Exception{

        BlogEntry entry = new BlogEntry();
        entry.setId(1L);
        entry.setTitle("The first blog");

        when(service.find(1L)).thenReturn(entry);
        mockMvc.perform(get("/rest/blog-entries/1"))
                .andDo(print())
                .andExpect(jsonPath("$.title",is(entry.getTitle())))
                .andExpect(jsonPath("$.links[*].href",hasItem(endsWith("/blog-entries/1"))))
                .andExpect(status().isOk());
    }

    @Test
    public void getNonExistingBlogEntry() throws Exception{

        when(service.find(1L)).thenReturn(null);
        mockMvc.perform(get("/rest/blog-entries/1"))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    /**
    @Test
    public void test() throws Exception {

//        mockMvc.perform(get("/test")).andDo(print());
        mockMvc.perform(post("/test")
                .content("{\"title\":\"The Spring MVC tutorial !!!!!\"}")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(jsonPath("$.title", is("The Spring MVC tutorial !!!!!")))
                .andDo(print());
    }
    */
}
