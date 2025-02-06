package com.todo.todo.LoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginTokenImp implements LoginTokenService{
    @Autowired
    private LoginTokenRepository loginTokenRepository;

    @Override
    public LoginToken saveToken(LoginToken token) {
        return loginTokenRepository.save(token);
    }
    @Override
    public List<LoginToken> getAllTokens() {
        return (List<LoginToken>) loginTokenRepository.findAll();
    }
    //Get token for checking is existed or non-exipred
    public LoginToken getToken(String token){
        LoginToken targetToken = loginTokenRepository.findByToken(token);
        return targetToken;
    }
}
