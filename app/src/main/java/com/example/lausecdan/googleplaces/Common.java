package com.example.lausecdan.googleplaces;

import com.example.lausecdan.googleplaces.Remote.IGoogleAPIService;
import com.example.lausecdan.googleplaces.Remote.RetrofitClient;

public class Common {
    private static final String GOOGLE_API_URL="https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
