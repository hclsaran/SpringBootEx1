package com.saran.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
    private int eid;
    private String ename;
    @Autowired
    private Department department;//HAS A
    
    public void showEployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Information Technology");
        System.out.println("Department : " + department.getDeptName());
    }
}