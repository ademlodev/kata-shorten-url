package com.ademlo.kata_shorten_url.ports.output;

public interface ClickTracker {

    void register(String slug, String fingerprint);

}
