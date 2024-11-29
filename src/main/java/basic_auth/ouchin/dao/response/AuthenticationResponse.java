package basic_auth.ouchin.dao.response;

import lombok.Data;

import java.util.Date;

@Data
public class AuthenticationResponse {
    private String token;
    private UserResponse user;
    private Date expirationDate;
}
