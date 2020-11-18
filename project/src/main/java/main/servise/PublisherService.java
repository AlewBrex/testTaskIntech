package main.servise;

import lombok.extern.log4j.Log4j2;
import main.model.Action;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PublisherService
{
    private final long msisdn = 555_000_000;

    public long getMsisdn()
    {
        return (long)(Math.random() * msisdn);
    }

    public Action getAction()
    {
        return Action.randomAction();
    }

    public long getTimestamp()
    {
        return System.currentTimeMillis();
    }


}