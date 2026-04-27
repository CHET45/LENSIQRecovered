package p000;

import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v67 {

    /* JADX INFO: renamed from: g */
    public static final v67 f90062g = new v67(-1, -1, -1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f90063a;

    /* JADX INFO: renamed from: b */
    public final int f90064b;

    /* JADX INFO: renamed from: c */
    public final int f90065c;

    /* JADX INFO: renamed from: d */
    public final int f90066d;

    /* JADX INFO: renamed from: e */
    public final int f90067e;

    /* JADX INFO: renamed from: f */
    public boolean f90068f;

    public v67(int i, int i2, int i3, int i4, int i5) {
        this.f90063a = i;
        this.f90064b = i2;
        this.f90065c = i3;
        this.f90066d = i4;
        this.f90067e = i5;
    }

    public int getFboId() {
        u80.checkState(!this.f90068f);
        return this.f90064b;
    }

    public int getHeight() {
        u80.checkState(!this.f90068f);
        return this.f90067e;
    }

    public int getRboId() {
        u80.checkState(!this.f90068f);
        return this.f90065c;
    }

    public int getTexId() {
        u80.checkState(!this.f90068f);
        return this.f90063a;
    }

    public int getWidth() {
        u80.checkState(!this.f90068f);
        return this.f90066d;
    }

    public void release() throws y67.C15503b {
        this.f90068f = true;
        int i = this.f90063a;
        if (i != -1) {
            y67.deleteTexture(i);
        }
        int i2 = this.f90064b;
        if (i2 != -1) {
            y67.deleteFbo(i2);
        }
        int i3 = this.f90065c;
        if (i3 != -1) {
            y67.deleteRbo(i3);
        }
    }
}
