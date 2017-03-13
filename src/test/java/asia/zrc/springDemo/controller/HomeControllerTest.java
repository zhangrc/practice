package asia.zrc.springDemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

/**
 * Created by zrc on 2016/9/17.
 */
public class HomeControllerTest {

    private HomeController controller;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        controller = new HomeController();
        mockMvc = standaloneSetup(controller).build();
    }

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/home/1"))
                .andExpect(MockMvcResultMatchers.model().attribute("id","1name"))
                .andExpect(view().name("/WEB-INF/home"))
                .andReturn();
    }
}