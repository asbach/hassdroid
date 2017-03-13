package xyz.bachmeier.hass.hassdroid.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by Alexander Bachmeier <alexander.bachmeier@uni-ulm.de> on 13.03.2017.
 */

public class AppModule {
    Application mApplication;

    public AppModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return mApplication;
    }
}
