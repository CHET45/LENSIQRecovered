package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dug {

    /* JADX INFO: renamed from: b */
    public static final int f30921b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final np9<pm1, hug> f30922a;

    public dug() {
        this(0, 1, null);
    }

    @gib
    public final hug get(@yfb gug gugVar) {
        hug hugVar = this.f30922a.get(new pm1(gugVar));
        if (hugVar == null || hugVar.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return hugVar;
    }

    @gib
    public final hug put(@yfb gug gugVar, @yfb hug hugVar) {
        return this.f30922a.put(new pm1(gugVar), hugVar);
    }

    @gib
    public final hug remove(@yfb gug gugVar) {
        return this.f30922a.remove(new pm1(gugVar));
    }

    public dug(int i) {
        this.f30922a = new np9<>(i);
    }

    public /* synthetic */ dug(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? wug.f95544a : i);
    }
}
