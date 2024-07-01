package com.cache.redis.app.spring.domain;

/**
 * Command interface to represent the user cases. To improve this strategy we can do:
 * 1- adding Request and Response object to every UserCases. For example in an instance of CreateOrderUserCase: UserCase<CreateOrderRequest, CreateOrderResponse>
 * 2- Implement Mediator pattern to separate infrastructure layer from application layer.
 * @param <Request>
 * @param <Response>
 */
public interface UserCase<Request, Response> {

  Response handle(Request request);
}
