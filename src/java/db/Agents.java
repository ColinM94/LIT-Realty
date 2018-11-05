package db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "agents")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Agents.findAgent", query = "SELECT a FROM Agents a WHERE a.username = :username AND a.password = :password")})

public class Agents implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name="agentId")
    private String agentId;
    
    @Id
    @Basic(optional = false)
    @Column(name="name")
    private String name;
    
    @Id
    @Basic(optional = false)
    @Column(name="phone")
    private String phone;
    
    @Id
    @Basic(optional = false)
    @Column(name="fax")
    private String fax;
    
    @Id
    @Basic(optional = false)
    @Column(name="email")
    private String email;
    
    @Id
    @Basic(optional = false)
    @Column(name="username")
    private String username;
    
    @Id
    @Basic(optional = false)
    @Column(name="password")
    private String password;
    
    
    // Constructor & Destructor.
    public Agents()
    {
        
    }
    public Agents(String AgentId)
    {
        agentId = AgentId;
    }

    
    // Getters & Setters.
    public String getAgentId()
    {
        return agentId;
    }
    
    public void setAgentId(String AgentId)
    {
        agentId = AgentId;
    }
    
    public String getName()
    {
        return name; 
    }
    
    public void setName(String Name)
    {
        name = Name;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String Phone)
    {
        phone = Phone;
    }
            
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String Email)
    {
        email = Email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String Username)
    {
        username = Username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    
}
