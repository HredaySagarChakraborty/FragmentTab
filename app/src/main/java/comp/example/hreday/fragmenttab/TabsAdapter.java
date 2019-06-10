package comp.example.hreday.fragmenttab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TabsAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;
        public TabsAdapter(FragmentManager fm, int NoofTabs){
            super(fm);
            this.mNumOfTabs = NoofTabs;
        }
        @Override
        public int getCount() {
            return mNumOfTabs;
        }
        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0:
                    Tutorial home = new Tutorial();
                    return home;
                case 1:
                    Quiz about = new Quiz();
                    return about;
                case 2:
                    Videos contact = new Videos();
                    return contact;
                default:
                    return null;
            }
        }
    }

