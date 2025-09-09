package com.shophub.controller;



import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/shophub")
    public Map<String, Object> home() {
        return Map.of(
            "project", "ShopHub API – Shop & Employee Management",
            "description", "REST API for managing products, employees, and branches with role-based access",
            "note", "Use the demo Manager account below to explore secured endpoints",
            "demo_manager_account", Map.of(
                "username", "manager1",
                "password", "manager123",
                "role", "MANAGER"
            ),
            "employee_access", new String[]{
                "/shophub/product/allProducts",
                "/shophub/product/serialId/{serialId}",
                "/shophub/product/category/{category}",
                "/shophub/product/brand/{brand}",
                "/shophub/product/location?branch=...&drawerName=..."
            },
            "manager_access", new String[]{
                "/shophub/manager/addEmployee",
                "/shophub/manager/allEmployees",
                "/shophub/manager/deleteEmployee/{id}",
                "/shophub/manager/modifyEmployee",
                "/shophub/manager/saveProduct",
                "/shophub/manager/update",
                "/shophub/manager/delete/{serialId}"
            },
            "roles", "MANAGER: full access | EMPLOYEE: read-only"
        );
    }
}

