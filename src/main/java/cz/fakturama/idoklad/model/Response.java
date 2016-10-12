package cz.fakturama.idoklad.model;

import java.util.Map;

/**
 * Created by tatramat911 on 12.10.16.
 */
public class Response {

    private Invoice[] Data;
    private Map<String, String> Links;
    private int TotalItems;
    private int TotalPages;

    public Invoice[] getData() {
        return Data;
    }

    public void setData(Invoice[] data) {
        Data = data;
    }

    public Map<String, String> getLinks() {
        return Links;
    }

    public void setLinks(Map<String, String> links) {
        Links = links;
    }

    public int getTotalItems() {
        return TotalItems;
    }

    public void setTotalItems(int totalItems) {
        TotalItems = totalItems;
    }

    public int getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(int totalPages) {
        TotalPages = totalPages;
    }
}
