package com.lys.mybatis.model;

import java.util.Date;
import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SNO")
    private String sno;

    @Column(name = "SNAME")
    private String sname;

    @Column(name = "SSEX")
    private String ssex;

    @Column(name = "SBIRTHDAY")
    private Date sbirthday;

    @Column(name = "CLASSNAME")
    private String classname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return SNO
     */
    public String getSno() {
        return sno;
    }

    /**
     * @param sno
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * @return SNAME
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return SSEX
     */
    public String getSsex() {
        return ssex;
    }

    /**
     * @param ssex
     */
    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    /**
     * @return SBIRTHDAY
     */
    public Date getSbirthday() {
        return sbirthday;
    }

    /**
     * @param sbirthday
     */
    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    /**
     * @return CLASSNAME
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }
}