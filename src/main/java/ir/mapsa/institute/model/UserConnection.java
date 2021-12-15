package ir.mapsa.institute.model;

import ir.mapsa.institute.model.enums.ConnectionType;
import ir.mapsa.institute.model.enums.Relativity;

import javax.persistence.*;

@Entity
@Table(name = "user_connections")
public class UserConnection extends  BaseEntity<Long>{

    public UserConnection() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    ConnectionType connectionType;
    private Relativity relativity;
    private String connectionValue;

    public UserConnection(ConnectionType connectionType, Relativity relativity, String connectionValue) {
        this.connectionType = connectionType;
        this.relativity = relativity;
        this.connectionValue = connectionValue;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public void setRelativity(Relativity relativity) {
        this.relativity = relativity;
    }


    public void setConnectionValue(String connectionValue) {
        this.connectionValue = connectionValue;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public Relativity getRelativity() {
        return relativity;
    }

    public String getConnectionValue() {
        return connectionValue;
    }
}
