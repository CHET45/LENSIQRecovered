package p000;

import android.media.AudioManager;
import androidx.media3.exoplayer.C1223b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1223b f101211a;

    public /* synthetic */ yd0(C1223b c1223b) {
        this.f101211a = c1223b;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f101211a.handlePlatformAudioFocusChange(i);
    }
}
