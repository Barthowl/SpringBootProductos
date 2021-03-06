package com.nttdata.ms.app.productos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.ms.app.productos.repo.entity.Producto;
import com.nttdata.ms.app.productos.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoService service;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return service.findAll();
		
	}
	
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id){
		return service.findById(id);
		
	}

}
