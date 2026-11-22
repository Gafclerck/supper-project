package sn.supper.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor 
@Getter
@Setter
public class Projet {
    private String code;
    private String nom;
    private String description;
}
