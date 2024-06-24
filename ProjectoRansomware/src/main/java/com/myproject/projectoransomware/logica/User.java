
package com.myproject.projectoransomware.logica;

public class User {
    
    private String id;
    private String userName;
    private String userType;
    private String ipUserVictim;
    private String organization;

    public User() {
    }

    public User(String id, String userName, String userType, String ipUserVictim, String organization) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.ipUserVictim = ipUserVictim;
        this.organization = organization;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIpUserVictim() {
        return ipUserVictim;
    }

    public void setIpUserVictim(String ipUserVictim) {
        this.ipUserVictim = ipUserVictim;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    
    
    
    
    
}
