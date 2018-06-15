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

/**
 *
 * @author Menake
 */
@Entity
public class Advicer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String Name;
    
    private String Address;
    
    private String MobileNo;
    
    private String Description;
    
    private String Type;
    
    private String JoinedDate;
    
    private String UserName;

    private String Password;

    private String CreatedUser;
    
    private String CreatedDateTime;
    
    private String ModifiedUser;
    
    private String ModifiedDateTime;

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
     * Get the value of UserName
     *
     * @return the value of UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Set the value of UserName
     *
     * @param UserName new value of UserName
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
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
     * Get the value of JoinedDate
     *
     * @return the value of JoinedDate
     */
    public String getJoinedDate() {
        return JoinedDate;
    }

    /**
     * Set the value of JoinedDate
     *
     * @param JoinedDate new value of JoinedDate
     */
    public void setJoinedDate(String JoinedDate) {
        this.JoinedDate = JoinedDate;
    }


    /**
     * Get the value of Type
     *
     * @return the value of Type
     */
    public String getType() {
        return Type;
    }

    /**
     * Set the value of Type
     *
     * @param Type new value of Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }


    /**
     * Get the value of Description
     *
     * @return the value of Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Set the value of Description
     *
     * @param Description new value of Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }


    /**
     * Get the value of MobileNo
     *
     * @return the value of MobileNo
     */
    public String getMobileNo() {
        return MobileNo;
    }

    /**
     * Set the value of MobileNo
     *
     * @param MobileNo new value of MobileNo
     */
    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
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
        if (!(object instanceof Advicer)) {
            return false;
        }
        Advicer other = (Advicer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bsc.assassins.smsapp.Advicer[ id=" + id + " ]";
    }
    
}
