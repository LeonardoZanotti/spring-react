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
public class SaleSuccessDTO implements Serializable {
    private String sellerName;
    private Long visited;
    private Long deals;
    
    public SaleSuccessDTO() {}
    
    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
    
    public String getSellerName() {
        return this.sellerName;
    }
    
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    public Long getVisited() {
        return this.visited;
    }
    
    public void setVisited(Long visited) {
        this.visited = visited;
    }
    
    public Long getDeals() {
        return this.deals;
    }
    
    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
