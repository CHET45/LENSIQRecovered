package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q2c extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public q2c(String str, @bfb Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public q2c(@bfb Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th);
    }
}
