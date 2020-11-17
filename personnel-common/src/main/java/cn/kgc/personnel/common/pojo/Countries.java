package cn.kgc.personnel.common.pojo;

/**
 * @program: personnel
 * @ClassName Countries
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-17 18:24
 * @Version 1.0
 **/
/*
    国家表
 */
public class Countries {
    /*
        国家表主键
     */
    private Integer country_id;
    /*
        国家名称
     */
    private String countryName;
    /*
            区域id
     */
    private Integer regionId;

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}
