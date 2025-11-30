package com.ademlo.kata_shorten_url.ports.input;

import java.util.Date;

public record ShortUrlStatsDTO (String Slug, String DestinationUrl, Date CreatedAt, int ClickCount, int UniqueVisitorCount){}
