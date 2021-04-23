package com.learn2do.enums;

public enum BetterCurrency {
    INDIANRUPEE("INR"),
    USDOLLAR("USD"),
    UKPOUND("GBP"),
    EURO("EUR");

    private String abbr;

    BetterCurrency(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return this.abbr;
    }

    public String toString() {
        return this.abbr;
    }
}
