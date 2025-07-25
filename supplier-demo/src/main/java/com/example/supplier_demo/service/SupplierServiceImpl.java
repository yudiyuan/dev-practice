package com.example.supplier_demo.service;

import com.example.supplier_demo.dao.Supplier;
import com.example.supplier_demo.dao.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService{

@Autowired
private SupplierRepository supplierRepository;

    @Override
    public Supplier getSupplierById(long id) {

        return supplierRepository.findById(id).orElseThrow(RuntimeException::new);

    }
}
