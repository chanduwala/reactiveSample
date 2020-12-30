package com.chandra.reactive.ReactiveProgramming.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDepartmentDTO {
    private Integer departmentId;
    private Integer userId;
    private String departmentName;
    private String userName;
    private int age;
    private double salary;
    private String loc;
}
