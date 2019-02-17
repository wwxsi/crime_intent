package io.wwxsi.criminalintent.activity;

import android.support.v4.app.Fragment;

import io.wwxsi.criminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
