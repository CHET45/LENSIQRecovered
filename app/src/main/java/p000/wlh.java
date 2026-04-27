package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.4")
@dwf({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class wlh implements op8 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C14676a f94667f = new C14676a(null);

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f94668a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f94669b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final rp8 f94670c;

    /* JADX INFO: renamed from: d */
    public final boolean f94671d;

    /* JADX INFO: renamed from: e */
    @gib
    public volatile List<? extends mp8> f94672e;

    /* JADX INFO: renamed from: wlh$a */
    public static final class C14676a {

        /* JADX INFO: renamed from: wlh$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f94673a;

            static {
                int[] iArr = new int[rp8.values().length];
                try {
                    iArr[rp8.f78978a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[rp8.f78979b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[rp8.f78980c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f94673a = iArr;
            }
        }

        public /* synthetic */ C14676a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final String toString(@yfb op8 op8Var) {
            md8.checkNotNullParameter(op8Var, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = a.f94673a[op8Var.getVariance().ordinal()];
            if (i == 1) {
                bth bthVar = bth.f14751a;
            } else if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    throw new ceb();
                }
                sb.append("out ");
            }
            sb.append(op8Var.getName());
            return sb.toString();
        }

        private C14676a() {
        }
    }

    public wlh(@gib Object obj, @yfb String str, @yfb rp8 rp8Var, boolean z) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(rp8Var, "variance");
        this.f94668a = obj;
        this.f94669b = str;
        this.f94670c = rp8Var;
        this.f94671d = z;
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof wlh) {
            wlh wlhVar = (wlh) obj;
            if (md8.areEqual(this.f94668a, wlhVar.f94668a) && md8.areEqual(getName(), wlhVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.op8
    @yfb
    public String getName() {
        return this.f94669b;
    }

    @Override // p000.op8
    @yfb
    public List<mp8> getUpperBounds() {
        List list = this.f94672e;
        if (list != null) {
            return list;
        }
        List<mp8> listListOf = k82.listOf(vvd.nullableTypeOf(Object.class));
        this.f94672e = listListOf;
        return listListOf;
    }

    @Override // p000.op8
    @yfb
    public rp8 getVariance() {
        return this.f94670c;
    }

    public int hashCode() {
        Object obj = this.f94668a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // p000.op8
    public boolean isReified() {
        return this.f94671d;
    }

    public final void setUpperBounds(@yfb List<? extends mp8> list) {
        md8.checkNotNullParameter(list, "upperBounds");
        if (this.f94672e == null) {
            this.f94672e = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @yfb
    public String toString() {
        return f94667f.toString(this);
    }
}
