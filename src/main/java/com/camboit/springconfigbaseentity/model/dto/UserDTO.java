package com.camboit.springconfigbaseentity.model.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
}
