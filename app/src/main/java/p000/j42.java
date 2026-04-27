package p000;

import java.util.List;
import p000.hpi;
import p000.m74;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class j42 {

    /* JADX INFO: renamed from: a */
    public static final int f49496a = 1051;

    /* JADX INFO: renamed from: b */
    public static final v27.C13829h<m74.C9176d0, List<String>> f49497b;

    /* JADX INFO: renamed from: c */
    public static final int f49498c = 1049;

    /* JADX INFO: renamed from: d */
    public static final v27.C13829h<m74.C9192l0, String> f49499d;

    /* JADX INFO: renamed from: e */
    public static final int f49500e = 1050;

    /* JADX INFO: renamed from: f */
    public static final v27.C13829h<m74.C9192l0, String> f49501f;

    static {
        m74.C9176d0 defaultInstance = m74.C9176d0.getDefaultInstance();
        hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
        f49497b = v27.newRepeatedGeneratedExtension(defaultInstance, null, null, f49496a, enumC6968b, false, String.class);
        f49499d = v27.newSingularGeneratedExtension(m74.C9192l0.getDefaultInstance(), "", null, null, 1049, enumC6968b, String.class);
        f49501f = v27.newSingularGeneratedExtension(m74.C9192l0.getDefaultInstance(), "", null, null, f49500e, enumC6968b, String.class);
    }

    private j42() {
    }

    public static void registerAllExtensions(zi5 zi5Var) {
        zi5Var.add((v27.C13829h<?, ?>) f49497b);
        zi5Var.add((v27.C13829h<?, ?>) f49499d);
        zi5Var.add((v27.C13829h<?, ?>) f49501f);
    }
}
