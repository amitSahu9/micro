package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "name cannot be null or emtpy!")
    @Size(min = 5, max = 30, message = "the length of customer name should be between 5 and 3")
    private String name;
    @NotEmpty(message = "email cannot be null or empty")
    @Email(message = "email format invalid")
    private String email;
    @Pattern(regexp = "^[0-9]{10}$", message = "mobile number should be of 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
