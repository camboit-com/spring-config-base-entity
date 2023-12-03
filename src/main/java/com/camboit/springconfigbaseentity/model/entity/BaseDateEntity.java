package com.camboit.springconfigbaseentity.model.entity;

import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
@ToString
public class BaseDateEntity extends AbstractBaseEntity {
    @CreatedDate protected LocalDate createdAt;
    @LastModifiedDate protected LocalDate lastModifiedAt;

    protected void onPrePersist() {
        this.createdAt = LocalDate.now();
        this.lastModifiedAt = LocalDate.now();
    }

    protected void onPreUpdate() {
        this.lastModifiedAt = LocalDate.now();
    }
}
