package p000;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.TimeUnit;
import p000.a32;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@wxa(subcomponents = {rr2.class})
public abstract class x84 {

    /* JADX INFO: renamed from: a */
    public static final String f97163a = "mac-address";

    /* JADX INFO: renamed from: b */
    public static final String f97164b = "operation-timeout";

    /* JADX INFO: renamed from: c */
    public static final String f97165c = "disconnect-timeout";

    /* JADX INFO: renamed from: d */
    public static final String f97166d = "connect-timeout";

    /* JADX INFO: renamed from: e */
    public static final int f97167e = 30;

    /* JADX INFO: renamed from: f */
    public static final int f97168f = 10;

    /* JADX INFO: renamed from: g */
    public static final int f97169g = 35;

    /* JADX INFO: renamed from: x84$a */
    public class C14983a implements os2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q01 f97170a;

        public C14983a(q01 q01Var) {
            this.f97170a = q01Var;
        }

        @Override // p000.os2
        public void onConnectionStateChange(uee.EnumC13520d enumC13520d) {
            this.f97170a.accept(enumC13520d);
        }
    }

    @pid
    /* JADX INFO: renamed from: c */
    public static BluetoothDevice m25035c(@w8b(f97163a) String str, hee heeVar) {
        return heeVar.getRemoteDevice(str);
    }

    @n94
    @pid
    /* JADX INFO: renamed from: d */
    public static os2 m25036d(q01<uee.EnumC13520d> q01Var) {
        return new C14983a(q01Var);
    }

    @n94
    @pid
    /* JADX INFO: renamed from: e */
    public static q01<uee.EnumC13520d> m25037e() {
        return q01.createDefault(uee.EnumC13520d.DISCONNECTED);
    }

    @pid
    @w8b(f97166d)
    /* JADX INFO: renamed from: f */
    public static y1h m25038f(@w8b(a32.C0034g.f248b) woe woeVar) {
        return new y1h(35L, TimeUnit.SECONDS, woeVar);
    }

    @pid
    @w8b(f97165c)
    /* JADX INFO: renamed from: g */
    public static y1h m25039g(@w8b(a32.C0034g.f248b) woe woeVar) {
        return new y1h(10L, TimeUnit.SECONDS, woeVar);
    }

    @a31
    /* JADX INFO: renamed from: a */
    public abstract at2 m25040a(ft2 ft2Var);

    @a31
    /* JADX INFO: renamed from: b */
    public abstract yee m25041b(bfe bfeVar);
}
