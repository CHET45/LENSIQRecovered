package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import p000.dda;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ss6 implements dda {

    /* JADX INFO: renamed from: a */
    public final dda f82740a;

    public ss6(dda ddaVar) {
        this.f82740a = ddaVar;
    }

    @Override // p000.dda
    public int dequeueInputBufferIndex() {
        return this.f82740a.dequeueInputBufferIndex();
    }

    @Override // p000.dda
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.f82740a.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // p000.dda
    @c5e(35)
    public void detachOutputSurface() {
        this.f82740a.detachOutputSurface();
    }

    @Override // p000.dda
    public void flush() {
        this.f82740a.flush();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getInputBuffer(int i) {
        return this.f82740a.getInputBuffer(i);
    }

    @Override // p000.dda
    @c5e(26)
    public PersistableBundle getMetrics() {
        return this.f82740a.getMetrics();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getOutputBuffer(int i) {
        return this.f82740a.getOutputBuffer(i);
    }

    @Override // p000.dda
    public MediaFormat getOutputFormat() {
        return this.f82740a.getOutputFormat();
    }

    @Override // p000.dda
    public boolean needsReconfiguration() {
        return this.f82740a.needsReconfiguration();
    }

    @Override // p000.dda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f82740a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.dda
    public void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3) {
        this.f82740a.queueSecureInputBuffer(i, i2, f93Var, j, i3);
    }

    @Override // p000.dda
    public boolean registerOnBufferAvailableListener(dda.InterfaceC4753c interfaceC4753c) {
        return this.f82740a.registerOnBufferAvailableListener(interfaceC4753c);
    }

    @Override // p000.dda
    public void release() {
        this.f82740a.release();
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, boolean z) {
        this.f82740a.releaseOutputBuffer(i, z);
    }

    @Override // p000.dda
    @c5e(23)
    public void setOnFrameRenderedListener(dda.InterfaceC4754d interfaceC4754d, Handler handler) {
        this.f82740a.setOnFrameRenderedListener(interfaceC4754d, handler);
    }

    @Override // p000.dda
    @c5e(23)
    public void setOutputSurface(Surface surface) {
        this.f82740a.setOutputSurface(surface);
    }

    @Override // p000.dda
    public void setParameters(Bundle bundle) {
        this.f82740a.setParameters(bundle);
    }

    @Override // p000.dda
    public void setVideoScalingMode(int i) {
        this.f82740a.setVideoScalingMode(i);
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, long j) {
        this.f82740a.releaseOutputBuffer(i, j);
    }
}
