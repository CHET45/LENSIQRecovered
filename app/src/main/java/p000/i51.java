package p000;

/* JADX INFO: loaded from: classes6.dex */
public class i51 {

    /* JADX INFO: renamed from: b */
    public static final i51 f45759b = new i51("CONNECTION_STATE");

    /* JADX INFO: renamed from: c */
    public static final i51 f45760c = new i51("SERVICE_DISCOVERY");

    /* JADX INFO: renamed from: d */
    public static final i51 f45761d = new i51("CHARACTERISTIC_READ");

    /* JADX INFO: renamed from: e */
    public static final i51 f45762e = new i51("CHARACTERISTIC_WRITE");

    /* JADX INFO: renamed from: f */
    public static final i51 f45763f = new i51("CHARACTERISTIC_LONG_WRITE");

    /* JADX INFO: renamed from: g */
    public static final i51 f45764g = new i51("CHARACTERISTIC_CHANGED");

    /* JADX INFO: renamed from: h */
    public static final i51 f45765h = new i51("DESCRIPTOR_READ");

    /* JADX INFO: renamed from: i */
    public static final i51 f45766i = new i51("DESCRIPTOR_WRITE");

    /* JADX INFO: renamed from: j */
    public static final i51 f45767j = new i51("RELIABLE_WRITE_COMPLETED");

    /* JADX INFO: renamed from: k */
    public static final i51 f45768k = new i51("READ_RSSI");

    /* JADX INFO: renamed from: l */
    public static final i51 f45769l = new i51("ON_MTU_CHANGED");

    /* JADX INFO: renamed from: m */
    public static final i51 f45770m = new i51("CONNECTION_PRIORITY_CHANGE");

    /* JADX INFO: renamed from: a */
    public final String f45771a;

    private i51(String str) {
        this.f45771a = str;
    }

    public String toString() {
        return "BleGattOperation{description='" + this.f45771a + "'}";
    }
}
