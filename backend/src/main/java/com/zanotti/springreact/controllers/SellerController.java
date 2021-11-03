/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.controllers;

import com.zanotti.springreact.dto.SellerDTO;
import com.zanotti.springreact.services.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leonardozanotti
 */
@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    @Autowired
    private SellerService service;
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> response = service.findAll();
        return ResponseEntity.ok(response);
    }
}
