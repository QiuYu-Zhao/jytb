package com.jytb.logistics.bean.area;

import com.chexiao.base.dao.annotation.Column;
import com.chexiao.base.dao.annotation.Id;
import com.chexiao.base.dao.annotation.NotDBColumn;
import com.chexiao.base.dao.annotation.Table;

import java.io.Serializable;

/**
 * 〈街道〉
 *
 * @author hyz
 * @create 2019/6/8
 */
@Table(name = "street")
public class Street implements Serializable{
    @NotDBColumn
    private static final long serialVersionUID = 61039051710287181L;

    @Id(insertable = true)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    /**
     * 所属省份id
     */
    @Column(name = "province_id")
    private long provinceId;

    /**
     * 所属城市id
     */
    @Column(name = "city_id")
    private long cityId;

    /**
     * 所属区id
     */
    @Column(name = "area_id")
    private long areaId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }
}