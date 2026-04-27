package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class f9i extends sai implements j9i {
    public f9i(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: renamed from: c */
    public static f9i m10732c(ViewGroup viewGroup) {
        return (f9i) sai.m21802a(viewGroup);
    }

    @Override // p000.j9i
    public void add(@efb View view) {
        this.f81070a.add(view);
    }

    @Override // p000.j9i
    public void remove(@efb View view) {
        this.f81070a.remove(view);
    }
}
