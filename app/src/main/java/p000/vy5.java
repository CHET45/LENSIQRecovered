package p000;

/* JADX INFO: loaded from: classes5.dex */
public class vy5 extends rx5 {

    /* JADX INFO: renamed from: a */
    @efb
    public final EnumC14299a f92657a;

    /* JADX INFO: renamed from: vy5$a */
    public enum EnumC14299a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public vy5(@efb EnumC14299a enumC14299a) {
        this.f92657a = enumC14299a;
    }

    @efb
    public EnumC14299a getStatus() {
        return this.f92657a;
    }

    public vy5(@efb String str, @efb EnumC14299a enumC14299a) {
        super(str);
        this.f92657a = enumC14299a;
    }

    public vy5(@efb String str, @efb EnumC14299a enumC14299a, @efb Throwable th) {
        super(str, th);
        this.f92657a = enumC14299a;
    }
}
