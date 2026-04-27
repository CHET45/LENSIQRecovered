package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import p000.a32;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public class n6c implements m6c {

    /* JADX INFO: renamed from: a */
    public final gfe f63392a;

    /* JADX INFO: renamed from: b */
    public final BluetoothGatt f63393b;

    /* JADX INFO: renamed from: c */
    public final qj9 f63394c;

    /* JADX INFO: renamed from: d */
    public final y1h f63395d;

    /* JADX INFO: renamed from: e */
    public final woe f63396e;

    /* JADX INFO: renamed from: f */
    public final woe f63397f;

    /* JADX INFO: renamed from: g */
    public final hid<zqd> f63398g;

    @b28
    public n6c(gfe gfeVar, BluetoothGatt bluetoothGatt, qj9 qj9Var, @w8b("operation-timeout") y1h y1hVar, @w8b(a32.C0034g.f249c) woe woeVar, @w8b(a32.C0034g.f248b) woe woeVar2, hid<zqd> hidVar) {
        this.f63392a = gfeVar;
        this.f63393b = bluetoothGatt;
        this.f63394c = qj9Var;
        this.f63395d = y1hVar;
        this.f63396e = woeVar;
        this.f63397f = woeVar2;
        this.f63398g = hidVar;
    }

    @Override // p000.m6c
    @c5e(21)
    public gs2 provideConnectionPriorityChangeOperation(int i, long j, TimeUnit timeUnit) {
        return new gs2(this.f63392a, this.f63393b, this.f63395d, i, new y1h(j, timeUnit, this.f63397f));
    }

    @Override // p000.m6c
    public mw1 provideLongWriteOperation(BluetoothGattCharacteristic bluetoothGattCharacteristic, uee.InterfaceC13521e interfaceC13521e, uee.InterfaceC13522f interfaceC13522f, hlc hlcVar, byte[] bArr) {
        return new mw1(this.f63393b, this.f63392a, this.f63396e, this.f63395d, bluetoothGattCharacteristic, hlcVar, interfaceC13521e, interfaceC13522f, bArr);
    }

    @Override // p000.m6c
    @c5e(21)
    public y1b provideMtuChangeOperation(int i) {
        return new y1b(this.f63392a, this.f63393b, this.f63395d, i);
    }

    @Override // p000.m6c
    public pw1 provideReadCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new pw1(this.f63392a, this.f63393b, this.f63395d, bluetoothGattCharacteristic);
    }

    @Override // p000.m6c
    public n74 provideReadDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new n74(this.f63392a, this.f63393b, this.f63395d, bluetoothGattDescriptor);
    }

    @Override // p000.m6c
    public zqd provideRssiReadOperation() {
        return this.f63398g.get();
    }

    @Override // p000.m6c
    public r4f provideServiceDiscoveryOperation(long j, TimeUnit timeUnit) {
        return new r4f(this.f63392a, this.f63393b, this.f63394c, new y1h(j, timeUnit, this.f63397f));
    }

    @Override // p000.m6c
    public qw1 provideWriteCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new qw1(this.f63392a, this.f63393b, this.f63395d, bluetoothGattCharacteristic, bArr);
    }

    @Override // p000.m6c
    public q74 provideWriteDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new q74(this.f63392a, this.f63393b, this.f63395d, 2, bluetoothGattDescriptor, bArr);
    }
}
