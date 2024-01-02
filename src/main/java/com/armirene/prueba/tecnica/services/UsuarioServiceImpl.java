package com.armirene.prueba.tecnica.services;

import com.armirene.prueba.tecnica.models.entity.Usuario;
import com.armirene.prueba.tecnica.repository.IusuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    private IusuarioRepository iusuarioRepository;
    @Override
    public List<Usuario> getUsuarioFindall() {
        return ((List<Usuario>) iusuarioRepository).addAll();
    }
}
