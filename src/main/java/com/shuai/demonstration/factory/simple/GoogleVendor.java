package com.shuai.demonstration.factory.simple;

import com.shuai.demonstration.dto.GoogleCallBackMessage;
import org.springframework.stereotype.Service;

/**
 * @author Yangs
 */
@Service
@Strategy(type = 2)
public class GoogleVendor extends AbstractVendor<GoogleCallBackMessage> {

    @Override
    public void doPush() {

    }

    @Override
    public void doCallBack(GoogleCallBackMessage message) {

    }
}
