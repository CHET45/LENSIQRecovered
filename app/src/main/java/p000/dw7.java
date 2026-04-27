package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class dw7 {

    /* JADX INFO: renamed from: k */
    @yfb
    public static final C4989b f31165k = new C4989b(null);

    /* JADX INFO: renamed from: l */
    public static final int f31166l = 0;

    /* JADX INFO: renamed from: m */
    public static int f31167m;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f31168a;

    /* JADX INFO: renamed from: b */
    public final float f31169b;

    /* JADX INFO: renamed from: c */
    public final float f31170c;

    /* JADX INFO: renamed from: d */
    public final float f31171d;

    /* JADX INFO: renamed from: e */
    public final float f31172e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final k3i f31173f;

    /* JADX INFO: renamed from: g */
    public final long f31174g;

    /* JADX INFO: renamed from: h */
    public final int f31175h;

    /* JADX INFO: renamed from: i */
    public final boolean f31176i;

    /* JADX INFO: renamed from: j */
    public final int f31177j;

    /* JADX INFO: renamed from: dw7$a */
    @dwf({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,783:1\n42#2,7:784\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n*L\n369#1:784,7\n*E\n"})
    @e0g(parameters = 0)
    public static final class C4988a {

        /* JADX INFO: renamed from: l */
        public static final int f31178l = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f31179a;

        /* JADX INFO: renamed from: b */
        public final float f31180b;

        /* JADX INFO: renamed from: c */
        public final float f31181c;

        /* JADX INFO: renamed from: d */
        public final float f31182d;

        /* JADX INFO: renamed from: e */
        public final float f31183e;

        /* JADX INFO: renamed from: f */
        public final long f31184f;

        /* JADX INFO: renamed from: g */
        public final int f31185g;

        /* JADX INFO: renamed from: h */
        public final boolean f31186h;

        /* JADX INFO: renamed from: i */
        @yfb
        public final ArrayList<a> f31187i;

        /* JADX INFO: renamed from: j */
        @yfb
        public a f31188j;

        /* JADX INFO: renamed from: k */
        public boolean f31189k;

        /* JADX INFO: renamed from: dw7$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @yfb
            public String f31190a;

            /* JADX INFO: renamed from: b */
            public float f31191b;

            /* JADX INFO: renamed from: c */
            public float f31192c;

            /* JADX INFO: renamed from: d */
            public float f31193d;

            /* JADX INFO: renamed from: e */
            public float f31194e;

            /* JADX INFO: renamed from: f */
            public float f31195f;

            /* JADX INFO: renamed from: g */
            public float f31196g;

            /* JADX INFO: renamed from: h */
            public float f31197h;

            /* JADX INFO: renamed from: i */
            @yfb
            public List<? extends qjc> f31198i;

            /* JADX INFO: renamed from: j */
            @yfb
            public List<m3i> f31199j;

            public a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            @yfb
            public final List<m3i> getChildren() {
                return this.f31199j;
            }

            @yfb
            public final List<qjc> getClipPathData() {
                return this.f31198i;
            }

            @yfb
            public final String getName() {
                return this.f31190a;
            }

            public final float getPivotX() {
                return this.f31192c;
            }

            public final float getPivotY() {
                return this.f31193d;
            }

            public final float getRotate() {
                return this.f31191b;
            }

            public final float getScaleX() {
                return this.f31194e;
            }

            public final float getScaleY() {
                return this.f31195f;
            }

            public final float getTranslationX() {
                return this.f31196g;
            }

            public final float getTranslationY() {
                return this.f31197h;
            }

            public final void setChildren(@yfb List<m3i> list) {
                this.f31199j = list;
            }

            public final void setClipPathData(@yfb List<? extends qjc> list) {
                this.f31198i = list;
            }

            public final void setName(@yfb String str) {
                this.f31190a = str;
            }

            public final void setPivotX(float f) {
                this.f31192c = f;
            }

            public final void setPivotY(float f) {
                this.f31193d = f;
            }

            public final void setRotate(float f) {
                this.f31191b = f;
            }

            public final void setScaleX(float f) {
                this.f31194e = f;
            }

            public final void setScaleY(float f) {
                this.f31195f = f;
            }

            public final void setTranslationX(float f) {
                this.f31196g = f;
            }

            public final void setTranslationY(float f) {
                this.f31197h = f;
            }

            public a(@yfb String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @yfb List<? extends qjc> list, @yfb List<m3i> list2) {
                this.f31190a = str;
                this.f31191b = f;
                this.f31192c = f2;
                this.f31193d = f3;
                this.f31194e = f4;
                this.f31195f = f5;
                this.f31196g = f6;
                this.f31197h = f7;
                this.f31198i = list;
                this.f31199j = list2;
            }

            public /* synthetic */ a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, jt3 jt3Var) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? l3i.getEmptyPath() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        @q64(level = u64.f86867c, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @i2e(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ C4988a(String str, float f, float f2, float f3, float f4, long j, int i, jt3 jt3Var) {
            this(str, f, f2, f3, f4, j, i);
        }

        /* JADX INFO: renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ C4988a m28710addPathoIyEayM$default(C4988a c4988a, List list, int i, String str, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            return c4988a.m28711addPathoIyEayM(list, (i4 & 2) != 0 ? l3i.getDefaultFillType() : i, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? null : he1Var, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) == 0 ? he1Var2 : null, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? 0.0f : f3, (i4 & 256) != 0 ? l3i.getDefaultStrokeLineCap() : i2, (i4 & 512) != 0 ? l3i.getDefaultStrokeLineJoin() : i3, (i4 & 1024) != 0 ? 4.0f : f4, (i4 & 2048) != 0 ? 0.0f : f5, (i4 & 4096) == 0 ? f6 : 1.0f, (i4 & 8192) == 0 ? f7 : 0.0f);
        }

        private final k3i asVectorGroup(a aVar) {
            return new k3i(aVar.getName(), aVar.getRotate(), aVar.getPivotX(), aVar.getPivotY(), aVar.getScaleX(), aVar.getScaleY(), aVar.getTranslationX(), aVar.getTranslationY(), aVar.getClipPathData(), aVar.getChildren());
        }

        private final void ensureNotConsumed() {
            if (this.f31189k) {
                g28.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final a getCurrentGroup() {
            return (a) fw7.peek(this.f31187i);
        }

        @yfb
        public final C4988a addGroup(@yfb String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @yfb List<? extends qjc> list) {
            ensureNotConsumed();
            fw7.push(this.f31187i, new a(str, f, f2, f3, f4, f5, f6, f7, list, null, 512, null));
            return this;
        }

        @yfb
        /* JADX INFO: renamed from: addPath-oIyEayM, reason: not valid java name */
        public final C4988a m28711addPathoIyEayM(@yfb List<? extends qjc> list, int i, @yfb String str, @gib he1 he1Var, float f, @gib he1 he1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new p3i(str, list, i, he1Var, f, he1Var2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        @yfb
        public final dw7 build() {
            ensureNotConsumed();
            while (this.f31187i.size() > 1) {
                clearGroup();
            }
            dw7 dw7Var = new dw7(this.f31179a, this.f31180b, this.f31181c, this.f31182d, this.f31183e, asVectorGroup(this.f31188j), this.f31184f, this.f31185g, this.f31186h, 0, 512, null);
            this.f31189k = true;
            return dw7Var;
        }

        @yfb
        public final C4988a clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((a) fw7.pop(this.f31187i)));
            return this;
        }

        public /* synthetic */ C4988a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, jt3 jt3Var) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private C4988a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.f31179a = str;
            this.f31180b = f;
            this.f31181c = f2;
            this.f31182d = f3;
            this.f31183e = f4;
            this.f31184f = j;
            this.f31185g = i;
            this.f31186h = z;
            ArrayList<a> arrayList = new ArrayList<>();
            this.f31187i = arrayList;
            a aVar = new a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f31188j = aVar;
            fw7.push(arrayList, aVar);
        }

        public /* synthetic */ C4988a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, jt3 jt3Var) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? q51.f73234b.m31926getSrcIn0nO6VwU() : i, (i2 & 128) != 0 ? false : z, (jt3) null);
        }

        public /* synthetic */ C4988a(String str, float f, float f2, float f3, float f4, long j, int i, int i2, jt3 jt3Var) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? q51.f73234b.m31926getSrcIn0nO6VwU() : i, (jt3) null);
        }

        private C4988a(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (jt3) null);
        }
    }

    /* JADX INFO: renamed from: dw7$b */
    public static final class C4989b {
        public /* synthetic */ C4989b(jt3 jt3Var) {
            this();
        }

        public final int generateImageVectorId$ui_release() {
            int i;
            synchronized (this) {
                C4989b c4989b = dw7.f31165k;
                i = dw7.f31167m;
                dw7.f31167m = i + 1;
            }
            return i;
        }

        private C4989b() {
        }
    }

    public /* synthetic */ dw7(String str, float f, float f2, float f3, float f4, k3i k3iVar, long j, int i, boolean z, int i2, jt3 jt3Var) {
        this(str, f, f2, f3, f4, k3iVar, j, i, z, i2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw7)) {
            return false;
        }
        dw7 dw7Var = (dw7) obj;
        return md8.areEqual(this.f31168a, dw7Var.f31168a) && kn4.m30710equalsimpl0(this.f31169b, dw7Var.f31169b) && kn4.m30710equalsimpl0(this.f31170c, dw7Var.f31170c) && this.f31171d == dw7Var.f31171d && this.f31172e == dw7Var.f31172e && md8.areEqual(this.f31173f, dw7Var.f31173f) && w82.m32952equalsimpl0(this.f31174g, dw7Var.f31174g) && q51.m31897equalsimpl0(this.f31175h, dw7Var.f31175h) && this.f31176i == dw7Var.f31176i;
    }

    public final boolean getAutoMirror() {
        return this.f31176i;
    }

    /* JADX INFO: renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m28706getDefaultHeightD9Ej5fM() {
        return this.f31170c;
    }

    /* JADX INFO: renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m28707getDefaultWidthD9Ej5fM() {
        return this.f31169b;
    }

    public final int getGenId$ui_release() {
        return this.f31177j;
    }

    @yfb
    public final String getName() {
        return this.f31168a;
    }

    @yfb
    public final k3i getRoot() {
        return this.f31173f;
    }

    /* JADX INFO: renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m28708getTintBlendMode0nO6VwU() {
        return this.f31175h;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m28709getTintColor0d7_KjU() {
        return this.f31174g;
    }

    public final float getViewportHeight() {
        return this.f31172e;
    }

    public final float getViewportWidth() {
        return this.f31171d;
    }

    public int hashCode() {
        return (((((((((((((((this.f31168a.hashCode() * 31) + kn4.m30711hashCodeimpl(this.f31169b)) * 31) + kn4.m30711hashCodeimpl(this.f31170c)) * 31) + Float.hashCode(this.f31171d)) * 31) + Float.hashCode(this.f31172e)) * 31) + this.f31173f.hashCode()) * 31) + w82.m32958hashCodeimpl(this.f31174g)) * 31) + q51.m31898hashCodeimpl(this.f31175h)) * 31) + Boolean.hashCode(this.f31176i);
    }

    private dw7(String str, float f, float f2, float f3, float f4, k3i k3iVar, long j, int i, boolean z, int i2) {
        this.f31168a = str;
        this.f31169b = f;
        this.f31170c = f2;
        this.f31171d = f3;
        this.f31172e = f4;
        this.f31173f = k3iVar;
        this.f31174g = j;
        this.f31175h = i;
        this.f31176i = z;
        this.f31177j = i2;
    }

    public /* synthetic */ dw7(String str, float f, float f2, float f3, float f4, k3i k3iVar, long j, int i, boolean z, int i2, int i3, jt3 jt3Var) {
        this(str, f, f2, f3, f4, k3iVar, j, i, z, (i3 & 512) != 0 ? f31165k.generateImageVectorId$ui_release() : i2, null);
    }
}
