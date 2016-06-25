package es.lnsd.mvp.core.presenters;


import es.lnsd.mvp.core.views.BaseView;

/**
 * MVP
 * Copyright (C) 2015 Lorenzo Delgado.
 * http://LNSD.es
 *
 * Licensed under The MIT License (MIT). See LICENSE file for more information.
 */

public interface BasePresenter<T extends BaseView> {
    void registerView(T view);
}