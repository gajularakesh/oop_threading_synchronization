package com.scalar.multithreading.custumThreadPool;

import javax.swing.*;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
    Thread thread = new Thread(r);
    thread.setDaemon(false);
    thread.setPriority(Thread.MAX_PRIORITY);
        return thread;
    }
}
