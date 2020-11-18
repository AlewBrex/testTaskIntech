package main.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum  Action
{
    PURCHASE,
    SUBSCRIPTION;

    private static final List<Action> a =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int s = a.size();
    private static final Random r = new Random();

    public static Action randomAction()
    {
        return a.get(r.nextInt(s));
    }
}