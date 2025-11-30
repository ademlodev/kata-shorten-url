package com.ademlo.kata_shorten_url.ports.input;

import io.vavr.collection.Stream;
import io.vavr.control.Either;

import java.util.List;

public interface ShortManager {

    /**
     * Create a shorthen url
     * @param destinationUrl url to be shorted
     * @return a string as a shorten url
     */
    String create(String destinationUrl);

    /**
     * Create a shorthen url
     * @param destinationUrl url to be shorted
     * @param customSlug special identification of url
     * @return a string as a shorten url
     */
    String create(String destinationUrl, String customSlug);

    Either<String, ShortUrlStatsDTO> getStats(String slug);

    Either<Stream.Empty<ShortUrlDTO>, List<ShortUrlDTO>> list(int sktip, int take);

}
