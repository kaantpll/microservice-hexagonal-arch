package com.food.ordering.system.order.service.domain.ports.output.message.publisher.restaurant;

import com.food.ordering.system.domain.entity.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
