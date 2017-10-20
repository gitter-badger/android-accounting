package com.mphj.accountry.presenters;

import com.mphj.accountry.adapter.SectionsPagerAdapter;
import com.mphj.accountry.interfaces.DashboardView;
import com.mphj.accountry.utils.ArrayUtils;

/**
 * Created by mphj on 10/20/2017.
 */

public class DashboardPresenterImpl implements DashboardPresenter {

    DashboardView view;
    private static final int[] UNFABBED_PAGES = {SectionsPagerAdapter.REPORTS};
    int currentPosition;

    public DashboardPresenterImpl(DashboardView view){
        this.view = view;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onPageChanged(int position) {
        currentPosition = position;
        if(ArrayUtils.contains(UNFABBED_PAGES, position)){
            view.hideFab();
        } else {
            view.showFab();
        }
    }

    @Override
    public void onFabClick() {
        switch (currentPosition){
            case SectionsPagerAdapter.STORAGE:
                view.showNewStorageActivity();
                break;
            default:
                throw new RuntimeException(
                        new StringBuilder().append("Nothing implemnted for position ").append(currentPosition).toString()
                );
        }
    }
}