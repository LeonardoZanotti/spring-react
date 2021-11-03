/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.controllers;

import com.zanotti.springreact.dto.SaleDTO;
import com.zanotti.springreact.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leonardozanotti
 */
@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService service;
    
    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> response = service.findAll(pageable);
        return ResponseEntity.ok(response);
    }
}
