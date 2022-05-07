package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * OrderRepository
 *
 * @author Kevin Hagel
 * @since 7.05.22
 */
public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {

}
