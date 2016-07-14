package devferrarizero.whattodotasklist.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import devferrarizero.whattodotasklist.fragment.CurrentTaskFragment;
import devferrarizero.whattodotasklist.fragment.DoneTaskFragment;

public class TabAdapter extends FragmentPagerAdapter {

    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
