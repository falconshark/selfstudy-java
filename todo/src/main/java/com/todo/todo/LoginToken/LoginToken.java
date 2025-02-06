package com.todo.todo.LoginToken;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginToken {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String token;
    private Integer relatedUser;
    private long expiredDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;   
    }

    public void setrelatedUser(Integer relatedUser) {
        this.relatedUser = relatedUser;
    }

    public Integer getrelatedUser() {
        return relatedUser;
    }

    public Long getExpiredDate() {
        return expiredDate;
    }
    public void setExpiredDate(long expiredDate) {
        this.expiredDate = expiredDate;
    }
}
