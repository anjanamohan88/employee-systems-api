package com.assignment.employeesystemsapi.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "events")

public class EventManagementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String eventName;
    private String eventType;
    private String organizer;
}

