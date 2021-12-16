package com.example.f21comp1011gcfinala;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    private String totalResults;

    @SerializedName("Response")
    private String response;

    @SerializedName("Search")
    private Dealership[] search;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Dealership[] getSearch() {
        return search;
    }

    public void setSearch(Dealership[] search) {
        this.search = search;
    }
}
