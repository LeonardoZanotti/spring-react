/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.services;

import com.zanotti.springreact.dto.SaleDTO;
import com.zanotti.springreact.entities.Sale;
import com.zanotti.springreact.repositories.SaleRepository;
import com.zanotti.springreact.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author leonardozanotti
 */
@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;
    
    @Autowired
    private SellerRepository sellerRepository;
    
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> response = repository.findAll(pageable);
        return response.map(sale -> new SaleDTO(sale));
    }
}
