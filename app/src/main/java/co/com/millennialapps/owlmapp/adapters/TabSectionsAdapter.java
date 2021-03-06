package co.com.millennialapps.owlmapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import co.com.millennialapps.owlmapp.fragments.BuildingsFragment;
import co.com.millennialapps.owlmapp.fragments.EventsFragment;
import co.com.millennialapps.owlmapp.fragments.MapFragment;

public class TabSectionsAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Mapa", "Edificios", "Eventos"};

    public TabSectionsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MapFragment();
            case 1:
                return new BuildingsFragment();
            case 2:
                return new EventsFragment();
            default:
                return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}