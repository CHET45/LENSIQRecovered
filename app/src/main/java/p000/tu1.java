package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tu1 extends lq0 {

    /* JADX INFO: renamed from: i */
    public final SparseArray<vu1> f85931i = new SparseArray<>();

    @Override // p000.lq0
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        if (c7262a.f46722c != 2) {
            throw new if0.C7263b(c7262a);
        }
        vu1 vu1Var = this.f85931i.get(c7262a.f46721b);
        if (vu1Var != null) {
            return vu1Var.isIdentity() ? if0.C7262a.f46719e : new if0.C7262a(c7262a.f46720a, vu1Var.getOutputChannelCount(), 2);
        }
        throw new if0.C7263b("No mixing matrix for input channel count", c7262a);
    }

    public void putChannelMixingMatrix(vu1 vu1Var) {
        this.f85931i.put(vu1Var.getInputChannelCount(), vu1Var);
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        vu1 vu1Var = (vu1) u80.checkStateNotNull(this.f85931i.get(this.f58444b.f46721b));
        ByteBuffer byteBufferM16315e = m16315e((byteBuffer.remaining() / this.f58444b.f46723d) * this.f58445c.f46723d);
        int inputChannelCount = vu1Var.getInputChannelCount();
        int outputChannelCount = vu1Var.getOutputChannelCount();
        float[] fArr = new float[outputChannelCount];
        while (byteBuffer.hasRemaining()) {
            for (int i = 0; i < inputChannelCount; i++) {
                short s = byteBuffer.getShort();
                for (int i2 = 0; i2 < outputChannelCount; i2++) {
                    fArr[i2] = fArr[i2] + (vu1Var.getMixingCoefficient(i, i2) * s);
                }
            }
            for (int i3 = 0; i3 < outputChannelCount; i3++) {
                short sConstrainValue = (short) x0i.constrainValue(fArr[i3], -32768.0f, 32767.0f);
                byteBufferM16315e.put((byte) (sConstrainValue & 255));
                byteBufferM16315e.put((byte) ((sConstrainValue >> 8) & 255));
                fArr[i3] = 0.0f;
            }
        }
        byteBufferM16315e.flip();
    }
}
