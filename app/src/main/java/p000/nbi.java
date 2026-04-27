package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class nbi {

    /* JADX INFO: renamed from: a */
    public float f63937a;

    /* JADX INFO: renamed from: b */
    public int f63938b;

    /* JADX INFO: renamed from: c */
    public int f63939c;

    /* JADX INFO: renamed from: d */
    public int f63940d;

    /* JADX INFO: renamed from: e */
    public int f63941e;

    public void getState(View v) {
        this.f63938b = v.getLeft();
        this.f63939c = v.getTop();
        this.f63940d = v.getRight();
        this.f63941e = v.getBottom();
        this.f63937a = v.getRotation();
    }

    public int height() {
        return this.f63941e - this.f63939c;
    }

    public int width() {
        return this.f63940d - this.f63938b;
    }
}
