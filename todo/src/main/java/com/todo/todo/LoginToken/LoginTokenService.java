package com.todo.todo.LoginToken;
import java.util.List;

public interface LoginTokenService {
    LoginToken saveToken(LoginToken loginToken);
    List<LoginToken> getAllTokens();
    LoginToken getToken(String token);
}
