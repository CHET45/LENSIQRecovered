package p000;

import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class bo6 {

    /* JADX INFO: renamed from: a */
    public final List<v8f> f14243a;

    /* JADX INFO: renamed from: b */
    public final char f14244b;

    /* JADX INFO: renamed from: c */
    public final double f14245c;

    /* JADX INFO: renamed from: d */
    public final double f14246d;

    /* JADX INFO: renamed from: e */
    public final String f14247e;

    /* JADX INFO: renamed from: f */
    public final String f14248f;

    public bo6(List<v8f> list, char c, double d, double d2, String str, String str2) {
        this.f14243a = list;
        this.f14244b = c;
        this.f14245c = d;
        this.f14246d = d2;
        this.f14247e = str;
        this.f14248f = str2;
    }

    public static int hashFor(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<v8f> getShapes() {
        return this.f14243a;
    }

    public double getWidth() {
        return this.f14246d;
    }

    public int hashCode() {
        return hashFor(this.f14244b, this.f14248f, this.f14247e);
    }
}
