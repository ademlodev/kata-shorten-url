package com.ademlo.kata_shorten_url.ports.output;

import java.util.Date;

public record ShortUrl(String slug, String destinationUrl, Date createdAt) {
}
