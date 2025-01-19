package org.wikipedia.utils;

import org.wikipedia.annotations.Retry;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int attemptCounter = 0;
    private int attempts;
    @Override
    public boolean retry(ITestResult testResult) {
        Retry retry = testResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Retry.class);
        if (retry != null) attempts = retry.attempts();
        if(attemptCounter < attempts){
            attemptCounter++;
            return true;
        }
        return false;
    }
}