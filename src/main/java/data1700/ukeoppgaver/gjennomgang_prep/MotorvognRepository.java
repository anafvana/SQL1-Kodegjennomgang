package data1700.ukeoppgaver.gjennomgang_prep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorvognRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreKunde(Motorvogn bil){
        String sql = "INSERT INTO Motorvogn(personnr, navn, adresse, kjennetegn, merke, type) VALUES (?, ?, ?, ?, ?, ?);";
        db.update(sql, bil.getPersonnr(), bil.getNavn(), bil.getAdresse(), bil.getKjennetegn(), bil.getMerke(), bil.getType());
    }

    public List<Motorvogn> hentAlle(){
        String sql = "SELECT * FROM Motorvogn;";
        List<Motorvogn> motorvognList = db.query(sql, new BeanPropertyRowMapper(Motorvogn.class));
        return motorvognList;
    }

    public List<Bil> hentBiler(){
        String sql = "SELECT * FROM Biler;";
        List<Bil> bilList = db.query(sql, new BeanPropertyRowMapper(Bil.class));
        return bilList;
    }

    public void slettAlle(){
        String sql = "DELETE FROM Motorvogn;";
        db.update(sql);
    }

    public void slettEn(String personnr){
        String sql = "DELETE FROM Motorvogn WHERE personnr=?;";
        db.update(sql, personnr);
    }
}
