package com.example.three;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLReader {
    CompanyData companyData = new CompanyData(null, null, null);

    @SneakyThrows
    public CompanyData parse(String url) {
        Document doc = Jsoup.connect(url).get();
        getTitle(doc);
        getDescription(doc);
        getLogoUrl(url, doc);

        return companyData;
    }

    private void getTitle(Document doc) {
        companyData.domain = doc.title();
    }

    private void getDescription(Document doc) {
        Elements description = doc.select("meta[name=description]");
        companyData.description = description.toString();
    }

    private void getLogoUrl(String baseUrl, Document doc) {
        Elements logoElement = doc.select("link[rel$=icon]");
        String logoUrl = logoElement.attr("href");

        if (logoUrl.startsWith("/")) {
            logoUrl = baseUrl + logoUrl;
        }

        companyData.logo = logoUrl;
    }
}
