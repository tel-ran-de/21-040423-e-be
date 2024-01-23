package de.telran;

import de.telran.controller.UserController;
import de.telran.dao.UserRepository;
import de.telran.model.User;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserRepository userRepository;

//    @Test
//    public void createUserWithIncorrectEmailShouldReturn400() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/create")
//                .param("email","invalid.test"))
//                .andExpect(MockMvcResultMatchers.status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.content().json("{email:\"невалидный емаил\"}"));
//
//    }

    @Test
    public void createUserWithCorrectEmailShouldReturn400() throws Exception {
        Mockito.when(userRepository.save(Mockito.any())).thenReturn(new User("Test",1,1,"valid@test.com"));
        mockMvc.perform(MockMvcRequestBuilders.post("/create")
                        .param("email","valid@test.com"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(StringContains.containsString("valid@test.com")));

    }
}
