package main.repository;

import main.model.Action;
import main.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Publisher, Integer>
{
    Publisher savePublisher(long msisdin, Action action, long timestamp);

    List<Publisher> findAll();
}