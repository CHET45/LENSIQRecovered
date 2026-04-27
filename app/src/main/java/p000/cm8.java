package p000;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class cm8 implements lp8<am8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cm8 f16946a = new cm8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f16947b = C2387a.f16948b;

    /* JADX INFO: renamed from: cm8$a */
    public static final class C2387a implements f0f {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C2387a f16948b = new C2387a();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f16949c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f0f f16950a = hg1.MapSerializer(hg1.serializer(l7g.f56714a), cl8.f16886a).getDescriptor();

        private C2387a() {
        }

        @ph5
        public static /* synthetic */ void getSerialName$annotations() {
        }

        @Override // p000.f0f
        @yfb
        public List<Annotation> getAnnotations() {
            return this.f16950a.getAnnotations();
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public List<Annotation> getElementAnnotations(int i) {
            return this.f16950a.getElementAnnotations(i);
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public f0f getElementDescriptor(int i) {
            return this.f16950a.getElementDescriptor(i);
        }

        @Override // p000.f0f
        @ph5
        public int getElementIndex(@yfb String str) {
            md8.checkNotNullParameter(str, "name");
            return this.f16950a.getElementIndex(str);
        }

        @Override // p000.f0f
        @ph5
        @yfb
        public String getElementName(int i) {
            return this.f16950a.getElementName(i);
        }

        @Override // p000.f0f
        public int getElementsCount() {
            return this.f16950a.getElementsCount();
        }

        @Override // p000.f0f
        @yfb
        public u0f getKind() {
            return this.f16950a.getKind();
        }

        @Override // p000.f0f
        @yfb
        public String getSerialName() {
            return f16949c;
        }

        @Override // p000.f0f
        @ph5
        public boolean isElementOptional(int i) {
            return this.f16950a.isElementOptional(i);
        }

        @Override // p000.f0f
        public boolean isInline() {
            return this.f16950a.isInline();
        }

        @Override // p000.f0f
        public boolean isNullable() {
            return this.f16950a.isNullable();
        }
    }

    private cm8() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f16947b;
    }

    @Override // p000.t74
    @yfb
    public am8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        dl8.verify(jl3Var);
        return new am8((Map) hg1.MapSerializer(hg1.serializer(l7g.f56714a), cl8.f16886a).deserialize(jl3Var));
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb am8 am8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(am8Var, "value");
        dl8.verify(m15Var);
        hg1.MapSerializer(hg1.serializer(l7g.f56714a), cl8.f16886a).serialize(m15Var, am8Var);
    }
}
