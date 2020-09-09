package cn.azh.bean;


public class ZhongYao {
    private Integer id;

    private String name;

    private String shouzimu;

    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShouzimu() {
        return shouzimu;
    }

    public void setShouzimu(String shouzimu) {
        this.shouzimu = shouzimu == null ? null : shouzimu.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}