package com.RestAPI.TestAPI.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

}

