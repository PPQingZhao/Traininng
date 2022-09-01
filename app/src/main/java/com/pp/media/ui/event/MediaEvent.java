package com.pp.media.ui.event;

import com.pp.mvvm.event.ViewEvent;

public class MediaEvent<T> extends ViewEvent<T> {
    public static final String ACTION_SEND_IMAGEBUCKET_FOR_IMAGLIST = "Send imagebucket for imagelist fragment";
    public static final String ACTION_ON_IMAGELIST_BACKPRESSED = "On ImageListFragment backpressed";

    public static <Data> MediaEvent<Data> newEvent(Data data, String type) {
        MediaEvent<Data> event = new MediaEvent<>();
        event.setType(type);
        if (null != data) {
            DataOwner<Data> owner = new DataOwner<Data>(data);
            event.setDataOwner(owner);
        }
        return event;
    }

    public static MediaEvent newEvent(String type) {
        return newEvent(null, type);
    }
}