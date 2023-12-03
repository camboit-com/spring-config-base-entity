package com.camboit.springconfigbaseentity.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDateEntity {
    private String name;
    private String address;

    @PrePersist
    @Override
    protected void onPrePersist() {
        super.onPrePersist();
    }

    @PreUpdate
    @Override
    protected void onPreUpdate() {
        super.onPreUpdate();
    }
}
