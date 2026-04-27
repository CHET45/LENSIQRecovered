package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
@dwf({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,154:1\n1#2:155\n168#3:156\n168#3:157\n482#3:158\n198#4:159\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n74#1:156\n77#1:157\n89#1:158\n96#1:159\n*E\n"})
public interface zz8 extends InterfaceC0761n {
    @yfb
    /* JADX INFO: renamed from: measure-0kLqBqw */
    List<AbstractC0767t> mo27165measure0kLqBqw(int i, long j);

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo27168toDpGaN1DYA(long j) {
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA())) {
            return kn4.m30705constructorimpl(jwg.m30613getValueimpl(j) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo27170toDpu2uoSUM(int i) {
        return kn4.m30705constructorimpl(i / getDensity());
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo27171toDpSizekrfVVM(long j) {
        return j != j28.f49422d ? mn4.m30998DpSizeYgX7TsA(mo27169toDpu2uoSUM(wpf.m33069getWidthimpl(j)), mo27169toDpu2uoSUM(wpf.m33066getHeightimpl(j))) : pn4.f71480b.m31824getUnspecifiedMYxV2XQ();
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo27174toSizeXkaWNTQ(long j) {
        return j != j28.f49422d ? eqf.Size(mo27173toPx0680j_4(pn4.m31815getWidthD9Ej5fM(j)), mo27173toPx0680j_4(pn4.m31813getHeightD9Ej5fM(j))) : wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo27175toSp0xMU5do(float f) {
        return kwg.getSp(f / getFontScale());
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo27176toSpkPz2Gy4(float f) {
        return kwg.getSp(f / (getFontScale() * getDensity()));
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo27177toSpkPz2Gy4(int i) {
        return kwg.getSp(i / (getFontScale() * getDensity()));
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo27169toDpu2uoSUM(float f) {
        return kn4.m30705constructorimpl(f / getDensity());
    }
}
