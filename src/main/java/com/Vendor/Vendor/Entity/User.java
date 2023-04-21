package com.Vendor.Vendor.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="VendorUser")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long VendorId;
    @Column(nullable = false)
    private String VendorName;
    @Column(nullable = false)
    private String VendorTYpe;
    @Column(nullable = false)
    private String Person;
    @Column(nullable = false,unique = true)
    private String Email;
    @Column(nullable = false)
    private String Address;
    @Column(nullable = false)
    private String City;
    @Column(nullable = false)
    private String ProvinceState;
    @Column(nullable = false)
    private String Country;
    @Column(nullable = false)
    private String PostalCode;
    @Column(nullable = false)
    private String PaymentTerms;
    @Column(nullable = false)
    private  String PaymentMethod;
    @Column(nullable = false)
    private String DeliveryTerms;
    @Column(nullable = false)
    private  String DeliverySchedule;
    @Column(nullable = false)
    private String Product;
    @Column(nullable = false)
    private String QualityStarndard;
    @Column(nullable = false)
    private String Pricing;
    @Column(nullable = false)
    private String LeadTime;
    @Column(nullable = false)
    private String MinimumOrderQuantity;
}
