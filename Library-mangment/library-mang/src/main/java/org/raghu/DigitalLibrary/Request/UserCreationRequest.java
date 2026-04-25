package org.raghu.DigitalLibrary.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationRequest {
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private String userAddress;
}
