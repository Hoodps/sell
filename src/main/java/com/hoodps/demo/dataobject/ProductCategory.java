package com.hoodps.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity  //数据库映射成对象
@DynamicUpdate //自动添加更新时间
@Data // 去掉get set 方法
public class ProductCategory {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
