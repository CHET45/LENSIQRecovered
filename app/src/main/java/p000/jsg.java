package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n74#2,5:438\n80#2:444\n74#2,7:445\n1#3:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n412#1:438,5\n412#1:444\n416#1:445,7\n*E\n"})
@e0g(parameters = 0)
public final class jsg extends lu0<jsg> {

    /* JADX INFO: renamed from: m */
    public static final int f51762m = 8;

    /* JADX INFO: renamed from: k */
    @yfb
    public final zsg f51763k;

    /* JADX INFO: renamed from: l */
    @gib
    public final iug f51764l;

    public /* synthetic */ jsg(zsg zsgVar, nzb nzbVar, iug iugVar, ivg ivgVar, int i, jt3 jt3Var) {
        this(zsgVar, (i & 2) != 0 ? nzb.f66113a.getIdentity() : nzbVar, iugVar, (i & 8) != 0 ? new ivg() : ivgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int jumpByPagesOffset(p000.iug r6, int r7) {
        /*
            r5 = this;
            mv8 r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            mv8 r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            rud r2 = p000.mv8.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            rud$a r0 = p000.rud.f79687e
            rud r2 = r0.getZero()
        L1b:
            nzb r0 = r5.getOffsetMapping()
            zsg r1 = r5.f51763k
            long r3 = r1.m33527getSelectiond9O1mEE()
            int r1 = p000.jvg.m30588getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            hug r1 = r6.getValue()
            rud r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m32206getSizeNHjbRc()
            float r2 = p000.wpf.m33066getHeightimpl(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            nzb r7 = r5.getOffsetMapping()
            hug r6 = r6.getValue()
            long r0 = p000.mzb.Offset(r1, r0)
            int r6 = r6.m30129getOffsetForPositionk4lQ0M(r0)
            int r6 = r7.transformedToOriginal(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jsg.jumpByPagesOffset(iug, int):int");
    }

    @gib
    public final List<lw4> deleteIfSelectedOr(@yfb qy6<? super jsg, ? extends lw4> qy6Var) {
        if (!jvg.m30587getCollapsedimpl(m30891getSelectiond9O1mEE())) {
            return l82.listOf((Object[]) new lw4[]{new ac2("", 0), new s6f(jvg.m30591getMinimpl(m30891getSelectiond9O1mEE()), jvg.m30591getMinimpl(m30891getSelectiond9O1mEE()))});
        }
        lw4 lw4VarInvoke = qy6Var.invoke(this);
        if (lw4VarInvoke != null) {
            return k82.listOf(lw4VarInvoke);
        }
        return null;
    }

    @yfb
    public final zsg getCurrentValue() {
        return this.f51763k;
    }

    @gib
    public final iug getLayoutResultProxy() {
        return this.f51764l;
    }

    @yfb
    public final zsg getValue() {
        return zsg.m33523copy3r_uNRQ$default(this.f51763k, getAnnotatedString(), m30891getSelectiond9O1mEE(), (jvg) null, 4, (Object) null);
    }

    @yfb
    public final jsg moveCursorDownByPage() {
        iug iugVar;
        if (getText$foundation_release().length() > 0 && (iugVar = this.f51764l) != null) {
            m16388f(jumpByPagesOffset(iugVar, 1));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @yfb
    public final jsg moveCursorUpByPage() {
        iug iugVar;
        if (getText$foundation_release().length() > 0 && (iugVar = this.f51764l) != null) {
            m16388f(jumpByPagesOffset(iugVar, -1));
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public jsg(@yfb zsg zsgVar, @yfb nzb nzbVar, @gib iug iugVar, @yfb ivg ivgVar) {
        super(zsgVar.getAnnotatedString(), zsgVar.m33527getSelectiond9O1mEE(), iugVar != null ? iugVar.getValue() : null, nzbVar, ivgVar, null);
        this.f51763k = zsgVar;
        this.f51764l = iugVar;
    }
}
