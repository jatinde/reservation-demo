package com.cloudnative.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReservationChannels {

    @Input
    SubscribableChannel input();
}
