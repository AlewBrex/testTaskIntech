package main.servise;

import lombok.extern.log4j.Log4j2;
import main.model.Action;
import main.repository.PurchaseRepository;
import main.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class SubscriberService
{
    private final PurchaseRepository purchaseRepository;
    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriberService(PurchaseRepository purchaseRepository,
                             SubscriptionRepository subscriptionRepository)
    {
        this.purchaseRepository = purchaseRepository;
        this.subscriptionRepository = subscriptionRepository;
    }

    public void parsingAndSavingMessage(PublisherService publisherService)
    {
        long msisdn = publisherService.getMsisdn();
        Action action = publisherService.getAction();
        long timestamp = publisherService.getTimestamp();

        if (action.equals(Action.PURCHASE))
        {
            purchaseRepository.savePublisher(msisdn, action, timestamp);
            log.info("saved to purchaseRepository ");
        }
        else
        {
            subscriptionRepository.saveSubscriber(msisdn, action, timestamp);
            log.info("saved to subscriptionRepository");
        }
    }
}