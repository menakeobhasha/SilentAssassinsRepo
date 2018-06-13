/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsc.assassins.smsapp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Menake
 */
@Entity
@XmlRootElement
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String Name;
    
    private String Address;
    
    private String UeserName;
    
    private String Password;
    
    private String CreatedUser;
    
    private String CreatedDateTime;
    
    private String ModifiedUser;
    
    private String ModifiedDateTime;

    /**
     * Get the value of ModifiedDateTime
     *
     * @return the value of ModifiedDateTime
     */
    public String getModifiedDateTime() {
        return ModifiedDateTime;
    }

    /**
     * Set the value of ModifiedDateTime
     *
     * @param ModifiedDateTime new value of ModifiedDateTime
     */
    public void setModifiedDateTime(String ModifiedDateTime) {
        this.ModifiedDateTime = ModifiedDateTime;
    }


    /**
     * Get the value of ModifiedUser
     *
     * @return the value of ModifiedUser
     */
    public String getModifiedUser() {
        return ModifiedUser;
    }

    /**
     * Set the value of ModifiedUser
     *
     * @param ModifiedUser new value of ModifiedUser
     */
    public void setModifiedUser(String ModifiedUser) {
        this.ModifiedUser = ModifiedUser;
    }


    /**
     * Get the value of CreatedDateTime
     *
     * @return the value of CreatedDateTime
     */
    public String getCreatedDateTime() {
        return CreatedDateTime;
    }

    /**
     * Set the value of CreatedDateTime
     *
     * @param CreatedDateTime new value of CreatedDateTime
     */
    public void setCreatedDateTime(String CreatedDateTime) {
        this.CreatedDateTime = CreatedDateTime;
    }


    /**
     * Get the value of CreatedUser
     *
     * @return the value of CreatedUser
     */
    public String getCreatedUser() {
        return CreatedUser;
    }

    /**
     * Set the value of CreatedUser
     *
     * @param CreatedUser new value of CreatedUser
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }


    /**
     * Get the value of Password
     *
     * @return the value of Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Set the value of Password
     *
     * @param Password new value of Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }


    /**
     * Get the value of UeserName
     *
     * @return the value of UeserName
     */
    public String getUeserName() {
        return UeserName;
    }

    /**
     * Set the value of UeserName
     *
     * @param UeserName new value of UeserName
     */
    public void setUeserName(String UeserName) {
        this.UeserName = UeserName;
    }


    /**
     * Get the value of Address
     *
     * @return the value of Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Set the value of Address
     *
     * @param Address new value of Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }


    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bsc.assassins.smsapp.Customer[ id=" + id + " ]";
    }
    
}
