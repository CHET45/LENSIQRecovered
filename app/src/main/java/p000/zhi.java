package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p000.hf0;
import p000.wng;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class zhi implements wng.InterfaceC14709a {

    /* JADX INFO: renamed from: a */
    public final int f105105a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16142a f105106b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<C16143b> f105107c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f105108d;

    /* JADX INFO: renamed from: e */
    public hf0.C6832a f105109e;

    /* JADX INFO: renamed from: f */
    public hf0.C6832a f105110f;

    /* JADX INFO: renamed from: g */
    public wu1 f105111g;

    /* JADX INFO: renamed from: h */
    public int f105112h;

    /* JADX INFO: renamed from: zhi$a */
    public interface InterfaceC16142a {
        void onNewWaveformBar(int i, C16143b c16143b);
    }

    /* JADX INFO: renamed from: zhi$b */
    public static class C16143b {

        /* JADX INFO: renamed from: a */
        public float f105113a = 1.0f;

        /* JADX INFO: renamed from: b */
        public float f105114b = -1.0f;

        /* JADX INFO: renamed from: c */
        public double f105115c;

        /* JADX INFO: renamed from: d */
        public int f105116d;

        public void addSample(@y46(from = -1.0d, m25645to = 1.0d) float f) {
            v7d.checkArgument(f >= -1.0f && f <= 1.0f);
            this.f105113a = Math.min(this.f105113a, f);
            this.f105114b = Math.max(this.f105114b, f);
            double d = f;
            this.f105115c += d * d;
            this.f105116d++;
        }

        public double getMaxSampleValue() {
            return this.f105114b;
        }

        public double getMinSampleValue() {
            return this.f105113a;
        }

        public double getRootMeanSquare() {
            return Math.sqrt(this.f105115c / ((double) this.f105116d));
        }

        public int getSampleCount() {
            return this.f105116d;
        }
    }

    public zhi(int i, int i2, InterfaceC16142a interfaceC16142a) {
        this.f105105a = i;
        this.f105106b = interfaceC16142a;
        this.f105108d = ByteBuffer.allocate(t0i.getPcmFrameSize(4, i2));
        this.f105107c = new SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f105107c.append(i3, new C16143b());
        }
    }

    @Override // p000.wng.InterfaceC14709a
    public void flush(int i, int i2, int i3) {
        this.f105112h = i / this.f105105a;
        this.f105109e = new hf0.C6832a(i, i2, i3);
        this.f105110f = new hf0.C6832a(i, this.f105107c.size(), 4);
        this.f105111g = wu1.createForConstantGain(i2, this.f105107c.size());
    }

    @Override // p000.wng.InterfaceC14709a
    public void handleBuffer(ByteBuffer byteBuffer) {
        v80.checkStateNotNull(this.f105109e);
        v80.checkStateNotNull(this.f105110f);
        v80.checkStateNotNull(this.f105111g);
        while (byteBuffer.hasRemaining()) {
            this.f105108d.rewind();
            ie0.mix(byteBuffer, this.f105109e, this.f105108d, this.f105110f, this.f105111g, 1, false, true);
            this.f105108d.rewind();
            for (int i = 0; i < this.f105107c.size(); i++) {
                C16143b c16143b = this.f105107c.get(i);
                c16143b.addSample(this.f105108d.getFloat());
                if (c16143b.getSampleCount() >= this.f105112h) {
                    this.f105106b.onNewWaveformBar(i, c16143b);
                    this.f105107c.put(i, new C16143b());
                }
            }
        }
    }
}
