package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes5.dex */
public final class C12380s implements x03 {

    /* JADX INFO: renamed from: a */
    public final float f80235a;

    public C12380s(float f) {
        this.f80235a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12380s) && this.f80235a == ((C12380s) obj).f80235a;
    }

    @Override // p000.x03
    public float getCornerSize(@efb RectF rectF) {
        return this.f80235a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f80235a)});
    }

    public float getCornerSize() {
        return this.f80235a;
    }
}
