package p000;

import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class w67 {

    /* JADX INFO: renamed from: f */
    public static final w67 f93396f = new w67(-1, -1, -1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f93397a;

    /* JADX INFO: renamed from: b */
    public final int f93398b;

    /* JADX INFO: renamed from: c */
    public final int f93399c;

    /* JADX INFO: renamed from: d */
    public final int f93400d;

    /* JADX INFO: renamed from: e */
    public final int f93401e;

    public w67(int i, int i2, int i3, int i4, int i5) {
        this.f93397a = i;
        this.f93398b = i2;
        this.f93399c = i3;
        this.f93400d = i4;
        this.f93401e = i5;
    }

    public void release() throws x67.C14938a {
        int i = this.f93397a;
        if (i != -1) {
            x67.deleteTexture(i);
        }
        int i2 = this.f93398b;
        if (i2 != -1) {
            x67.deleteFbo(i2);
        }
        int i3 = this.f93399c;
        if (i3 != -1) {
            x67.deleteRbo(i3);
        }
    }
}
