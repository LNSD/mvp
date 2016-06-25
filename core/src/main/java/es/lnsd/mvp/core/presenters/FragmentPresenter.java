package es.lnsd.mvp.core.presenters;

import android.os.Bundle;

import es.lnsd.mvp.core.views.BaseView;

/**
 * MVP
 * Copyright (C) 2016 Lorenzo Delgado.
 * http://LNSD.es
 * <p/>
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
public class FragmentPresenter implements FragmentBasePresenter<FragmentPresenter.View> {

    @Override
    public void registerView(FragmentPresenter.View view) { }

    //region Fragment lifecycle
    @Override
    public void onCreate(Bundle savedInstanceState) { }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) { }

    @Override
    public void onStart() { }

    @Override
    public void onResume() { }

    @Override
    public void onPause() { }

    @Override
    public void onStop() { }

    @Override
    public void onDestroy() { }
    //endregion

    @Override
    public void onSaveInstanceState(Bundle outState) { }

    public interface View extends BaseView { }
}
