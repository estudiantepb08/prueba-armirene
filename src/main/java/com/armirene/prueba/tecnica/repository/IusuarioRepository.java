package com.armirene.prueba.tecnica.repository;

import com.armirene.prueba.tecnica.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IusuarioRepository extends JpaRepository<Long, Usuario> {
}
