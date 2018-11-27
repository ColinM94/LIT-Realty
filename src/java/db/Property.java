package db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p"),
    @NamedQuery(name = "Property.findyById", query = "SELECT p FROM Property p WHERE p.id = :id")
})
public class Property implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Basic(optional = false)
    @Column(name = "street")
    private String street;
    
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    
    @Basic(optional = false)
    @Column(name = "listingNum")
    private int listingNum;
    
    @Basic(optional = false)
    @Column(name = "styleId")
    private int styleId;
    
    @Basic(optional = false)
    @Column(name = "typeId")
    private int typeId;
    
    @Basic(optional = false)
    @Column(name = "bedrooms")
    private int bedrooms;
    
    @Basic(optional = false)
    @Column(name = "bathrooms")
    private float bathrooms;
    
    @Basic(optional = false)
    @Column(name = "squarefeet")
    private int squareFeet;
    
    @Basic(optional = false)
    @Column(name = "berRating")
    private String berRating;
    
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    
    @Basic(optional = false)
    @Column(name = "lotsize")
    private String lotSize;
    
    @Basic(optional = false)
    @Column(name = "garagesize")
    private int garageSize;
    
    @Basic(optional = false)
    @Column(name = "garageId")
    private int garageId;
    
    @Basic(optional = false)
    @Column(name = "agentId")
    private int agentId;
        
    @Basic(optional = false)
    @Column(name = "photo")
    private String photo;
    
    @Basic(optional = false)
    @Column(name = "price")
    private float price;
    
    @Basic(optional = false)
    @Column(name = "dateAdded")
    private String dateAdded;
    
    public Property()
    {

    }
    
    public Property(int id)
    {
        this.id = id;
    }
    
    public Property(int id, String street, String city, int listingNum, int styleId, int typeId, int bedrooms, int bathrooms, int squareFeet, String berRating, String description, String lotSize, int garageSize, int garageId, int agentId, String photo, float price, String dateAdded)
    {
        this.id = id;
        this.street = street;
        this.city = city;
        this.listingNum = listingNum;
        this.styleId = styleId;
        this.typeId = typeId;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.squareFeet = squareFeet;
        this.berRating = berRating;
        this.description = description;
        this.lotSize = lotSize;
        this.garageSize = garageSize;
        this.garageId = garageId;
        this.agentId = agentId;
        this.photo = photo;
        this.price = price;
        this.dateAdded = dateAdded;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public void setStreet(String street)
    {
        this.street = street;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public int getListingNum()
    {
        return listingNum;
    }
    
    public void setListingNum(int listingNum)
    {
        this.listingNum = listingNum;
    }
    
    public int getStyleId()
    {
        return styleId;
    }
    
    public void setStyleId(int styleId)
    {
        this.styleId = styleId;
    }
    
    public int getTypeId()
    {
        return typeId;
    }
    
    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }
    
    public int getBedrooms()
    {
        return bedrooms;
    }
    
    public void setBedrooms(int bedrooms)
    {
        this.bedrooms = bedrooms;
    }
    
    public float getBathrooms()
    {
        return bathrooms;
    }
    
    public void setBathrooms(float bathrooms)
    {
        this.bathrooms = bathrooms;
    }
    
    public int getSquareFeet()
    {
        return squareFeet;
    }
    
    public void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }
    
    public String getBerRating()
    {
        return berRating;
    }
    
    public void setBerRating(String berRating)
    {
        this.berRating = berRating;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getLotSize()
    {
        return lotSize;
    }
    
    public void setLotSize(String lotSize)
    {
        this.lotSize = lotSize;
    }
    
    public int getGarageSize()
    {
        return garageSize;
    }
    
    public void setGarageSize(int garageSize)
    {
        this.garageSize = garageSize;
    }
    
    public int getGarageId()
    {
        return garageId;
    }
    
    public void setGarageId(int garageId)
    {
        this.garageId = garageId;
    }
    
    public int getAgentId()
    {
        return agentId;
    }
    
    public void setAgentId(int agentId)
    {
        this.agentId = agentId;
    }
    
    public String getPhoto()
    {
        return photo;
    }
    
    public void setPhoto(String photo)
    {
        this.photo = photo;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public void setPrice(float price)
    {
        this.price = price;
    }
    
    public void setDateAdded(String dateAdded)
    {
        this.dateAdded = dateAdded;
    }
    
    public String getDateAdded()
    {
        return dateAdded;
    }
}
