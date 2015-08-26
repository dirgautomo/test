package me.com.testme;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

/**
 * Created by dirga on 10/23/14.
 */
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

    public Intent mLaunchIntent;

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mLaunchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(mLaunchIntent, null, null);

    }
}
