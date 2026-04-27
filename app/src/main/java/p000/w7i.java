package p000;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface w7i {

    /* JADX INFO: renamed from: w7i$a */
    public static final class C14466a {

        /* JADX INFO: renamed from: a */
        @hib
        public final Handler f93540a;

        /* JADX INFO: renamed from: b */
        @hib
        public final w7i f93541b;

        public C14466a(@hib Handler handler, @hib w7i w7iVar) {
            this.f93540a = w7iVar != null ? (Handler) u80.checkNotNull(handler) : null;
            this.f93541b = w7iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$7(String str) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$8(nl3 nl3Var) {
            nl3Var.ensureUpdated();
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoDisabled(nl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
            ((w7i) x0i.castNonNull(this.f93541b)).onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(nl3 nl3Var) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoEnabled(nl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(kq6 kq6Var, wl3 wl3Var) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoInputFormatChanged(kq6Var);
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoInputFormatChanged(kq6Var, wl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderedFirstFrame$6(Object obj, long j) {
            ((w7i) x0i.castNonNull(this.f93541b)).onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long j, int i) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoFrameProcessingOffset(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoCodecError$9(Exception exc) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoSizeChanged$5(z7i z7iVar) {
            ((w7i) x0i.castNonNull(this.f93541b)).onVideoSizeChanged(z7iVar);
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63467a.lambda$decoderInitialized$1(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42870a.lambda$decoderReleased$7(str);
                    }
                });
            }
        }

        public void disabled(final nl3 nl3Var) {
            nl3Var.ensureUpdated();
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49801a.lambda$disabled$8(nl3Var);
                    }
                });
            }
        }

        public void droppedFrames(final int i, final long j) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28722a.lambda$droppedFrames$3(i, j);
                    }
                });
            }
        }

        public void enabled(final nl3 nl3Var) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69944a.lambda$enabled$0(nl3Var);
                    }
                });
            }
        }

        public void inputFormatChanged(final kq6 kq6Var, @hib final wl3 wl3Var) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: r7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77361a.lambda$inputFormatChanged$2(kq6Var, wl3Var);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.f93540a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f93540a.post(new Runnable() { // from class: f7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35665a.lambda$renderedFirstFrame$6(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j, final int i) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f83957a.lambda$reportVideoFrameProcessingOffset$4(j, i);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56715a.lambda$videoCodecError$9(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final z7i z7iVar) {
            Handler handler = this.f93540a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12937a.lambda$videoSizeChanged$5(z7iVar);
                    }
                });
            }
        }
    }

    default void onDroppedFrames(int i, long j) {
    }

    default void onRenderedFirstFrame(Object obj, long j) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(nl3 nl3Var) {
    }

    default void onVideoEnabled(nl3 nl3Var) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(kq6 kq6Var) {
    }

    default void onVideoSizeChanged(z7i z7iVar) {
    }

    default void onVideoInputFormatChanged(kq6 kq6Var, @hib wl3 wl3Var) {
    }
}
