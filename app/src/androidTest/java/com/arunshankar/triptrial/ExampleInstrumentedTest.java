package com.arunshankar.triptrial;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            FromActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.arunshankar.triptrial", appContext.getPackageName());
    }

    @Test
    public void emptySearchString(){

        onView(withId(R.id.editText)).perform(typeText(""));

        onView(withId(R.id.submit)).perform(click());

        onView(withId(R.id.my_recycler_view)).check(new RecyclerViewItemCountAssertion(1));
    }

    @Test
    public void locationSearchString(){

        onView(withId(R.id.editText)).perform(typeText("strat"));

        onView(withId(R.id.submit)).perform(click());

        onView(withId(R.id.my_recycler_view)).check(new RecyclerViewItemCountAssertion(1));
    }
}
