package com.itheima.ssm.domain;

/**
 * @ClassName Account
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/7/25 14:55
 * @Version V1.0
 */
public class Account {

    private Integer id;
    private String name;
    private Double money;

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
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
