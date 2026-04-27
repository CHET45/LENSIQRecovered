package p000;

import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public class c08 {

    /* JADX INFO: renamed from: a */
    public final o7c f15426a = new o7c();

    /* JADX INFO: renamed from: b */
    public final C2137a f15427b = new C2137a();

    /* JADX INFO: renamed from: c */
    public final C2138b f15428c = new C2138b();

    /* JADX INFO: renamed from: c08$a */
    public class C2137a extends rd4 {
        public C2137a() {
        }

        @Override // p000.rd4
        public void writeBytes(vj1 vj1Var) {
            c08.this.f15426a.writeBytesAscending(vj1Var);
        }

        @Override // p000.rd4
        public void writeDouble(double d) {
            c08.this.f15426a.writeDoubleAscending(d);
        }

        @Override // p000.rd4
        public void writeInfinity() {
            c08.this.f15426a.writeInfinityAscending();
        }

        @Override // p000.rd4
        public void writeLong(long j) {
            c08.this.f15426a.writeSignedLongAscending(j);
        }

        @Override // p000.rd4
        public void writeString(String str) {
            c08.this.f15426a.writeUtf8Ascending(str);
        }
    }

    /* JADX INFO: renamed from: c08$b */
    public class C2138b extends rd4 {
        public C2138b() {
        }

        @Override // p000.rd4
        public void writeBytes(vj1 vj1Var) {
            c08.this.f15426a.writeBytesDescending(vj1Var);
        }

        @Override // p000.rd4
        public void writeDouble(double d) {
            c08.this.f15426a.writeDoubleDescending(d);
        }

        @Override // p000.rd4
        public void writeInfinity() {
            c08.this.f15426a.writeInfinityDescending();
        }

        @Override // p000.rd4
        public void writeLong(long j) {
            c08.this.f15426a.writeSignedLongDescending(j);
        }

        @Override // p000.rd4
        public void writeString(String str) {
            c08.this.f15426a.writeUtf8Descending(str);
        }
    }

    public rd4 forKind(ir5.AbstractC7573c.a aVar) {
        return aVar.equals(ir5.AbstractC7573c.a.DESCENDING) ? this.f15428c : this.f15427b;
    }

    public byte[] getEncodedBytes() {
        return this.f15426a.encodedBytes();
    }

    public void reset() {
        this.f15426a.reset();
    }

    public void seed(byte[] bArr) {
        this.f15426a.seed(bArr);
    }
}
