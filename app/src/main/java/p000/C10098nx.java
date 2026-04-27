package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: nx */
/* JADX INFO: loaded from: classes3.dex */
public class C10098nx {
    private C10098nx() {
    }

    /* JADX INFO: renamed from: a */
    public static C14811ww m18170a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C14811ww(parse(jm8Var, bn9Var, r92.f77439a));
    }

    /* JADX INFO: renamed from: b */
    public static C7073hx m18171b(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C7073hx(parse(jm8Var, bn9Var, wh4.f94251a));
    }

    /* JADX INFO: renamed from: c */
    public static C15854yw m18172c(jm8 jm8Var, bn9 bn9Var, int i) throws IOException {
        return new C15854yw(parse(jm8Var, bn9Var, new z87(i)));
    }

    /* JADX INFO: renamed from: d */
    public static C16264zw m18173d(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C16264zw(parse(jm8Var, bn9Var, d88.f28738a));
    }

    /* JADX INFO: renamed from: e */
    public static C4992dx m18174e(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C4992dx(ls8.m16340a(jm8Var, bn9Var, e1i.dpScale(), m1d.f59643a, true));
    }

    /* JADX INFO: renamed from: f */
    public static C5504ex m18175f(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C5504ex((List<hs8<xme>>) parse(jm8Var, bn9Var, yme.f102070a));
    }

    /* JADX INFO: renamed from: g */
    public static C6011fx m18176g(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return new C6011fx(parse(jm8Var, e1i.dpScale(), bn9Var, s8f.f80953a));
    }

    private static <T> List<hs8<T>> parse(jm8 jm8Var, bn9 bn9Var, r2i<T> r2iVar) throws IOException {
        return ls8.m16340a(jm8Var, bn9Var, 1.0f, r2iVar, false);
    }

    public static C15326xw parseFloat(jm8 jm8Var, bn9 bn9Var) throws IOException {
        return parseFloat(jm8Var, bn9Var, true);
    }

    private static <T> List<hs8<T>> parse(jm8 jm8Var, float f, bn9 bn9Var, r2i<T> r2iVar) throws IOException {
        return ls8.m16340a(jm8Var, bn9Var, f, r2iVar, false);
    }

    public static C15326xw parseFloat(jm8 jm8Var, bn9 bn9Var, boolean z) throws IOException {
        return new C15326xw(parse(jm8Var, z ? e1i.dpScale() : 1.0f, bn9Var, v46.f89900a));
    }
}
