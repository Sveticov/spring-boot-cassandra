package com.sveticov.model;

import jnr.ffi.annotations.SaveError;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by Sveticov on 1/2/2018.
 */
@Table
@Data

public class Customer {
    @PrimaryKey
    private  int id;//@Setter @Getter
    private String firstname;
    private String lastname;
    private int age;

    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//
//
//    public Customer(int id, String firstname, String lastname,int age) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.age=age;
//    }
//
//    public Customer() {
//
//    }
}
