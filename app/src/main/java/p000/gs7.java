package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes6.dex */
public class gs7 {

    /* JADX INFO: renamed from: a */
    public final is7 f40905a;

    /* JADX INFO: renamed from: gs7$a */
    public class C6482a implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BluetoothGattCharacteristic f40906a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f40907b;

        public C6482a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            this.f40906a = bluetoothGattCharacteristic;
            this.f40907b = i;
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            j51 j51VarHandleMismatchData;
            int properties = this.f40906a.getProperties();
            int i = this.f40907b;
            if ((properties & i) == 0 && (j51VarHandleMismatchData = gs7.this.f40905a.handleMismatchData(this.f40906a, i)) != null) {
                throw j51VarHandleMismatchData;
            }
        }
    }

    @b28
    public gs7(is7 is7Var) {
        this.f40905a = is7Var;
    }

    public xd2 checkAnyPropertyMatches(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return xd2.fromAction(new C6482a(bluetoothGattCharacteristic, i));
    }
}
