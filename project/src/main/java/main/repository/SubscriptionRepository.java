package main.repository;

import main.model.Action;
import main.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscriber, Integer>
{
    Subscriber saveSubscriber(long msisdin, Action action, long timestamp);

    List<Subscriber> findAll();
}