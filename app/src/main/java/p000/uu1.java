package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class uu1 extends mq0 {

    /* JADX INFO: renamed from: i */
    public final SparseArray<wu1> f89148i = new SparseArray<>();

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        if (c6832a.f43352c != 2) {
            throw new hf0.C6833b(c6832a);
        }
        wu1 wu1Var = this.f89148i.get(c6832a.f43351b);
        if (wu1Var != null) {
            return wu1Var.isIdentity() ? hf0.C6832a.f43349e : new hf0.C6832a(c6832a.f43350a, wu1Var.getOutputChannelCount(), 2);
        }
        throw new hf0.C6833b("No mixing matrix for input channel count", c6832a);
    }

    public void putChannelMixingMatrix(wu1 wu1Var) {
        this.f89148i.put(wu1Var.getInputChannelCount(), wu1Var);
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        wu1 wu1Var = (wu1) v80.checkStateNotNull(this.f89148i.get(this.f61732b.f43351b));
        int iRemaining = byteBuffer.remaining() / this.f61732b.f43353d;
        ByteBuffer byteBufferM17515b = m17515b(this.f61733c.f43353d * iRemaining);
        ie0.mix(byteBuffer, this.f61732b, byteBufferM17515b, this.f61733c, wu1Var, iRemaining, false, true);
        byteBufferM17515b.flip();
    }
}
