package test.thread.parallelization.sample;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test.thread.parallelization.TestNgRunStateTracker;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.CLASS_INSTANCE;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.CLASS_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.DATA_PROVIDER_PARAM;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.GROUPS_BELONGING_TO;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.GROUPS_DEPENDED_ON;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.METHODS_DEPENDED_ON;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.METHOD_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.SUITE_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.TEST_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.TestNgRunEvent.TEST_METHOD_EXECUTION;

public class TestClassAFiveMethodsWithFactoryUsingDataProviderAndNoDepsSample {

    private final String suiteName;
    private final String testName;
    private final int sleepFor;
    private final String dpVal;

    @Factory(dataProvider = "data-provider")
    public TestClassAFiveMethodsWithFactoryUsingDataProviderAndNoDepsSample(String suiteName, String testName, String
            sleepFor, String dpVal) {

        this.suiteName = suiteName;
        this.testName = testName;
        this.sleepFor = Integer.parseInt(sleepFor);
        this.dpVal = dpVal;
    }

    @Test
    public void testMethodA() throws
            InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodA")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .addData(DATA_PROVIDER_PARAM, dpVal)
                        .addData(GROUPS_DEPENDED_ON, new String[0])
                        .addData(METHODS_DEPENDED_ON, new String[0])
                        .addData(GROUPS_BELONGING_TO, new String[0])
                        .build()
        );

        TimeUnit.MILLISECONDS.sleep(sleepFor);
    }

    @Test
    public void testMethodB() throws
            InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodB")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .addData(DATA_PROVIDER_PARAM, dpVal)
                        .addData(GROUPS_DEPENDED_ON, new String[0])
                        .addData(METHODS_DEPENDED_ON, new String[0])
                        .addData(GROUPS_BELONGING_TO, new String[0])
                        .build()
        );

        TimeUnit.MILLISECONDS.sleep(sleepFor);
    }

    @Test
    public void testMethodC() throws
            InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodC")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .addData(DATA_PROVIDER_PARAM, dpVal)
                        .addData(GROUPS_DEPENDED_ON, new String[0])
                        .addData(METHODS_DEPENDED_ON, new String[0])
                        .addData(GROUPS_BELONGING_TO, new String[0])
                        .build()
        );

        TimeUnit.MILLISECONDS.sleep(sleepFor);
    }

    @Test
    public void testMethodD() throws
            InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodD")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .addData(DATA_PROVIDER_PARAM, dpVal)
                        .addData(GROUPS_DEPENDED_ON, new String[0])
                        .addData(METHODS_DEPENDED_ON, new String[0])
                        .addData(GROUPS_BELONGING_TO, new String[0])
                        .build()
        );

        TimeUnit.MILLISECONDS.sleep(sleepFor);
    }

    @Test
    public void testMethodE() throws
            InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodE")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .addData(DATA_PROVIDER_PARAM, dpVal)
                        .addData(GROUPS_DEPENDED_ON, new String[0])
                        .addData(METHODS_DEPENDED_ON, new String[0])
                        .addData(GROUPS_BELONGING_TO, new String[0])
                        .build()
        );

        TimeUnit.MILLISECONDS.sleep(sleepFor);
    }

    @DataProvider(name = "data-provider")
    public static Object[][] dataProvider(ITestContext context) {
        Map<String,String> params = context.getCurrentXmlTest().getAllParameters();

        String suiteName = params.get("suiteName");
        String testName = params.get("testName");
        String sleepFor = params.get("sleepFor");

        String dataProviderParam = params.get("dataProviderParam");

        String[] dataProviderVals = null;
        String classNamePattern = TestClassAFiveMethodsWithFactoryUsingDataProviderAndNoDepsSample.class.getSimpleName() + "(";

        if(dataProviderParam.contains(classNamePattern)) {
            dataProviderParam = dataProviderParam.substring(dataProviderParam.indexOf(classNamePattern) +
                    classNamePattern.length());
            dataProviderParam = dataProviderParam.substring(0, dataProviderParam.indexOf(")"));

        }

        dataProviderVals = dataProviderParam.split(",");

        Object[][] dataToProvide = new Object[dataProviderVals.length][4];

        for(int i = 0; i < dataProviderVals.length; i ++)  {
            dataToProvide[i][0] = suiteName;
            dataToProvide[i][1] = testName;
            dataToProvide[i][2] = sleepFor;
            dataToProvide[i][3] = dataProviderVals[i];
        }

        return dataToProvide;
    }
}
