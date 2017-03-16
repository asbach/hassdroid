package xyz.bachmeier.hass.hassdroid.network;

/**
 * Created by Alexander Bachmeier <alexander.bachmeier@uni-ulm.de> on 13.03.2017.
 */

import android.util.Log;

import com.appunite.websocket.rx.RxWebSockets;
import com.appunite.websocket.rx.messages.RxEvent;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import rx.Subscription;
import rx.functions.Action1;

/**
 * FIXME:
 * draft testing class
 */
public class Socket {

    private Socket(){

    }

    public void test(){

        final Request request = new Request.Builder()
                .get()
                .url("ws://pi.bachmeier.xyz:8132/api/websocket")
                .build();
        final Subscription subscribe = new RxWebSockets(new OkHttpClient(),request)
                .webSocketObservable()
                .subscribe(new Action1<RxEvent>() {
                    @Override
                    public void call(RxEvent rxEvent) {
                        Log.d("Socket", rxEvent.toString());
                    }
                });

    }
}
