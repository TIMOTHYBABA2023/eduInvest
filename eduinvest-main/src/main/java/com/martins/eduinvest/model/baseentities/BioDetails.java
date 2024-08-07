package com.martins.eduinvest.model.baseentities;

import com.martins.eduinvest.enums.IdentificationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BioDetails {
    private IdentificationType identificationType;
    private boolean IdentityVerified; // NIN verification status
    @Id
    private Long id;

}
