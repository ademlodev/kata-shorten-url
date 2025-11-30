package com.ademlo.kata_shorten_url.ports.input;

import java.util.Date;

public record ShortUrlDTO (String Slug, String DestinationUrl, Date CreatedAt, String FullUrl){}
