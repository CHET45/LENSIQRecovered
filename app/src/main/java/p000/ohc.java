package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ohc extends ArrayList<nhc> {

    /* JADX INFO: renamed from: b */
    public static final int f67643b = 16;

    /* JADX INFO: renamed from: a */
    public final int f67644a;

    public ohc(int i, int i2) {
        super(i);
        this.f67644a = i2;
    }

    public static ohc noTracking() {
        return new ohc(0, 0);
    }

    public static ohc tracking(int i) {
        return new ohc(16, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18677a() {
        return size() < this.f67644a;
    }

    /* JADX INFO: renamed from: b */
    public int m18678b() {
        return this.f67644a;
    }
}
