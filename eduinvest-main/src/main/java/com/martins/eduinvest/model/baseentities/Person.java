package com.martins.eduinvest.model.baseentities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@SuperBuilder
@ToString
@Getter
@Setter
public abstract class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Builder.Default
	@Column(nullable = false, updatable = true)
	private boolean isEnabled = false;

	@Builder.Default
	@Column(nullable = false, updatable = true)
	private boolean google2FAEnabled = false;

	@Column(nullable = false)
	private String firstName;
	private String lastName;
	private LocalDateTime dob;
	private String email;
	private String phone;
	private String address;
	private String passwordHash;
}
