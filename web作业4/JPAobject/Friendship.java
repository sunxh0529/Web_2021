package com.guapi.demo.JPAobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Friendship")
@NoArgsConstructor
public class Friendship {
    @Id
    private int id;

    @Basic
    private String ownerName;

    @Basic
    private String targetName;

}
