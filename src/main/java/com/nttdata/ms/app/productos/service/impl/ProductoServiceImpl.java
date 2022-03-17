package com.nttdata.ms.app.productos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.ms.app.productos.repo.ProductosDaoJPA;
import com.nttdata.ms.app.productos.repo.entity.Producto;
import com.nttdata.ms.app.productos.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductosDaoJPA dao;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional (readOnly=true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

}
