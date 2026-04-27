package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n127#1:144\n33#2,6:132\n69#2,4:138\n74#2:143\n1#3:142\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n98#1:144\n50#1:132,6\n74#1:138,4\n74#1:143\n*E\n"})
@e0g(parameters = 0)
public final class bca implements bbc {

    /* JADX INFO: renamed from: o */
    public static final int f13315o = 8;

    /* JADX INFO: renamed from: a */
    public final int f13316a;

    /* JADX INFO: renamed from: b */
    public final int f13317b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<AbstractC0767t> f13318c;

    /* JADX INFO: renamed from: d */
    public final long f13319d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f13320e;

    /* JADX INFO: renamed from: f */
    @gib
    public final InterfaceC9407mm.b f13321f;

    /* JADX INFO: renamed from: g */
    @gib
    public final InterfaceC9407mm.c f13322g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final ov8 f13323h;

    /* JADX INFO: renamed from: i */
    public final boolean f13324i;

    /* JADX INFO: renamed from: j */
    public final boolean f13325j;

    /* JADX INFO: renamed from: k */
    public final int f13326k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final int[] f13327l;

    /* JADX INFO: renamed from: m */
    public int f13328m;

    /* JADX INFO: renamed from: n */
    public int f13329n;

    public /* synthetic */ bca(int i, int i2, List list, long j, Object obj, t7c t7cVar, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, ov8 ov8Var, boolean z, jt3 jt3Var) {
        this(i, i2, list, j, obj, t7cVar, bVar, cVar, ov8Var, z);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m27977copy4Tuh3kE(long j, qy6<? super Integer, Integer> qy6Var) {
        int iM27201getXimpl = this.f13325j ? a78.m27201getXimpl(j) : qy6Var.invoke(Integer.valueOf(a78.m27201getXimpl(j))).intValue();
        boolean z = this.f13325j;
        int iM27202getYimpl = a78.m27202getYimpl(j);
        if (z) {
            iM27202getYimpl = qy6Var.invoke(Integer.valueOf(iM27202getYimpl)).intValue();
        }
        return b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
    }

    private final int getMainAxisSize(AbstractC0767t abstractC0767t) {
        return this.f13325j ? abstractC0767t.getHeight() : abstractC0767t.getWidth();
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m27978getOffsetBjo55l4(int i) {
        int[] iArr = this.f13327l;
        int i2 = i * 2;
        return b78.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    public final void applyScrollDelta(int i) {
        this.f13328m = getOffset() + i;
        int length = this.f13327l.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.f13325j;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                int[] iArr = this.f13327l;
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.f13326k;
    }

    @Override // p000.bbc
    public int getIndex() {
        return this.f13316a;
    }

    @Override // p000.bbc
    @yfb
    public Object getKey() {
        return this.f13320e;
    }

    @Override // p000.bbc
    public int getOffset() {
        return this.f13328m;
    }

    public final int getSize() {
        return this.f13317b;
    }

    public final void place(@yfb AbstractC0767t.a aVar) {
        if (this.f13329n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.f13318c.size();
        for (int i = 0; i < size; i++) {
            AbstractC0767t abstractC0767t = this.f13318c.get(i);
            long jM27978getOffsetBjo55l4 = m27978getOffsetBjo55l4(i);
            if (this.f13324i) {
                jM27978getOffsetBjo55l4 = b78.IntOffset(this.f13325j ? a78.m27201getXimpl(jM27978getOffsetBjo55l4) : (this.f13329n - a78.m27201getXimpl(jM27978getOffsetBjo55l4)) - getMainAxisSize(abstractC0767t), this.f13325j ? (this.f13329n - a78.m27202getYimpl(jM27978getOffsetBjo55l4)) - getMainAxisSize(abstractC0767t) : a78.m27202getYimpl(jM27978getOffsetBjo55l4));
            }
            long jM27205plusqkQi6aY = a78.m27205plusqkQi6aY(jM27978getOffsetBjo55l4, this.f13319d);
            if (this.f13325j) {
                AbstractC0767t.a.m27715placeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY, 0.0f, (qy6) null, 6, (Object) null);
            } else {
                AbstractC0767t.a.m27713placeRelativeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY, 0.0f, (qy6) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i, int i2, int i3) {
        int width;
        this.f13328m = i;
        this.f13329n = this.f13325j ? i3 : i2;
        List<AbstractC0767t> list = this.f13318c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0767t abstractC0767t = list.get(i4);
            int i5 = i4 * 2;
            if (this.f13325j) {
                int[] iArr = this.f13327l;
                InterfaceC9407mm.b bVar = this.f13321f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i5] = bVar.align(abstractC0767t.getWidth(), i2, this.f13323h);
                this.f13327l[i5 + 1] = i;
                width = abstractC0767t.getHeight();
            } else {
                int[] iArr2 = this.f13327l;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                InterfaceC9407mm.c cVar = this.f13322g;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i6] = cVar.align(abstractC0767t.getHeight(), i3);
                width = abstractC0767t.getWidth();
            }
            i += width;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bca(int i, int i2, List<? extends AbstractC0767t> list, long j, Object obj, t7c t7cVar, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, ov8 ov8Var, boolean z) {
        this.f13316a = i;
        this.f13317b = i2;
        this.f13318c = list;
        this.f13319d = j;
        this.f13320e = obj;
        this.f13321f = bVar;
        this.f13322g = cVar;
        this.f13323h = ov8Var;
        this.f13324i = z;
        this.f13325j = t7cVar == t7c.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0767t abstractC0767t = (AbstractC0767t) list.get(i3);
            iMax = Math.max(iMax, !this.f13325j ? abstractC0767t.getHeight() : abstractC0767t.getWidth());
        }
        this.f13326k = iMax;
        this.f13327l = new int[this.f13318c.size() * 2];
        this.f13329n = Integer.MIN_VALUE;
    }
}
