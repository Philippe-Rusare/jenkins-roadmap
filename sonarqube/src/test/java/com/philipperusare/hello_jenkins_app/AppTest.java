package com.philipperusare.hello_jenkins_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(App.class)
class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHomePage() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute(
                        "title",
                        equalTo("I HAVE DEPLOY MY FIRST APP WITH JENKIN 😁😁")
                ));

    }

}