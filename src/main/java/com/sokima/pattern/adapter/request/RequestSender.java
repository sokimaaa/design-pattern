package com.sokima.pattern.adapter.request;

import com.sokima.pattern.adapter.type.Type;

/**
 * Interface for sending a request to different places.
 *
 * @author Roman Denysov
 */
public interface RequestSender {
    void send(Type message);
}
