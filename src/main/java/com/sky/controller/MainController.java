package com.sky.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {
    private static Logger logger = LogManager.getLogger(MainController.class);
    @RequestMapping(value = "getDetailUserInfo", method = RequestMethod.POST, produces = "application/xml")
    public String getDetailUserInfo(@RequestParam(value = "taskid") String taskid,
                                    @RequestParam(value = "telesales_agent") String telesales_agent, HttpServletRequest req) {
        String response = new String();
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        try {
        } catch (Exception e) {
//			response.setResult("169999");
//			response.setResult_msg(String.format("exception when getUserDetail[%s] ", e.toString()));
        } finally {
            end = System.currentTimeMillis();
            logger.info("==== requestUrl:[{}] &&& requestBody[{}] &&& response:[{}] &&& timeCoust[{}]",
                    req.getRequestURL(), taskid, response, String.valueOf(end - begin));
        }

        return response;

    }

}
