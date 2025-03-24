/*
package org.example.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCrearUsuario() throws Exception {
        mockMvc.perform(post("/usuarios/crear")
                        .contentType("application/json")
                        .content("{\"nombre\":\"Juan Pérez\",\"correo\":\"juan.perez@example.com\",\"contrasena\":\"12345\",\"edad\":30}"))
                .andExpect(status().isOk());
    }
}
*/

