package com.cw.stu.his.common.dao.domain.bms;

import java.io.Serializable;

public class BmsTestPojo implements Serializable {
    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private static final long serialVersionUID = 1L;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3 == null ? null : name3.trim();
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4 == null ? null : name4.trim();
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5 == null ? null : name5.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BmsTestPojo other = (BmsTestPojo) that;
        return (this.getName1() == null ? other.getName1() == null : this.getName1().equals(other.getName1()))
            && (this.getName2() == null ? other.getName2() == null : this.getName2().equals(other.getName2()))
            && (this.getName3() == null ? other.getName3() == null : this.getName3().equals(other.getName3()))
            && (this.getName4() == null ? other.getName4() == null : this.getName4().equals(other.getName4()))
            && (this.getName5() == null ? other.getName5() == null : this.getName5().equals(other.getName5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName1() == null) ? 0 : getName1().hashCode());
        result = prime * result + ((getName2() == null) ? 0 : getName2().hashCode());
        result = prime * result + ((getName3() == null) ? 0 : getName3().hashCode());
        result = prime * result + ((getName4() == null) ? 0 : getName4().hashCode());
        result = prime * result + ((getName5() == null) ? 0 : getName5().hashCode());
        return result;
    }
}