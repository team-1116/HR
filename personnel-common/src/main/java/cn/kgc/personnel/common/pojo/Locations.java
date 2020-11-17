package cn.kgc.personnel.common.pojo;

/**
 * Created by 86188 on 2020/11/17.
 * 办公地点表
 */
public class Locations {
    private Integer locationId;//主键
    private String streetAddress;//街道地址
    private String postalCode;//邮政编码
    private String city;//所在城市
    private String stateProvince;//所在省
    private String countryId;//所在国家的id，国家表的country_id列的外键

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}
