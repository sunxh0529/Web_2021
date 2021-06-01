package com.guapi.demo.JPAobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="activity")
@NoArgsConstructor
public class Activity {
    @Id
    private int id;

    @Basic
    private int type;

    @Basic
    private String owner;

    @Basic
    private String info;
}
