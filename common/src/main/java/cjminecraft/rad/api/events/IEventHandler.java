package cjminecraft.rad.api.events;

public interface IEventHandler<T> {
    void handle(T event);
}