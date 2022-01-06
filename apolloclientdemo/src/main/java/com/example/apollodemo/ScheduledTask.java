package com.example.apollodemo;

import com.example.apollodemo.config.TestApolloAnnotationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTask {
    @Autowired
    TestApolloAnnotationBean TestApolloAnnotationBean;

    /**
     * 首次执行延迟5秒，之后每一秒执行一次
     */
    @Scheduled(fixedDelay = 2000, initialDelay = 5000)
    public void delayedTask() {
        System.out.println("delayed Task running:"+ TestApolloAnnotationBean.getBatch()+"++"+TestApolloAnnotationBean.getMonitor());
    }
}
