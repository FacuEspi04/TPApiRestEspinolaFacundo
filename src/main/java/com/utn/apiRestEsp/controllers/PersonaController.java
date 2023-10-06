package com.utn.apiRestEsp.controllers;

import com.utn.apiRestEsp.entities.Persona;
import com.utn.apiRestEsp.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") //indica que se puede acceder desde distintos origenes a nuestra api
@RequestMapping(path = "api/v1/personas") //indicamos la ruta a la api

public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
