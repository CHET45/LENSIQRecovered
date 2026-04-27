package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class ejf extends iif<jeg, leg, ceg> implements aeg {

    /* JADX INFO: renamed from: o */
    public final String f33230o;

    /* JADX INFO: renamed from: ejf$a */
    public class C5349a extends leg {
        public C5349a() {
        }

        @Override // p000.tl3
        public void release() {
            ejf.this.m13125g(this);
        }
    }

    public ejf(String str) {
        super(new jeg[2], new leg[2]);
        this.f33230o = str;
        m13126h(1024);
    }

    @Override // p000.kl3
    public final String getName() {
        return this.f33230o;
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final jeg mo10081b() {
        return new jeg();
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final leg mo10082c() {
        return new C5349a();
    }

    @Override // p000.iif
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ceg mo10083d(Throwable th) {
        return new ceg("Unexpected decode error", th);
    }

    /* JADX INFO: renamed from: m */
    public abstract ydg mo10088m(byte[] bArr, int i, boolean z) throws ceg;

    @Override // p000.iif
    @hib
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ceg mo10084e(jeg jegVar, leg legVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(jegVar.f78608d);
            legVar.setContent(jegVar.f78610f, mo10088m(byteBuffer.array(), byteBuffer.limit(), z), jegVar.f50407N);
            legVar.f85179d = false;
            return null;
        } catch (ceg e) {
            return e;
        }
    }

    @Override // p000.aeg
    public void setPositionUs(long j) {
    }
}
