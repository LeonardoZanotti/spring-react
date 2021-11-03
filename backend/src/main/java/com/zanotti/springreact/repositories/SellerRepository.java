/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zanotti.springreact.repositories;

import com.zanotti.springreact.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author leonardozanotti
 */
public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
