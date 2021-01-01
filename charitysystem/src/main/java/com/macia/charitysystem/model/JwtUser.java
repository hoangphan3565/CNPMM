package com.macia.charitysystem.model;

import com.macia.charitysystem.utility.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true,length = 10)
    private String username;

    @Column(length=500)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserType usertype;
}