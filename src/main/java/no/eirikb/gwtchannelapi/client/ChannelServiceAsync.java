package no.eirikb.gwtchannelapi.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChannelServiceAsync {
    public void join(String channelName, AsyncCallback<String> asyncCallback);

    public void send(String channel, String message, AsyncCallback<Void> asyncCallback);
}
