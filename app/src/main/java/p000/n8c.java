package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class n8c {

    /* JADX INFO: renamed from: n8c$a */
    public static final class C9741a extends n8c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final vic f63606a;

        public C9741a(@yfb vic vicVar) {
            super(null);
            this.f63606a = vicVar;
        }

        @Override // p000.n8c
        @yfb
        public rud getBounds() {
            return this.f63606a.getBounds();
        }

        @yfb
        public final vic getPath() {
            return this.f63606a;
        }
    }

    /* JADX INFO: renamed from: n8c$b */
    @vw7
    public static final class C9742b extends n8c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final rud f63607a;

        public C9742b(@yfb rud rudVar) {
            super(null);
            this.f63607a = rudVar;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9742b) && md8.areEqual(this.f63607a, ((C9742b) obj).f63607a);
        }

        @Override // p000.n8c
        @yfb
        public rud getBounds() {
            return this.f63607a;
        }

        @yfb
        public final rud getRect() {
            return this.f63607a;
        }

        public int hashCode() {
            return this.f63607a.hashCode();
        }
    }

    /* JADX INFO: renamed from: n8c$c */
    @dwf({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
    @vw7
    public static final class C9743c extends n8c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final mbe f63608a;

        /* JADX INFO: renamed from: b */
        @gib
        public final vic f63609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9743c(@yfb mbe mbeVar) {
            super(0 == true ? 1 : 0);
            vic vicVar = null;
            this.f63608a = mbeVar;
            if (!pbe.isSimple(mbeVar)) {
                vic vicVarPath = C8522ku.Path();
                vic.addRoundRect$default(vicVarPath, mbeVar, null, 2, null);
                vicVar = vicVarPath;
            }
            this.f63609b = vicVar;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9743c) && md8.areEqual(this.f63608a, ((C9743c) obj).f63608a);
        }

        @Override // p000.n8c
        @yfb
        public rud getBounds() {
            return pbe.getBoundingRect(this.f63608a);
        }

        @yfb
        public final mbe getRoundRect() {
            return this.f63608a;
        }

        @gib
        public final vic getRoundRectPath$ui_graphics_release() {
            return this.f63609b;
        }

        public int hashCode() {
            return this.f63608a.hashCode();
        }
    }

    public /* synthetic */ n8c(jt3 jt3Var) {
        this();
    }

    @yfb
    public abstract rud getBounds();

    private n8c() {
    }
}
