package data1700.ukeoppgaver.gjennomgang_prep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    @Autowired
    MotorvognRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn motorvogn){
        rep.lagreKunde(motorvogn);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return rep.hentAlle();
    }

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(){
        return rep.hentBiler();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlle();
    }

    @GetMapping("/slettEn")
    public void slettEn(int id){
        rep.slettEn(id);
    }
}
