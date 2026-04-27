package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class a4g {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C0057a f401c = new C0057a(null);

    /* JADX INFO: renamed from: d */
    public static final int f402d = 8;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final a4g f403e = new a4g(null, null);

    /* JADX INFO: renamed from: a */
    @gib
    public final mv8 f404a;

    /* JADX INFO: renamed from: b */
    @gib
    public final hug f405b;

    /* JADX INFO: renamed from: a4g$a */
    public static final class C0057a {
        public /* synthetic */ C0057a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final a4g getEmpty() {
            return a4g.f403e;
        }

        private C0057a() {
        }
    }

    public a4g(@gib mv8 mv8Var, @gib hug hugVar) {
        this.f404a = mv8Var;
        this.f405b = hugVar;
    }

    public static /* synthetic */ a4g copy$default(a4g a4gVar, mv8 mv8Var, hug hugVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            mv8Var = a4gVar.f404a;
        }
        if ((i & 2) != 0) {
            hugVar = a4gVar.f405b;
        }
        return a4gVar.copy(mv8Var, hugVar);
    }

    @yfb
    public final a4g copy(@gib mv8 mv8Var, @gib hug hugVar) {
        return new a4g(mv8Var, hugVar);
    }

    @gib
    public final mv8 getLayoutCoordinates() {
        return this.f404a;
    }

    @gib
    public vic getPathForRange(int i, int i2) {
        hug hugVar = this.f405b;
        if (hugVar != null) {
            return hugVar.getPathForRange(i, i2);
        }
        return null;
    }

    public boolean getShouldClip() {
        hug hugVar = this.f405b;
        return (hugVar == null || bvg.m28164equalsimpl0(hugVar.getLayoutInput().m29858getOverflowgIe3tQ8(), bvg.f14961b.m28173getVisiblegIe3tQ8()) || !hugVar.getHasVisualOverflow()) ? false : true;
    }

    @gib
    public final hug getTextLayoutResult() {
        return this.f405b;
    }
}
