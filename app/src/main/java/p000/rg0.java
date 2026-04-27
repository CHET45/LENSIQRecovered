package p000;

import android.os.Handler;
import androidx.media3.common.C1213a;
import p000.bh0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface rg0 {

    /* JADX INFO: renamed from: rg0$a */
    public static final class C12068a {

        /* JADX INFO: renamed from: a */
        @hib
        public final Handler f78184a;

        /* JADX INFO: renamed from: b */
        @hib
        public final rg0 f78185b;

        public C12068a(@hib Handler handler, @hib rg0 rg0Var) {
            this.f78184a = rg0Var != null ? (Handler) v80.checkNotNull(handler) : null;
            this.f78185b = rg0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioCodecError$9(Exception exc) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSessionIdChanged$12(int i) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioSessionIdChanged(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSinkError$8(Exception exc) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackInitialized$10(bh0.C1887a c1887a) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioTrackInitialized(c1887a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackReleased$11(bh0.C1887a c1887a) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioTrackReleased(c1887a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$5(String str) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$6(ol3 ol3Var) {
            ol3Var.ensureUpdated();
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioDisabled(ol3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(ol3 ol3Var) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioEnabled(ol3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(C1213a c1213a, vl3 vl3Var) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioInputFormatChanged(c1213a, vl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$positionAdvancing$3(long j) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z) {
            ((rg0) t0i.castNonNull(this.f78185b)).onSkipSilenceEnabledChanged(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$underrun$4(int i, long j, long j2) {
            ((rg0) t0i.castNonNull(this.f78185b)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: gg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39749a.lambda$audioCodecError$9(exc);
                    }
                });
            }
        }

        public void audioSessionIdChanged(final int i) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: wf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94060a.lambda$audioSessionIdChanged$12(i);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ig0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46744a.lambda$audioSinkError$8(exc);
                    }
                });
            }
        }

        public void audioTrackInitialized(final bh0.C1887a c1887a) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: cg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16457a.lambda$audioTrackInitialized$10(c1887a);
                    }
                });
            }
        }

        public void audioTrackReleased(final bh0.C1887a c1887a) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: eg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32924a.lambda$audioTrackReleased$11(c1887a);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: og0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f67554a.lambda$decoderInitialized$1(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: qg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74328a.lambda$decoderReleased$5(str);
                    }
                });
            }
        }

        public void disabled(final ol3 ol3Var) {
            ol3Var.ensureUpdated();
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: xf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97608a.lambda$disabled$6(ol3Var);
                    }
                });
            }
        }

        public void enabled(final ol3 ol3Var) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: vf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90849a.lambda$enabled$0(ol3Var);
                    }
                });
            }
        }

        public void inputFormatChanged(final C1213a c1213a, @hib final vl3 vl3Var) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: kg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53996a.lambda$inputFormatChanged$2(c1213a, vl3Var);
                    }
                });
            }
        }

        public void positionAdvancing(final long j) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f101377a.lambda$positionAdvancing$3(j);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60929a.lambda$skipSilenceEnabledChanged$7(z);
                    }
                });
            }
        }

        public void underrun(final int i, final long j, final long j2) {
            Handler handler = this.f78184a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ag0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1358a.lambda$underrun$4(i, j, j2);
                    }
                });
            }
        }
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j2) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(ol3 ol3Var) {
    }

    default void onAudioEnabled(ol3 ol3Var) {
    }

    default void onAudioInputFormatChanged(C1213a c1213a, @hib vl3 vl3Var) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSessionIdChanged(int i) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioTrackInitialized(bh0.C1887a c1887a) {
    }

    default void onAudioTrackReleased(bh0.C1887a c1887a) {
    }

    default void onAudioUnderrun(int i, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }
}
