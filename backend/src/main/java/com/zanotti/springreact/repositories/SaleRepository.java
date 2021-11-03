/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zanotti.springreact.repositories;

import com.zanotti.springreact.dto.SaleSuccessDTO;
import com.zanotti.springreact.dto.SaleSumDTO;
import com.zanotti.springreact.entities.Sale;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author leonardozanotti
 */
public interface SaleRepository extends JpaRepository<Sale, Long>{
    @Query("SELECT new com.zanotti.springreact.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();
    
    @Query("SELECT new com.zanotti.springreact.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
