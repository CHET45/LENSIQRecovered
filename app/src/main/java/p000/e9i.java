package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class e9i extends tai implements i9i {
    public e9i(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: renamed from: b */
    public static e9i m9817b(ViewGroup viewGroup) {
        return (e9i) tai.m22445a(viewGroup);
    }

    @Override // p000.i9i
    public void add(@efb View view) {
        this.f84102a.add(view);
    }

    @Override // p000.i9i
    public void remove(@efb View view) {
        this.f84102a.remove(view);
    }
}
