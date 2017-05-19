package com.lzz;

import org.apache.log4j.Logger;

/**
 * Created by lzz on 17/5/18.
 */
public class Log4jKafka {
    private static Logger logger = Logger.getLogger(Log4jKafka.class);
    public static void main(String[] args){
        logger.info("hello world");
    }
}
