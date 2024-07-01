package com.my_backend.practice.manageFinance.Transactions;

import com.my_backend.practice.manageFinance.DBConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;

@RestController
public class TransactionController {
    @GetMapping("/transactions")
    String all() {
        Connection dbConnection = DBConnection.getConnection();
        return "Hello Eran";
    }
}
