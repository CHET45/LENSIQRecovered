package p000;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import p000.gp9;

/* JADX INFO: loaded from: classes3.dex */
@c5e(35)
@ovh
public final class gp9 {

    /* JADX INFO: renamed from: a */
    public final HashSet<MediaCodec> f40705a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6457b f40706b;

    /* JADX INFO: renamed from: c */
    @hib
    public LoudnessCodecController f40707c;

    /* JADX INFO: renamed from: gp9$a */
    public class C6456a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public C6456a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return gp9.this.f40706b.onLoudnessParameterUpdate(bundle);
        }
    }

    /* JADX INFO: renamed from: gp9$b */
    public interface InterfaceC6457b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC6457b f40709a = new InterfaceC6457b() { // from class: hp9
            @Override // p000.gp9.InterfaceC6457b
            public final Bundle onLoudnessParameterUpdate(Bundle bundle) {
                return gp9.InterfaceC6457b.lambda$static$0(bundle);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Bundle lambda$static$0(Bundle bundle) {
            return bundle;
        }

        Bundle onLoudnessParameterUpdate(Bundle bundle);
    }

    public gp9() {
        this(InterfaceC6457b.f40709a);
    }

    public void addMediaCodec(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f40707c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            v80.checkState(this.f40705a.add(mediaCodec));
        }
    }

    public void release() {
        this.f40705a.clear();
        LoudnessCodecController loudnessCodecController = this.f40707c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void removeMediaCodec(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f40705a.remove(mediaCodec) || (loudnessCodecController = this.f40707c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void setAudioSessionId(int i) {
        LoudnessCodecController loudnessCodecController = this.f40707c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f40707c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, xya.directExecutor(), new C6456a());
        this.f40707c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f40705a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public gp9(InterfaceC6457b interfaceC6457b) {
        this.f40705a = new HashSet<>();
        this.f40706b = interfaceC6457b;
    }
}
