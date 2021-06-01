package com.guapi.demo.JPAobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="UserInfo")
@NoArgsConstructor
public class UserInfo extends UserPublicInfo{
    @Basic
    private String password;
}
