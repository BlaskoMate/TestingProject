package util;

public enum PageUrlCollection {
    INDEX("https://www.google.com/");

    private final String url;

    PageUrlCollection(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
