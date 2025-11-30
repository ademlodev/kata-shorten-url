package com.ademlo.kata_shorten_url.ports.input;

import io.vavr.control.Either;

public interface ShortResolver {

    Either<NotGeneratedUrlException, String> resolve(String slug, String ipAddress, String userAgent);
}
