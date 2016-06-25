package es.lnsd.mvp.core;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import es.lnsd.mvp.core.presenters.FragmentBasePresenter;
import es.lnsd.mvp.core.views.BaseView;


/**
 * CityKey
 * Copyright (C) 2016 Lorenzo Delgado.
 * http://LNSD.es
 * <p/>
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
public abstract class BaseFragment<T extends FragmentBasePresenter> extends Fragment implements BaseView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getPresenter().onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenter().onPause();
    }


    @Override
    public void onStop() {
        super.onStop();
        getPresenter().onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getPresenter().onSaveInstanceState(outState);
    }

    protected abstract T getPresenter();

    @Override
    public String getStringById(int id) {
        return getString(id);
    }
}