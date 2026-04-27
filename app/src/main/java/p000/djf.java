package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class djf extends hif<ieg, keg, beg> implements zdg {

    /* JADX INFO: renamed from: n */
    public final String f29839n;

    /* JADX INFO: renamed from: djf$a */
    public class C4825a extends keg {
        public C4825a() {
        }

        @Override // p000.ul3
        public void release() {
            djf.this.m12411f(this);
        }
    }

    public djf(String str) {
        super(new ieg[2], new keg[2]);
        this.f29839n = str;
        m12412g(1024);
    }

    @Override // p000.il3
    public final String getName() {
        return this.f29839n;
    }

    @Override // p000.hif
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ieg mo9206b() {
        return new ieg();
    }

    @Override // p000.hif
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final keg mo9207c() {
        return new C4825a();
    }

    @Override // p000.hif
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final beg mo9208d(Throwable th) {
        return new beg("Unexpected decode error", th);
    }

    /* JADX INFO: renamed from: l */
    public abstract xdg mo9213l(byte[] bArr, int i, boolean z) throws beg;

    @Override // p000.hif
    @hib
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final beg mo9209e(ieg iegVar, keg kegVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) u80.checkNotNull(iegVar.f82162d);
            kegVar.setContent(iegVar.f82164f, mo9213l(byteBuffer.array(), byteBuffer.limit(), z), iegVar.f46703N);
            kegVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (beg e) {
            return e;
        }
    }

    @Override // p000.zdg
    public void setPositionUs(long j) {
    }
}
