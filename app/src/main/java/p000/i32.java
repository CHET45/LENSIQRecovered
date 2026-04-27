package p000;

import android.content.ContentResolver;
import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class i32 implements jo5<ContentResolver> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f45569a;

    public i32(hid<Context> hidVar) {
        this.f45569a = hidVar;
    }

    public static i32 create(hid<Context> hidVar) {
        return new i32(hidVar);
    }

    public static ContentResolver provideContentResolver(Context context) {
        return (ContentResolver) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m101m(context));
    }

    @Override // p000.hid
    public ContentResolver get() {
        return provideContentResolver(this.f45569a.get());
    }
}
