package com.armirene.prueba.tecnica.controllers;

import com.armirene.prueba.tecnica.models.entity.Usuario;
import com.armirene.prueba.tecnica.services.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UsuarioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);
    @Autowired
    IUsuarioService iUsuarioService;
    private String mesagess;

    @GetMapping("/usuarios")
    public ResponseEntity<?> getUsuario(){
        ResponseEntity<List<Usuario>> responseUsuarios = null;
        ResponseEntity<String> responseUsuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            usuarios = iUsuarioService.getUsuarioFindall();
            if(usuarios.size() >= 1){
                responseUsuarios = ResponseEntity.status(HttpStatus.OK).body(usuarios);
            }else{
                mesagess = "No se encontraron registros";
                responseUsuario = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mesagess);
                return responseUsuario;
            }
        }catch (Exception ex){
            LOGGER.error("Error metodo guardar", ex.getCause().getMessage());
            mesagess = "Error con el servidor";
            responseUsuario = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mesagess);
            return responseUsuario;

        }
        return responseUsuarios;
    }
}
