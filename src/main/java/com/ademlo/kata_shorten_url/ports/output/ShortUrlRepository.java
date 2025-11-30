package com.ademlo.kata_shorten_url.ports.output;

import io.vavr.control.Either;

import java.util.Enumeration;
import java.util.Optional;

public interface ShortUrlRepository {

    boolean exists(String slug);

    void save(ShortUrl shortUrl);

    Optional<ShortUrl> loadSlug(String slug);

    Enumeration<ShortUrl> list(int skip, int take);
}
