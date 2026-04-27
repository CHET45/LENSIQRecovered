package p000;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class ek8 implements lp8<ck8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ek8 f33245a = new ek8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f33246b = C5354a.f33247b;

    /* JADX INFO: renamed from: ek8$a */
    public static final class C5354a implements f0f {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C5354a f33247b = new C5354a();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f33248c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f0f f33249a = hg1.ListSerializer(cl8.f16886a).getDescriptor();

        private C5354a() {
        }

        @ph5
        public static /* synthetic */ void getSerialName$annotations() {
        }

        @Override // p000.f0f
        @yfb
        public List<Annotation> getAnnotations() {
            return this.f33249a.getAnnotations();
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public List<Annotation> getElementAnnotations(int i) {
            return this.f33249a.getElementAnnotations(i);
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public f0f getElementDescriptor(int i) {
            return this.f33249a.getElementDescriptor(i);
        }

        @Override // p000.f0f
        @ph5
        public int getElementIndex(@yfb String str) {
            md8.checkNotNullParameter(str, "name");
            return this.f33249a.getElementIndex(str);
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public String getElementName(int i) {
            return this.f33249a.getElementName(i);
        }

        @Override // p000.f0f
        public int getElementsCount() {
            return this.f33249a.getElementsCount();
        }

        @Override // p000.f0f
        @yfb
        public u0f getKind() {
            return this.f33249a.getKind();
        }

        @Override // p000.f0f
        @yfb
        public String getSerialName() {
            return f33248c;
        }

        @Override // p000.f0f
        @ph5
        public boolean isElementOptional(int i) {
            return this.f33249a.isElementOptional(i);
        }

        @Override // p000.f0f
        public boolean isInline() {
            return this.f33249a.isInline();
        }

        @Override // p000.f0f
        public boolean isNullable() {
            return this.f33249a.isNullable();
        }
    }

    private ek8() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f33246b;
    }

    @Override // p000.t74
    @yfb
    public ck8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        dl8.verify(jl3Var);
        return new ck8((List) hg1.ListSerializer(cl8.f16886a).deserialize(jl3Var));
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb ck8 ck8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(ck8Var, "value");
        dl8.verify(m15Var);
        hg1.ListSerializer(cl8.f16886a).serialize(m15Var, ck8Var);
    }
}
