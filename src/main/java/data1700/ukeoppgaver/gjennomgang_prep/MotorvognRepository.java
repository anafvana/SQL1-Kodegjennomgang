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

    public void lagreKunde(Motorvogn motorvogn){
        //Since we are now storing only the type, we are not sending in the merke
        //You don't need to do it like this; instead, you can store both merke and type. This is just a demonstration
        String sql = "INSERT INTO Motorvogn(personnr, navn, adresse, kjennetegn, type) VALUES (?, ?, ?, ?, ?);";
        db.update(sql, motorvogn.getPersonnr(), motorvogn.getNavn(), motorvogn.getAdresse(), motorvogn.getKjennetegn(), motorvogn.getType());
    }

    public List<Motorvogn> hentAlle(){
        //Since not all data is available in Motorvogn, we need to join the tables and get the missing data from Biler
        String sql = "SELECT m.id, m.personnr, m.navn, m.adresse, m.kjennetegn, b.merke, b.type " +
                "FROM Motorvogn as m INNER JOIN Biler as b " +
                "ON m.type = b.type";
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

    public void slettEn(int id){
        String sql = "DELETE FROM Motorvogn WHERE id=?;";
        db.update(sql, id);
    }
}
