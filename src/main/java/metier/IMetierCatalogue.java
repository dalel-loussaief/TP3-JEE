package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public interface IMetierCatalogue {
public List<Produit> getProduitsParMotCle(String mc);
public void addProduit(Produit p);
}
