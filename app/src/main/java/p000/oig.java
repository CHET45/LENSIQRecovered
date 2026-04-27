package p000;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public class oig implements hda {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f67754a;

    public oig(MediaCodec mediaCodec) {
        this.f67754a = mediaCodec;
    }

    @Override // p000.hda
    public void flush() {
    }

    @Override // p000.hda
    public void maybeThrowException() {
    }

    @Override // p000.hda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f67754a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.hda
    public void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3) {
        this.f67754a.queueSecureInputBuffer(i, i2, f93Var.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // p000.hda
    public void setParameters(Bundle bundle) {
        this.f67754a.setParameters(bundle);
    }

    @Override // p000.hda
    public void shutdown() {
    }

    @Override // p000.hda
    public void start() {
    }

    @Override // p000.hda
    public void waitUntilQueueingComplete() {
    }
}
