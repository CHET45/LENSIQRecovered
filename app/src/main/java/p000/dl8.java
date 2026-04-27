package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import p000.f0f;

/* JADX INFO: loaded from: classes7.dex */
public final class dl8 {

    /* JADX INFO: renamed from: dl8$a */
    public static final class C4845a implements f0f {

        /* JADX INFO: renamed from: a */
        public final fx8 f29944a;

        public C4845a(ny6<? extends f0f> ny6Var) {
            this.f29944a = hz8.lazy(ny6Var);
        }

        private final f0f getOriginal() {
            return (f0f) this.f29944a.getValue();
        }

        @Override // p000.f0f
        public List<Annotation> getAnnotations() {
            return f0f.C5539a.getAnnotations(this);
        }

        @Override // p000.f0f
        public List<Annotation> getElementAnnotations(int i) {
            return getOriginal().getElementAnnotations(i);
        }

        @Override // p000.f0f
        public f0f getElementDescriptor(int i) {
            return getOriginal().getElementDescriptor(i);
        }

        @Override // p000.f0f
        public int getElementIndex(String str) {
            md8.checkNotNullParameter(str, "name");
            return getOriginal().getElementIndex(str);
        }

        @Override // p000.f0f
        public String getElementName(int i) {
            return getOriginal().getElementName(i);
        }

        @Override // p000.f0f
        public int getElementsCount() {
            return getOriginal().getElementsCount();
        }

        @Override // p000.f0f
        public u0f getKind() {
            return getOriginal().getKind();
        }

        @Override // p000.f0f
        public String getSerialName() {
            return getOriginal().getSerialName();
        }

        @Override // p000.f0f
        public boolean isElementOptional(int i) {
            return getOriginal().isElementOptional(i);
        }

        @Override // p000.f0f
        public boolean isInline() {
            return f0f.C5539a.isInline(this);
        }

        @Override // p000.f0f
        public boolean isNullable() {
            return f0f.C5539a.isNullable(this);
        }
    }

    @yfb
    public static final ok8 asJsonDecoder(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "<this>");
        ok8 ok8Var = jl3Var instanceof ok8 ? (ok8) jl3Var : null;
        if (ok8Var != null) {
            return ok8Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + vvd.getOrCreateKotlinClass(jl3Var.getClass()));
    }

    @yfb
    public static final el8 asJsonEncoder(@yfb m15 m15Var) {
        md8.checkNotNullParameter(m15Var, "<this>");
        el8 el8Var = m15Var instanceof el8 ? (el8) m15Var : null;
        if (el8Var != null) {
            return el8Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + vvd.getOrCreateKotlinClass(m15Var.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f defer(ny6<? extends f0f> ny6Var) {
        return new C4845a(ny6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(m15 m15Var) {
        asJsonEncoder(m15Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(jl3 jl3Var) {
        asJsonDecoder(jl3Var);
    }
}
