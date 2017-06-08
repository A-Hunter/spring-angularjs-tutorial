package spring.mvc.tuto;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spring.mvc.tuto.controllers.BlogEntryController;

/**
 * Created by Ghazi Naceur on 08/06/2017.
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    private MockMvc mockMvc;
    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test() throws Exception {

//        mockMvc.perform(get("/test")).andDo(print());
        mockMvc.perform(post("/test")
                .content("{\"title\":\"The Spring MVC tutorial !!!!!\"}")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print());
    }
}
