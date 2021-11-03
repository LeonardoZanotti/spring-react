/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zanotti.springreact.dto;

import com.zanotti.springreact.entities.Sale;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author leonardozanotti
 */
public class SaleDTO implements Serializable {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    
    private SellerDTO seller;
    
    public SaleDTO() {}
    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }
    
    public SaleDTO(Sale entity) {
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.seller = new SellerDTO(entity.getSeller());
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getVisited() {
        return this.visited;
    }
    
    public void setVisited(Integer visited) {
        this.visited = visited;
    }
    
    public Integer getDeals() {
        return this.deals;
    }
    
    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public SellerDTO getSeller() {
        return this.seller;
    }
    
    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }
}
