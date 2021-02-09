package com.crud2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "incrementDomain")
    @GenericGenerator(name = "incrementDomain", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String title;

    @Column(name = "description")
    private String content;

}
