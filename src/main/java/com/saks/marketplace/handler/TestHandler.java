package com.saks.marketplace.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;

/**
 * Handler lambda test.
 */
public class TestHandler {
    private static final Logger logger =
            LoggerFactory.getLogger(TestHandler.class);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    /**
     *  handle Request.
     *
     * @param context The Lambda execution environment context object.
     */
    public InputStream handleRequest(InputStream inputStream, OutputStream output, Context context) {
        logger.debug("------------ handleRequest start ------------");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("US-ASCII")));
        final HashMap event = gson.fromJson(reader, HashMap.class);
        logger.error("event: {}", event);
        logger.debug("------------ handleRequest end ------------");
        return inputStream;
    }
}
