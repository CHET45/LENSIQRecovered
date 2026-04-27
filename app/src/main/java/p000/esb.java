package p000;

/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface esb<Downstream, Upstream> {
    @cfb
    pxb<? super Upstream> apply(@cfb pxb<? super Downstream> observer) throws Throwable;
}
