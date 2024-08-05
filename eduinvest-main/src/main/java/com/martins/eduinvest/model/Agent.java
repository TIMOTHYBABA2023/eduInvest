package com.martins.eduinvest.model;

import com.martins.eduinvest.enums.AgentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Agent extends Person {
    private String location; // Location details

    @OneToMany(mappedBy = "agent")
    private List<Transaction> transactions;
    private AgentStatus agentStatus;

    private String referralCode;
    private Double referralBonus;
    private Double rate;

    @OneToMany(mappedBy = "agent")
    private List<Customer> referrals; // Referrals linked to this agent

    // Additional fields...
    private boolean emailVerified; // Email verification status
    private String bankDetails; // Could be a JSON or structured object

}
