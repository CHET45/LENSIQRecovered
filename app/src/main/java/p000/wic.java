package p000;

import java.util.ArrayList;
import java.util.List;
import p000.qjc;

/* JADX INFO: loaded from: classes.dex */
public final class wic {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ArrayList<qjc> f94359a = new ArrayList<>(32);

    @yfb
    public final wic arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f94359a.add(new qjc.C11497a(f, f2, f3, z, z2, f4, f5));
        return this;
    }

    @yfb
    public final wic arcToRelative(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f94359a.add(new qjc.C11506j(f, f2, f3, z, z2, f4, f5));
        return this;
    }

    @yfb
    public final wic close() {
        this.f94359a.add(qjc.C11498b.f74634c);
        return this;
    }

    @yfb
    public final wic curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f94359a.add(new qjc.C11499c(f, f2, f3, f4, f5, f6));
        return this;
    }

    @yfb
    public final wic curveToRelative(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f94359a.add(new qjc.C11507k(f, f2, f3, f4, f5, f6));
        return this;
    }

    @yfb
    public final List<qjc> getNodes() {
        return this.f94359a;
    }

    @yfb
    public final wic horizontalLineTo(float f) {
        this.f94359a.add(new qjc.C11500d(f));
        return this;
    }

    @yfb
    public final wic horizontalLineToRelative(float f) {
        this.f94359a.add(new qjc.C11508l(f));
        return this;
    }

    @yfb
    public final wic lineTo(float f, float f2) {
        this.f94359a.add(new qjc.C11501e(f, f2));
        return this;
    }

    @yfb
    public final wic lineToRelative(float f, float f2) {
        this.f94359a.add(new qjc.C11509m(f, f2));
        return this;
    }

    @yfb
    public final wic moveTo(float f, float f2) {
        this.f94359a.add(new qjc.C11502f(f, f2));
        return this;
    }

    @yfb
    public final wic moveToRelative(float f, float f2) {
        this.f94359a.add(new qjc.C11510n(f, f2));
        return this;
    }

    @yfb
    public final wic quadTo(float f, float f2, float f3, float f4) {
        this.f94359a.add(new qjc.C11503g(f, f2, f3, f4));
        return this;
    }

    @yfb
    public final wic quadToRelative(float f, float f2, float f3, float f4) {
        this.f94359a.add(new qjc.C11511o(f, f2, f3, f4));
        return this;
    }

    @yfb
    public final wic reflectiveCurveTo(float f, float f2, float f3, float f4) {
        this.f94359a.add(new qjc.C11504h(f, f2, f3, f4));
        return this;
    }

    @yfb
    public final wic reflectiveCurveToRelative(float f, float f2, float f3, float f4) {
        this.f94359a.add(new qjc.C11512p(f, f2, f3, f4));
        return this;
    }

    @yfb
    public final wic reflectiveQuadTo(float f, float f2) {
        this.f94359a.add(new qjc.C11505i(f, f2));
        return this;
    }

    @yfb
    public final wic reflectiveQuadToRelative(float f, float f2) {
        this.f94359a.add(new qjc.C11513q(f, f2));
        return this;
    }

    @yfb
    public final wic verticalLineTo(float f) {
        this.f94359a.add(new qjc.C11515s(f));
        return this;
    }

    @yfb
    public final wic verticalLineToRelative(float f) {
        this.f94359a.add(new qjc.C11514r(f));
        return this;
    }
}
