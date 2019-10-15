/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proxy.proxyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 * @author Yesion Aristizabal
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MainZuul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(MainZuul.class, args);
    }
    
}
