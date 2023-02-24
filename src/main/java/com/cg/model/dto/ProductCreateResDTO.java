package com.cg.model.dto;

import com.cg.model.ProductAvatar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductCreateResDTO {

    private Long id;
    private String title;
    private BigDecimal price;
    private String description;

    private ProductAvatarDTO avatar;

    public ProductCreateResDTO(Long id, String title, BigDecimal price, String description, ProductAvatar productAvatar) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.avatar = productAvatar.toProductAvatarDTO();
    }
}
