package de.telran;

import de.telran.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(SpringJpaApplication.class)
public class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void createUserWithIncorrectEmailShouldReturn400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/create?email=invalid")
                .requestAttr("email","invalid.test"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(MockMvcResultMatchers.content().json("{email:\"невалидный емаил\"}"));

    }
}
