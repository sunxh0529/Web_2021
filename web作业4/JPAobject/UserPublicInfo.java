package com.guapi.demo.JPAobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="UserPublicInfo")
@NoArgsConstructor

public class UserPublicInfo {
    @Id
    private int userId;

    @Basic
    private String userName;

    @Basic
    private Date registerDate;

}
