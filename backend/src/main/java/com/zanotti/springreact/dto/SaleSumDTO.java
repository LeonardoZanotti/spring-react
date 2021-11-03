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
public class SaleSumDTO implements Serializable {
    private String sellerName;
    private Double sum;
    
    public SaleSumDTO() {}
    
    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
    
    public String getSellerName() {
        return this.sellerName;
    }
    
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    public Double getSum() {
        return this.sum;
    }
    
    public void setSum(Double sum) {
        this.sum = sum;
    }
}
