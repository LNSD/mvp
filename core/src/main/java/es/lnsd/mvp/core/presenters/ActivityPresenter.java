package es.lnsd.mvp.core.presenters;

import android.content.Intent;
import android.os.Bundle;

import es.lnsd.mvp.core.views.BaseView;


/**
 * MVP
 * Copyright (C) 2016 Lorenzo Delgado.
 * http://LNSD.es
 * <p/>
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
public class ActivityPresenter implements ActivityBasePresenter<ActivityPresenter.View> {

    @Override
    public void registerView(ActivityPresenter.View view) { }

    //region Activity lifecycle
    @Override
    public void onCreate(Bundle savedInstanceState) { }

    @Override
    public void onStart() { }

    @Override
    public void onRestart() { }

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
    public void onSaveInstanceState(Bundle savedInstanceState) { }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) { }

    public interface View extends BaseView { }
}
