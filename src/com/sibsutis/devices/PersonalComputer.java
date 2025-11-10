package com.sibsutis.devices;


public class PersonalComputer extends Device {

    
    public PersonalComputer(int id, int price) {
        this(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PersonalComputer)) return false;
        PersonalComputer other = (PersonalComputer) obj;
        return getId() == other.getId()
                && getPrice() == other.getPrice()
                && ((getIp() == null && other.getIp() == null)
                    || (getIp() != null && getIp().equals(other.getIp())));
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(getId());
        result = 31 * result + Integer.hashCode(getPrice());
        result = 31 * result + (getIp() == null ? 0 : getIp().hashCode());
        return result;
    }
}