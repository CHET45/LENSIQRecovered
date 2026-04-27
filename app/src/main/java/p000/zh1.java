package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class zh1 extends l86<byte[]> {

    /* JADX INFO: renamed from: b */
    @efb
    public final ByteBuffer f105070b;

    /* JADX INFO: renamed from: c */
    public final int f105071c;

    /* JADX INFO: renamed from: zh1$a */
    public class C16136a implements uu2<qy4<byte[]>> {
        public C16136a() {
        }

        @Override // p000.uu2
        public void accept(qy4<byte[]> qy4Var) {
            int iMin = Math.min(zh1.this.f105070b.remaining(), zh1.this.f105071c);
            if (iMin == 0) {
                qy4Var.onComplete();
                return;
            }
            byte[] bArr = new byte[iMin];
            zh1.this.f105070b.get(bArr);
            qy4Var.onNext(bArr);
        }
    }

    public zh1(@efb byte[] bArr, int i) {
        if (i > 0) {
            this.f105070b = ByteBuffer.wrap(bArr);
            this.f105071c = i;
        } else {
            throw new IllegalArgumentException("maxBatchSize must be > 0 but found: " + i);
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super byte[]> ycgVar) {
        l86.generate(new C16136a()).subscribe(ycgVar);
    }
}
