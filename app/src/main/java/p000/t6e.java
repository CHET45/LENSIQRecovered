package p000;

import java.util.List;
import p000.hpi;
import p000.m74;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class t6e {

    /* JADX INFO: renamed from: a */
    public static final int f83825a = 1055;

    /* JADX INFO: renamed from: b */
    public static final v27.C13829h<m74.C9199p, v6e> f83826b;

    /* JADX INFO: renamed from: c */
    public static final int f83827c = 1053;

    /* JADX INFO: renamed from: d */
    public static final v27.C13829h<m74.C9207v, List<d6e>> f83828d;

    /* JADX INFO: renamed from: e */
    public static final int f83829e = 1053;

    /* JADX INFO: renamed from: f */
    public static final v27.C13829h<m74.C9211z, d6e> f83830f;

    static {
        m74.C9199p defaultInstance = m74.C9199p.getDefaultInstance();
        v6e defaultInstance2 = v6e.getDefaultInstance();
        v6e defaultInstance3 = v6e.getDefaultInstance();
        hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44488N;
        f83826b = v27.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, f83825a, enumC6968b, v6e.class);
        f83828d = v27.newRepeatedGeneratedExtension(m74.C9207v.getDefaultInstance(), d6e.getDefaultInstance(), null, 1053, enumC6968b, false, d6e.class);
        f83830f = v27.newSingularGeneratedExtension(m74.C9211z.getDefaultInstance(), d6e.getDefaultInstance(), d6e.getDefaultInstance(), null, 1053, enumC6968b, d6e.class);
    }

    private t6e() {
    }

    public static void registerAllExtensions(zi5 zi5Var) {
        zi5Var.add((v27.C13829h<?, ?>) f83826b);
        zi5Var.add((v27.C13829h<?, ?>) f83828d);
        zi5Var.add((v27.C13829h<?, ?>) f83830f);
    }
}
