package data1700.ukeoppgaver.gjennomgang_prep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    private final List<Motorvogn> motorvognList= new ArrayList<>();
    private final List<Bil> bilList = new ArrayList<>();

    public MotorvognController() {
        Bil b1 = new Bil("Volkswagen", "Beetle");
        bilList.add(b1);
        Bil bil2 = new Bil("Volkswagen", "Polo");
        bilList.add(bil2);
        Bil bil3 = new Bil("Toyota", "Corolla");
        bilList.add(bil3);
        Bil bil4 = new Bil("Suzuki", "Swift");
        bilList.add(bil4);
        Bil bil5 = new Bil("Suzuki", "Cultus");
        bilList.add(bil5);
        Bil bil6 = new Bil("Suzuki", "Alto");
        bilList.add(bil6);
    }

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn bil){
        motorvognList.add(bil);
    }

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(){
        return bilList;
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return motorvognList;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        motorvognList.clear();
    }

    //TODO Add slettEn()
}
