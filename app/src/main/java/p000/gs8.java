package p000;

import android.adservices.common.KeyedFrequencyCap;
import java.time.Duration;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15651d
public final class gs8 {

    /* JADX INFO: renamed from: a */
    public final int f40909a;

    /* JADX INFO: renamed from: b */
    public final int f40910b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Duration f40911c;

    public gs8(int i, int i2, @yfb Duration duration) {
        md8.checkNotNullParameter(duration, "interval");
        this.f40909a = i;
        this.f40910b = i2;
        this.f40911c = duration;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        fs8.m11141a();
        KeyedFrequencyCap keyedFrequencyCapBuild = es8.m10223a(this.f40909a, this.f40910b, this.f40911c).build();
        md8.checkNotNullExpressionValue(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs8)) {
            return false;
        }
        gs8 gs8Var = (gs8) obj;
        return this.f40909a == gs8Var.f40909a && this.f40910b == gs8Var.f40910b && md8.areEqual(this.f40911c, gs8Var.f40911c);
    }

    public final int getAdCounterKey() {
        return this.f40909a;
    }

    @yfb
    public final Duration getInterval() {
        return this.f40911c;
    }

    public final int getMaxCount() {
        return this.f40910b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f40909a) * 31) + Integer.hashCode(this.f40910b)) * 31) + this.f40911c.hashCode();
    }

    @yfb
    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.f40909a + ", maxCount=" + this.f40910b + ", interval=" + this.f40911c;
    }
}
