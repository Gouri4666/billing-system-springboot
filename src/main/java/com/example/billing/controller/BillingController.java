package com.example.billing.controller;

import com.example.billing.model.Bill;
import com.example.billing.repository.ProductRepository;
import com.example.billing.repository.BillRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BillingController {

    private final ProductRepository repo;
    private final BillRepository billRepo;

    public BillingController(ProductRepository repo, BillRepository billRepo) {
        this.repo = repo;
        this.billRepo = billRepo;
    }

    // Show Billing Page
    @GetMapping("/billing")
    public String billing(Model model) {
        model.addAttribute("products", repo.findAll());
        return "billing";
    }

    // Save Bill (AJAX - no page reload)
    @PostMapping("/saveBill")
    @ResponseBody
    public String saveBill(@RequestParam double total){

        Bill bill = new Bill(total);
        billRepo.save(bill);

        return "saved";
    }

    // View Bill History
    @GetMapping("/billHistory")
    public String billHistory(Model model){

        model.addAttribute("bills", billRepo.findAll());

        return "bill-history";
    }
}