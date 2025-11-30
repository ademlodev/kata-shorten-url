package com.ademlo.kata_shorten_url.ports.output;

public interface ClickStatisticsProvider {
    int getClickCount(String slug);

    int getUniqueVisitorCount(String slug);
}
