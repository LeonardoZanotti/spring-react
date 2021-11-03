/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.dto;

import com.zanotti.springreact.entities.Seller;
import java.io.Serializable;

/**
 *
 * @author leonardozanotti
 */
public class SellerDTO implements Serializable {
    private Long id;
    private String name;
    
    public SellerDTO() {}
    
    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
