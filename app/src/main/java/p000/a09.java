package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
@e0g(parameters = 1)
public final class a09 implements zz8, InterfaceC0761n {

    /* JADX INFO: renamed from: e */
    public static final int f17e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final tz8 f18a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lcg f19b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final vz8 f20c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final HashMap<Integer, List<AbstractC0767t>> f21d = new HashMap<>();

    public a09(@yfb tz8 tz8Var, @yfb lcg lcgVar) {
        this.f18a = tz8Var;
        this.f19b = lcgVar;
        this.f20c = tz8Var.getItemProvider().invoke();
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f19b.getDensity();
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f19b.getFontScale();
    }

    @Override // p000.gd8
    @yfb
    public ov8 getLayoutDirection() {
        return this.f19b.getLayoutDirection();
    }

    @Override // p000.gd8
    public boolean isLookingAhead() {
        return this.f19b.isLookingAhead();
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0761n
    @yfb
    public vba layout(int i, int i2, @yfb Map<AbstractC9938nm, Integer> map, @yfb qy6<? super AbstractC0767t.a, bth> qy6Var) {
        return this.f19b.layout(i, i2, map, qy6Var);
    }

    @Override // p000.zz8
    @yfb
    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    public List<AbstractC0767t> mo27165measure0kLqBqw(int i, long j) {
        List<AbstractC0767t> list = this.f21d.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object key = this.f20c.getKey(i);
        List<rba> listSubcompose = this.f19b.subcompose(key, this.f18a.getContent(i, key, this.f20c.getContentType(i)));
        int size = listSubcompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listSubcompose.get(i2).mo27949measureBRTryo0(j));
        }
        this.f21d.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public int mo27166roundToPxR2X_6o(long j) {
        return this.f19b.mo27166roundToPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
    public int mo27167roundToPx0680j_4(float f) {
        return this.f19b.mo27167roundToPx0680j_4(f);
    }

    @Override // p000.zz8, p000.dp6
    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    public float mo27168toDpGaN1DYA(long j) {
        return this.f19b.mo27168toDpGaN1DYA(j);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo27170toDpu2uoSUM(int i) {
        return this.f19b.mo27170toDpu2uoSUM(i);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
    public long mo27171toDpSizekrfVVM(long j) {
        return this.f19b.mo27171toDpSizekrfVVM(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
    public float mo27172toPxR2X_6o(long j) {
        return this.f19b.mo27172toPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
    public float mo27173toPx0680j_4(float f) {
        return this.f19b.mo27173toPx0680j_4(f);
    }

    @Override // p000.c64
    @f0g
    @yfb
    public rud toRect(@yfb on4 on4Var) {
        return this.f19b.toRect(on4Var);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
    public long mo27174toSizeXkaWNTQ(long j) {
        return this.f19b.mo27174toSizeXkaWNTQ(j);
    }

    @Override // p000.zz8, p000.dp6
    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    public long mo27175toSp0xMU5do(float f) {
        return this.f19b.mo27175toSp0xMU5do(f);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo27176toSpkPz2Gy4(float f) {
        return this.f19b.mo27176toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0761n
    @yfb
    public vba layout(int i, int i2, @yfb Map<AbstractC9938nm, Integer> map, @gib qy6<? super rce, bth> qy6Var, @yfb qy6<? super AbstractC0767t.a, bth> qy6Var2) {
        return this.f19b.layout(i, i2, map, qy6Var, qy6Var2);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo27169toDpu2uoSUM(float f) {
        return this.f19b.mo27169toDpu2uoSUM(f);
    }

    @Override // p000.zz8, p000.c64
    /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo27177toSpkPz2Gy4(int i) {
        return this.f19b.mo27177toSpkPz2Gy4(i);
    }
}
