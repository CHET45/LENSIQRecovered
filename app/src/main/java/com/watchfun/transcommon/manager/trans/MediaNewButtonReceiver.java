package com.watchfun.transcommon.manager.trans;

import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.view.KeyEvent;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class MediaNewButtonReceiver {
    private IKeyDownListener mKeyDownListener;
    private MediaSession mMediaSession;

    public interface IKeyDownListener {
        void onKeyDown(@KeyActions int i);
    }

    public @interface KeyActions {
        public static final int NEXT_ACTION = 87;
        public static final int PAUSE_ACTION = 127;
        public static final int PLAY_ACTION = 126;
        public static final int PREV_ACTION = 88;
    }

    public MediaNewButtonReceiver(Context context, final IKeyDownListener iKeyDownListener) {
        yi9.m26090d("MediaNewButtonReceiver", "MediaNewButtonReceiver 1");
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.mKeyDownListener = iKeyDownListener;
        MediaSession mediaSession = new MediaSession(context, getClass().getName());
        this.mMediaSession = mediaSession;
        mediaSession.setCallback(new MediaSession.Callback() { // from class: com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver.1
            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                yi9.m26090d("MediaNewButtonReceiver", "mediaButtonIntent..." + intent.getAction());
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                yi9.m26090d("MediaNewButtonReceiver", "keyEvent..." + keyEvent);
                if (keyEvent == null) {
                    return false;
                }
                if (1 == keyEvent.getAction()) {
                    yi9.m26090d("MediaNewButtonReceiver", "keyEvent.getKeyCode()..." + keyEvent.getKeyCode());
                    iKeyDownListener.onKeyDown(keyEvent.getKeyCode());
                }
                return true;
            }
        });
        this.mMediaSession.setFlags(3);
        this.mMediaSession.setActive(true);
    }

    public void release() {
        MediaSession mediaSession = this.mMediaSession;
        if (mediaSession != null) {
            mediaSession.release();
            this.mMediaSession = null;
        }
    }
}
