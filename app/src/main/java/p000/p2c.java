package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class p2c extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public p2c(String message, @cfb Throwable e) {
        super(message, e == null ? new NullPointerException() : e);
    }

    public p2c(@cfb Throwable e) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + e, e);
    }
}
