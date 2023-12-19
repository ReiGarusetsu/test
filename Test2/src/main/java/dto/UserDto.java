package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    @JsonProperty
    long userId;

    @JsonProperty
    String userName;

    public UserDto(){

    }

    @Override
    public String toString() {
        return "Users: " +
                "userID: " + userId +
                ", userName: " + userName;
    }
}
