package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a6e extends ha3 {

    /* JADX INFO: renamed from: M */
    public int f509M;

    /* JADX INFO: renamed from: N */
    public int f510N;

    /* JADX INFO: renamed from: Q */
    public LayoutInflater f511Q;

    @Deprecated
    public a6e(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f510N = i;
        this.f509M = i;
        this.f511Q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000.ha3
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f511Q.inflate(this.f510N, viewGroup, false);
    }

    @Override // p000.ha3
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f511Q.inflate(this.f509M, viewGroup, false);
    }

    public void setDropDownViewResource(int i) {
        this.f510N = i;
    }

    public void setViewResource(int i) {
        this.f509M = i;
    }

    @Deprecated
    public a6e(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f510N = i;
        this.f509M = i;
        this.f511Q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public a6e(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f510N = i;
        this.f509M = i;
        this.f511Q = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
