package p000;

import java.lang.annotation.Annotation;
import p000.jhd;

/* JADX INFO: loaded from: classes5.dex */
public final class hb0 {

    /* JADX INFO: renamed from: a */
    public int f43048a;

    /* JADX INFO: renamed from: b */
    public jhd.EnumC7903a f43049b = jhd.EnumC7903a.DEFAULT;

    /* JADX INFO: renamed from: hb0$a */
    public static final class C6780a implements jhd {

        /* JADX INFO: renamed from: w0 */
        public final int f43050w0;

        /* JADX INFO: renamed from: x0 */
        public final jhd.EnumC7903a f43051x0;

        public C6780a(int i, jhd.EnumC7903a enumC7903a) {
            this.f43050w0 = i;
            this.f43051x0 = enumC7903a;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return jhd.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof jhd)) {
                return false;
            }
            jhd jhdVar = (jhd) obj;
            return this.f43050w0 == jhdVar.tag() && this.f43051x0.equals(jhdVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f43050w0) + (this.f43051x0.hashCode() ^ 2041407134);
        }

        @Override // p000.jhd
        public jhd.EnumC7903a intEncoding() {
            return this.f43051x0;
        }

        @Override // p000.jhd
        public int tag() {
            return this.f43050w0;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43050w0 + "intEncoding=" + this.f43051x0 + ')';
        }
    }

    public static hb0 builder() {
        return new hb0();
    }

    public jhd build() {
        return new C6780a(this.f43048a, this.f43049b);
    }

    public hb0 intEncoding(jhd.EnumC7903a enumC7903a) {
        this.f43049b = enumC7903a;
        return this;
    }

    public hb0 tag(int i) {
        this.f43048a = i;
        return this;
    }
}
