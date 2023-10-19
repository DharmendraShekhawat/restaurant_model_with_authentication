package com.dharmendra.restaurant_model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Restaurant {

    @NotNull(message = "restaurantId not be null !!!")
    private Integer restaurantId;
    @NotEmpty(message = "Restaurant name is mandatory")
    private String restaurantName;
    @NotBlank(message = "Please Enter address")
    private String address;
    @Size(min = 10, max = 10, message = "Enter valid Number!!!")
    private String contactNumber;
    private String speciality;
    private Integer totalStuff;
}
