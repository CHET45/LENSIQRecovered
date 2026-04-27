package p000;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface sg0 {

    /* JADX INFO: renamed from: sg0$a */
    public static final class C12563a {

        /* JADX INFO: renamed from: a */
        @hib
        public final Handler f81696a;

        /* JADX INFO: renamed from: b */
        @hib
        public final sg0 f81697b;

        public C12563a(@hib Handler handler, @hib sg0 sg0Var) {
            this.f81696a = sg0Var != null ? (Handler) u80.checkNotNull(handler) : null;
            this.f81697b = sg0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioCodecError$9(Exception exc) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSinkError$8(Exception exc) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$5(String str) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$6(nl3 nl3Var) {
            nl3Var.ensureUpdated();
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioDisabled(nl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(nl3 nl3Var) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioEnabled(nl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(kq6 kq6Var, wl3 wl3Var) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioInputFormatChanged(kq6Var);
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioInputFormatChanged(kq6Var, wl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$positionAdvancing$3(long j) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z) {
            ((sg0) x0i.castNonNull(this.f81697b)).onSkipSilenceEnabledChanged(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$underrun$4(int i, long j, long j2) {
            ((sg0) x0i.castNonNull(this.f81697b)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(final Exception exc) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: fg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36502a.lambda$audioCodecError$9(exc);
                    }
                });
            }
        }

        public void audioSinkError(final Exception exc) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: pg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70674a.lambda$audioSinkError$8(exc);
                    }
                });
            }
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: dg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29575a.lambda$decoderInitialized$1(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: uf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f87843a.lambda$decoderReleased$5(str);
                    }
                });
            }
        }

        public void disabled(final nl3 nl3Var) {
            nl3Var.ensureUpdated();
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f57489a.lambda$disabled$6(nl3Var);
                    }
                });
            }
        }

        public void enabled(final nl3 nl3Var) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: jg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50461a.lambda$enabled$0(nl3Var);
                    }
                });
            }
        }

        public void inputFormatChanged(final kq6 kq6Var, @hib final wl3 wl3Var) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ng0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64457a.lambda$inputFormatChanged$2(kq6Var, wl3Var);
                    }
                });
            }
        }

        public void positionAdvancing(final long j) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: hg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43402a.lambda$positionAdvancing$3(j);
                    }
                });
            }
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13666a.lambda$skipSilenceEnabledChanged$7(z);
                    }
                });
            }
        }

        public void underrun(final int i, final long j, final long j2) {
            Handler handler = this.f81696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: zf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f104988a.lambda$underrun$4(i, j, j2);
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

    default void onAudioDisabled(nl3 nl3Var) {
    }

    default void onAudioEnabled(nl3 nl3Var) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(kq6 kq6Var) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioUnderrun(int i, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    default void onAudioInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var) {
    }
}
