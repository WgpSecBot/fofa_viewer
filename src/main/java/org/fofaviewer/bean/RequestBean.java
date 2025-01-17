package org.fofaviewer.bean;

import org.fofaviewer.request.RequestStatus;

import java.util.HashMap;

public class RequestBean {
    private String requestUrl;
    private String tabTitle;
    private String size;
    private RequestStatus requestStatus = RequestStatus.READY;
    private HashMap<String, String> result;

    public RequestBean(String requestUrl, String tabTitle, String size) {
        this.requestUrl = requestUrl;
        this.tabTitle = tabTitle;
        this.size = size;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public String getTabTitle() {
        return tabTitle;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public void setResult(HashMap<String, String> result) {
        this.result = result;
    }

    public HashMap<String, String> getResult() {
        return result;
    }

    public String getSize() {
        return size;
    }
}
