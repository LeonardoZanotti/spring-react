/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.services;

import com.zanotti.springreact.dto.SellerDTO;
import com.zanotti.springreact.entities.Seller;
import com.zanotti.springreact.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leonardozanotti
 */
@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;
    
    public List<SellerDTO> findAll() {
        List<Seller> response = repository.findAll();
        return response.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
    }
}
