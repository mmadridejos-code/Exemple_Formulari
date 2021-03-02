package cat.itb.m9.springboot.exercicis.ex05formularis_lombok.model.servei;

import cat.itb.m9.springboot.exercicis.ex05formularis_lombok.model.entitat.Empleat;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpleatService {
    private List<Empleat> repositori = new ArrayList<>();
    public void afegir(Empleat e) {
        repositori.add(e);
    }
    public List<Empleat> llistat() {
        return repositori;
    }

    @PostConstruct
    public void init() {
        repositori.addAll(
                Arrays.asList(
                        new Empleat(1, "Montse Madridejos", "montse@itb.cat", "677123456"),
                        new Empleat(2, "Alberto Vila", "alberto@itb.cat", "699876543"),
                        new Empleat(3, "Robert López", "robert@bbc.com", "123456789")
                )
        );
    }
}
