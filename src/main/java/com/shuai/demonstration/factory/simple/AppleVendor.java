package com.shuai.demonstration.factory.simple;

import com.shuai.demonstration.dto.AppleCallBackMessage;
import org.springframework.stereotype.Service;

/**
 * @author Yangs
 */
@Service
@Strategy(type = 1)
public class AppleVendor extends AbstractVendor<AppleCallBackMessage> {

    @Override
    public void doPush() {

    }

    @Override
    public void doCallBack(AppleCallBackMessage message) {

    }
}
