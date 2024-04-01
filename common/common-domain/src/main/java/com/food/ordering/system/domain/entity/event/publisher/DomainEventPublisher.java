package com.food.ordering.system.domain.entity.event.publisher;

import com.food.ordering.system.domain.entity.event.DomainEvent;

public interface DomainEventPublisher <T extends DomainEvent>{
    void publish(T domainEvent);
}
