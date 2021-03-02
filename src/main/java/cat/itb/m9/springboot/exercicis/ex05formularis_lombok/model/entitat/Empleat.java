package cat.itb.m9.springboot.exercicis.ex05formularis_lombok.model.entitat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleat {
    private int id;
    private String nom;
    private String email;
    private String telefon;
}
