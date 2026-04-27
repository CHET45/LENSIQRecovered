package p000;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface v7i {

    /* JADX INFO: renamed from: v7i$a */
    public static final class C13929a {

        /* JADX INFO: renamed from: a */
        @hib
        public final Handler f90269a;

        /* JADX INFO: renamed from: b */
        @hib
        public final v7i f90270b;

        public C13929a(@hib Handler handler, @hib v7i v7iVar) {
            this.f90269a = v7iVar != null ? (Handler) v80.checkNotNull(handler) : null;
            this.f90270b = v7iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$7(String str) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$8(ol3 ol3Var) {
            ol3Var.ensureUpdated();
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoDisabled(ol3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
            ((v7i) t0i.castNonNull(this.f90270b)).onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(ol3 ol3Var) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoEnabled(ol3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(C1213a c1213a, vl3 vl3Var) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoInputFormatChanged(c1213a, vl3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderedFirstFrame$6(Object obj, long j) {
            ((v7i) t0i.castNonNull(this.f90270b)).onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long j, int i) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoFrameProcessingOffset(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoCodecError$9(Exception exc) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoSizeChanged$5(a8i a8iVar) {
            ((v7i) t0i.castNonNull(this.f90270b)).onVideoSizeChanged(a8iVar);
        }

        public void decoderInitialized(final String str, final long j, final long j2) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15918a.lambda$decoderInitialized$1(str, j, j2);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f87002a.lambda$decoderReleased$7(str);
                    }
                });
            }
        }

        public void disabled(final ol3 ol3Var) {
            ol3Var.ensureUpdated();
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: s7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80925a.lambda$disabled$8(ol3Var);
                    }
                });
            }
        }

        public void droppedFrames(final int i, final long j) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38975a.lambda$droppedFrames$3(i, j);
                    }
                });
            }
        }

        public void enabled(final ol3 ol3Var) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66628a.lambda$enabled$0(ol3Var);
                    }
                });
            }
        }

        public void inputFormatChanged(final C1213a c1213a, @hib final vl3 vl3Var) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f73451a.lambda$inputFormatChanged$2(c1213a, vl3Var);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.f90269a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f90269a.post(new Runnable() { // from class: i7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45961a.lambda$renderedFirstFrame$6(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j, final int i) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52748a.lambda$reportVideoFrameProcessingOffset$4(j, i);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60166a.lambda$videoCodecError$9(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final a8i a8iVar) {
            Handler handler = this.f90269a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32081a.lambda$videoSizeChanged$5(a8iVar);
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

    default void onVideoDisabled(ol3 ol3Var) {
    }

    default void onVideoEnabled(ol3 ol3Var) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    default void onVideoInputFormatChanged(C1213a c1213a, @hib vl3 vl3Var) {
    }

    default void onVideoSizeChanged(a8i a8iVar) {
    }
}
