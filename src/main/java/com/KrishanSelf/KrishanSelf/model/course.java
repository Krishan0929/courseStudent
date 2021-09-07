package com.KrishanSelf.KrishanSelf.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class course
{
    @Id
    @Column(name = "course_id")
    private int id;

    private String name;

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private List<student> students;


}
