package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by eliza on 27-Mar-16.
 */
public class AsyncTaskTest extends AndroidTestCase {

    //Reference : https://discussions.udacity.com/t/writing-tests-for-async-task/25482/16
    public void testJoke() {
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(getContext());
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Timed out");
        }
    }
}
