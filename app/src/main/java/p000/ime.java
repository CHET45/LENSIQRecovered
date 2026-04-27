package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public interface ime<T> extends Callable<T> {
    @Override // java.util.concurrent.Callable
    T call();
}
