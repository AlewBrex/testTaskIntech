package main.controllers;

import lombok.extern.log4j.Log4j2;
import main.servise.PublisherService;
import main.servise.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("api")
public class ApiGeneralController
{
    private final SubscriberService subscriberService;

    @Autowired
    public ApiGeneralController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping
    public void getMessage(PublisherService publisherService)
    {
        subscriberService.parsingAndSavingMessage(publisherService);
        log.info("send message to Subscriber");
    }
}