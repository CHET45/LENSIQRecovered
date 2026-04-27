package p000;

import p000.ed3;

/* JADX INFO: loaded from: classes5.dex */
public final class nr8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ed3.C5263a f65366a;

    private nr8(ed3.C5263a c5263a) {
        this.f65366a = c5263a;
    }

    @yfb
    public final ed3 build$com_google_firebase_firebase_crashlytics() {
        ed3 ed3VarBuild = this.f65366a.build();
        md8.checkNotNullExpressionValue(ed3VarBuild, "build(...)");
        return ed3VarBuild;
    }

    public final void key(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "key");
        this.f65366a.putBoolean(str, z);
    }

    public final void key(@yfb String str, double d) {
        md8.checkNotNullParameter(str, "key");
        this.f65366a.putDouble(str, d);
    }

    public nr8() {
        this(new ed3.C5263a());
    }

    public final void key(@yfb String str, float f) {
        md8.checkNotNullParameter(str, "key");
        this.f65366a.putFloat(str, f);
    }

    public final void key(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "key");
        this.f65366a.putInt(str, i);
    }

    public final void key(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "key");
        this.f65366a.putLong(str, j);
    }

    public final void key(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "value");
        this.f65366a.putString(str, str2);
    }
}
