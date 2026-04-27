package p000;

/* JADX INFO: loaded from: classes.dex */
public class kce {

    /* JADX INFO: renamed from: i */
    public static final int f53611i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a */
    public int f53612a = 0;

    /* JADX INFO: renamed from: b */
    public int f53613b = 0;

    /* JADX INFO: renamed from: c */
    public int f53614c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f53615d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f53616e = 0;

    /* JADX INFO: renamed from: f */
    public int f53617f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f53618g = false;

    /* JADX INFO: renamed from: h */
    public boolean f53619h = false;

    public int getEnd() {
        return this.f53618g ? this.f53612a : this.f53613b;
    }

    public int getLeft() {
        return this.f53612a;
    }

    public int getRight() {
        return this.f53613b;
    }

    public int getStart() {
        return this.f53618g ? this.f53613b : this.f53612a;
    }

    public void setAbsolute(int i, int i2) {
        this.f53619h = false;
        if (i != Integer.MIN_VALUE) {
            this.f53616e = i;
            this.f53612a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f53617f = i2;
            this.f53613b = i2;
        }
    }

    public void setDirection(boolean z) {
        if (z == this.f53618g) {
            return;
        }
        this.f53618g = z;
        if (!this.f53619h) {
            this.f53612a = this.f53616e;
            this.f53613b = this.f53617f;
            return;
        }
        if (z) {
            int i = this.f53615d;
            if (i == Integer.MIN_VALUE) {
                i = this.f53616e;
            }
            this.f53612a = i;
            int i2 = this.f53614c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f53617f;
            }
            this.f53613b = i2;
            return;
        }
        int i3 = this.f53614c;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f53616e;
        }
        this.f53612a = i3;
        int i4 = this.f53615d;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f53617f;
        }
        this.f53613b = i4;
    }

    public void setRelative(int i, int i2) {
        this.f53614c = i;
        this.f53615d = i2;
        this.f53619h = true;
        if (this.f53618g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f53612a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f53613b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f53612a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f53613b = i2;
        }
    }
}
