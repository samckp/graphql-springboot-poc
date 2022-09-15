package com.graphql.poc.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    
}
