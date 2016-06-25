package es.lnsd.mvp.core.presenters;

import android.os.Bundle;

import es.lnsd.mvp.core.views.BaseView;

/**
 * MVP
 * Copyright (C) 2015 Lorenzo Delgado.
 * http://LNSD.es
 *
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
public interface FragmentBasePresenter<T extends BaseView> extends BasePresenter<T> {
    void onCreate(Bundle savedInstanceState);
    void onActivityCreated(Bundle savedInstanceState);
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();

    void onSaveInstanceState(Bundle outState);
}
