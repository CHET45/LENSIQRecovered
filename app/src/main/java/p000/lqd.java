package p000;

import android.bluetooth.BluetoothAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class lqd {

    /* JADX INFO: renamed from: e */
    public static final int f58467e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f58468f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f58469g = 2;

    /* JADX INFO: renamed from: a */
    public int f58470a;

    /* JADX INFO: renamed from: b */
    public String f58471b;

    /* JADX INFO: renamed from: c */
    public boolean f58472c;

    /* JADX INFO: renamed from: d */
    public int f58473d;

    public lqd(int i, String str) {
        this(i, str, false);
    }

    public boolean checkIsValid() {
        return BluetoothAdapter.checkBluetoothAddress(this.f58471b);
    }

    public lqd cloneObject() {
        return new lqd(this.f58470a, this.f58471b, this.f58472c).setState(this.f58473d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lqd lqdVar = (lqd) obj;
            if (this.f58470a == lqdVar.f58470a && Objects.equals(this.f58471b, lqdVar.f58471b)) {
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return this.f58471b;
    }

    public int getState() {
        return this.f58473d;
    }

    public int getWay() {
        return this.f58470a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58470a), this.f58471b);
    }

    public boolean isUseADV() {
        return this.f58472c;
    }

    public lqd setAddress(String str) {
        this.f58471b = str;
        return this;
    }

    public lqd setState(int i) {
        this.f58473d = i;
        return this;
    }

    public lqd setUseADV(boolean z) {
        this.f58472c = z;
        return this;
    }

    public lqd setWay(int i) {
        this.f58470a = i;
        return this;
    }

    public String toString() {
        return "ReConnectDevMsg{way=" + this.f58470a + ", address='" + this.f58471b + "', isUseADV=" + this.f58472c + ", state=" + this.f58473d + '}';
    }

    public lqd(int i, String str, boolean z) {
        setWay(i).setAddress(str).setUseADV(z);
    }
}
