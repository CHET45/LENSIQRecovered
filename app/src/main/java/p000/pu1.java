package p000;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/5029")
@kyg
public abstract class pu1 {

    /* JADX INFO: renamed from: pu1$a */
    public enum EnumC11124a {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public abstract void log(EnumC11124a enumC11124a, String str);

    public abstract void log(EnumC11124a enumC11124a, String str, Object... objArr);
}
