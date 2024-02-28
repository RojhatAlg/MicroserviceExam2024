package com.alg.childrenprofile.model;

import com.alg.parentprofile.model.Parent;
import jakarta.persistence.*;

import java.util.List;

//@Entity
public class ChildProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;

    @ManyToOne
    @JoinColumn(name = "mom_id")
    private Parent mom;

    @ManyToOne
    @JoinColumn(name = "dad_id")
    private Parent dad;

    @ElementCollection
    private List<String> imageUrls;

    // Getters and setters


}
