package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class shd implements h2i {

    /* JADX INFO: renamed from: a */
    public boolean f81843a = false;

    /* JADX INFO: renamed from: b */
    public boolean f81844b = false;

    /* JADX INFO: renamed from: c */
    public ar5 f81845c;

    /* JADX INFO: renamed from: d */
    public final phd f81846d;

    public shd(phd phdVar) {
        this.f81846d = phdVar;
    }

    private void checkNotUsed() {
        if (this.f81843a) {
            throw new t15("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f81843a = true;
    }

    /* JADX INFO: renamed from: a */
    public void m22004a(ar5 ar5Var, boolean z) {
        this.f81843a = false;
        this.f81845c = ar5Var;
        this.f81844b = z;
    }

    @Override // p000.h2i
    @efb
    public h2i add(@hib String str) throws IOException {
        checkNotUsed();
        this.f81846d.m19498d(this.f81845c, str, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(float f) throws IOException {
        checkNotUsed();
        this.f81846d.m19497c(this.f81845c, f, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(double d) throws IOException {
        checkNotUsed();
        this.f81846d.m19496b(this.f81845c, d, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(int i) throws IOException {
        checkNotUsed();
        this.f81846d.m19499e(this.f81845c, i, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(long j) throws IOException {
        checkNotUsed();
        this.f81846d.m19500f(this.f81845c, j, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(boolean z) throws IOException {
        checkNotUsed();
        this.f81846d.m19501g(this.f81845c, z, this.f81844b);
        return this;
    }

    @Override // p000.h2i
    @efb
    public h2i add(@efb byte[] bArr) throws IOException {
        checkNotUsed();
        this.f81846d.m19498d(this.f81845c, bArr, this.f81844b);
        return this;
    }
}
