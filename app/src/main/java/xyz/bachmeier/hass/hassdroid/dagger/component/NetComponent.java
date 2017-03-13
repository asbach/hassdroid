package xyz.bachmeier.hass.hassdroid.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import xyz.bachmeier.hass.hassdroid.MainActivity;
import xyz.bachmeier.hass.hassdroid.dagger.module.AppModule;
import xyz.bachmeier.hass.hassdroid.dagger.module.NetModule;

/**
 * Created by Alexander Bachmeier <alexander.bachmeier@uni-ulm.de> on 13.03.2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
