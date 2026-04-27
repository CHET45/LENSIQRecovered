package p000;

import android.util.SizeF;
import com.arthenica.ffmpegkit.StreamInformation;

/* JADX INFO: loaded from: classes.dex */
public final class cqf {

    /* JADX INFO: renamed from: a */
    public final float f27107a;

    /* JADX INFO: renamed from: b */
    public final float f27108b;

    /* JADX INFO: renamed from: cqf$a */
    @c5e(21)
    public static final class C4467a {
        private C4467a() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static SizeF m8664a(@efb cqf cqfVar) {
            z7d.checkNotNull(cqfVar);
            return new SizeF(cqfVar.getWidth(), cqfVar.getHeight());
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: b */
        public static cqf m8665b(@efb SizeF sizeF) {
            z7d.checkNotNull(sizeF);
            return new cqf(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public cqf(float f, float f2) {
        this.f27107a = z7d.checkArgumentFinite(f, StreamInformation.KEY_WIDTH);
        this.f27108b = z7d.checkArgumentFinite(f2, StreamInformation.KEY_HEIGHT);
    }

    @c5e(21)
    @efb
    public static cqf toSizeFCompat(@efb SizeF sizeF) {
        return C4467a.m8665b(sizeF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqf)) {
            return false;
        }
        cqf cqfVar = (cqf) obj;
        return cqfVar.f27107a == this.f27107a && cqfVar.f27108b == this.f27108b;
    }

    public float getHeight() {
        return this.f27108b;
    }

    public float getWidth() {
        return this.f27107a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f27107a) ^ Float.floatToIntBits(this.f27108b);
    }

    @c5e(21)
    @efb
    public SizeF toSizeF() {
        return C4467a.m8664a(this);
    }

    @efb
    public String toString() {
        return this.f27107a + "x" + this.f27108b;
    }
}
