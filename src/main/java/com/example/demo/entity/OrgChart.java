package com.example.demo.entity;

/**
 * @date 2023/2/2
 * @apiNote
 */
public class OrgChart {
    private Integer id;
    private Integer pid;
    private String name;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "OrgChart{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
