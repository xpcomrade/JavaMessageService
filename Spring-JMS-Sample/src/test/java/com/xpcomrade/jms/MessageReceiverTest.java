package com.xpcomrade.jms;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by xpcomrade on 2016/3/18.
 * Copyright (c) 2016, xpcomrade@gmail.com All Rights Reserved.
 * Description: TODO(这里用一句话描述这个类的作用). <br/>
 */
public class MessageReceiverTest extends BaseJUnitTest {

    @Autowired
    MessageReceiver jmsReceiver;


    @Test
    public void receive(){
        jmsReceiver.receive();
    }

}
