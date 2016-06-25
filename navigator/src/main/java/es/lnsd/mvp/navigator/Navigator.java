package es.lnsd.mvp.navigator;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.support.v4.app.Fragment;

/**
 * MVP
 * Copyright (C) 2016 Lorenzo Delgado.
 * http://LNSD.es
 *
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */
public class Navigator {

    private Application app;
    private Activity activity;
    private Fragment fragment;

    public Navigator(Application app, Activity activity) {
        this.app = app;
        this.activity = activity;
    }

    public Navigator(Application app, Activity activity, Fragment fragment) {
        this.app = app;
        this.activity = activity;
        this.fragment = fragment;
    }

    //region Getters
    public Application getApplication() {
        return app;
    }

    public Activity getActivity() {
        return activity;
    }
    //endregion

    public void startService(Class service) {
        Intent intent = new Intent(app, service);
        app.startService(intent);
    }

    public void bindService(Class service, ServiceConnection connection, int flags) {
        Intent intent = new Intent(activity, service);
        activity.bindService(intent, connection, flags);
    }

    public void unbindService(ServiceConnection connection) {
        activity.unbindService(connection);
    }

    public void stopService(Class service) {
        Intent intent = new Intent(app, service);
        app.stopService(intent);
    }

    public void startActivity(Class activityClass) {
        Intent intent = new Intent(activity, activityClass);
        activity.startActivity(intent);
    }

    public void startActivityForResult(Class activityClass, int requestCode) {
        Intent intent = new Intent(activity, activityClass);
        activity.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(String action, int requestCode) {
        Intent intent = new Intent(action);
        activity.startActivityForResult(intent, requestCode);
    }

    public void finishActivity() {
        activity.finish();
    }
}
