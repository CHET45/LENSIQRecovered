package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Arrays;
import p000.p99;

/* JADX INFO: loaded from: classes4.dex */
public class bbi<T> implements p99.InterfaceC10860b<T>, gqf {

    /* JADX INFO: renamed from: a */
    public int[] f13277a;

    /* JADX INFO: renamed from: b */
    public C1825a f13278b;

    /* JADX INFO: renamed from: bbi$a */
    public static final class C1825a extends he3<View, Object> {
        public C1825a(@efb View view) {
            super(view);
        }

        @Override // p000.he3
        /* JADX INFO: renamed from: a */
        public void mo3030a(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onLoadFailed(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onResourceReady(@efb Object obj, @hib afh<? super Object> afhVar) {
        }
    }

    public bbi() {
    }

    @Override // p000.p99.InterfaceC10860b
    @hib
    public int[] getPreloadSize(@efb T t, int i, int i2) {
        int[] iArr = this.f13277a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // p000.gqf
    public void onSizeReady(int i, int i2) {
        this.f13277a = new int[]{i, i2};
        this.f13278b = null;
    }

    public void setView(@efb View view) {
        if (this.f13277a == null && this.f13278b == null) {
            C1825a c1825a = new C1825a(view);
            this.f13278b = c1825a;
            c1825a.getSize(this);
        }
    }

    public bbi(@efb View view) {
        C1825a c1825a = new C1825a(view);
        this.f13278b = c1825a;
        c1825a.getSize(this);
    }
}
