package com.food.ordering.system.order.service.dataaccess.restaurant.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(RestaurantEntityId.class)
@Table(name = "order_restaurant_m_view",schema = "restaurant")
@Entity
public class RestaurantEntity {
    @Id
    private UUID restaurantId;
    @Id
    private UUID productId;

    private String restaurantName;
    private Boolean restaurantActive;
    private String productName;
    private BigDecimal productPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantEntity that)) return false;
        return Objects.equals(restaurantId, that.restaurantId) && Objects.equals(productId, that.productId) && Objects.equals(restaurantName, that.restaurantName) && Objects.equals(restaurantActive, that.restaurantActive) && Objects.equals(productName, that.productName) && Objects.equals(productPrice, that.productPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantId, productId, restaurantName, restaurantActive, productName, productPrice);
    }
}
