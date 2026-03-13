package com.revpay.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OtpVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
	private String email;

    @SuppressWarnings("unused")
	private String otp;

    @SuppressWarnings("unused")
	private LocalDateTime expiryTime;

}