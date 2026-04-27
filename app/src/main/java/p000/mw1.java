package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.DeadObjectException;
import java.nio.ByteBuffer;
import java.util.UUID;
import p000.a32;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public class mw1 extends xnd<byte[]> {

    /* JADX INFO: renamed from: C */
    public final uee.InterfaceC13522f f62469C;

    /* JADX INFO: renamed from: F */
    public final byte[] f62470F;

    /* JADX INFO: renamed from: H */
    public byte[] f62471H;

    /* JADX INFO: renamed from: a */
    public final BluetoothGatt f62472a;

    /* JADX INFO: renamed from: b */
    public final gfe f62473b;

    /* JADX INFO: renamed from: c */
    public final woe f62474c;

    /* JADX INFO: renamed from: d */
    public final y1h f62475d;

    /* JADX INFO: renamed from: e */
    public final BluetoothGattCharacteristic f62476e;

    /* JADX INFO: renamed from: f */
    public final hlc f62477f;

    /* JADX INFO: renamed from: m */
    public final uee.InterfaceC13521e f62478m;

    /* JADX INFO: renamed from: mw1$a */
    public class C9562a implements InterfaceC9568g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f62479a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f62480b;

        public C9562a(ByteBuffer byteBuffer, int i) {
            this.f62479a = byteBuffer;
            this.f62480b = i;
        }

        @Override // p000.mw1.InterfaceC9568g
        public int get() {
            return ((int) Math.ceil(this.f62479a.position() / this.f62480b)) - 1;
        }
    }

    /* JADX INFO: renamed from: mw1$b */
    public class C9563b implements pxb<qi1<UUID>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ znd f62482a;

        public C9563b(znd zndVar) {
            this.f62482a = zndVar;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f62482a.onNext(mw1.this.f62470F);
            this.f62482a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable th) {
            this.f62482a.onError(th);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 lf4Var) {
        }

        @Override // p000.pxb
        public void onNext(qi1<UUID> qi1Var) {
        }
    }

    /* JADX INFO: renamed from: mw1$c */
    public class C9564c implements csb<qi1<UUID>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vkb f62484a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteBuffer f62485b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f62486c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC9568g f62487d;

        public C9564c(vkb vkbVar, ByteBuffer byteBuffer, int i, InterfaceC9568g interfaceC9568g) {
            this.f62484a = vkbVar;
            this.f62485b = byteBuffer;
            this.f62486c = i;
            this.f62487d = interfaceC9568g;
        }

        @Override // p000.csb
        public void subscribe(lob<qi1<UUID>> lobVar) {
            lobVar.setDisposable((fg4) this.f62484a.subscribeWith(og4.disposableObserverFromEmitter(lobVar)));
            try {
                mw1.this.m17632e(mw1.this.m17631d(this.f62485b, this.f62486c), this.f62487d);
            } catch (Throwable th) {
                lobVar.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: mw1$d */
    public class C9565d implements n8d<qi1<UUID>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BluetoothGattCharacteristic f62489a;

        public C9565d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.f62489a = bluetoothGattCharacteristic;
        }

        @Override // p000.n8d
        public boolean test(qi1<UUID> qi1Var) {
            return qi1Var.f74482a.equals(this.f62489a.getUuid());
        }
    }

    /* JADX INFO: renamed from: mw1$e */
    public class C9566e implements sy6<vkb<?>, wub<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ znd f62490a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteBuffer f62491b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ uee.InterfaceC13521e f62492c;

        /* JADX INFO: renamed from: mw1$e$a */
        public class a implements n8d<Boolean> {
            public a() {
            }

            @Override // p000.n8d
            public boolean test(Boolean bool) {
                return bool.booleanValue();
            }
        }

        /* JADX INFO: renamed from: mw1$e$b */
        public class b implements sy6<Object, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ByteBuffer f62494a;

            public b(ByteBuffer byteBuffer) {
                this.f62494a = byteBuffer;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.sy6
            public Boolean apply(Object obj) {
                return Boolean.valueOf(this.f62494a.hasRemaining());
            }
        }

        /* JADX INFO: renamed from: mw1$e$c */
        public class c implements n8d<Object> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ znd f62496a;

            public c(znd zndVar) {
                this.f62496a = zndVar;
            }

            @Override // p000.n8d
            public boolean test(Object obj) {
                return !this.f62496a.isWrappedEmitterUnsubscribed();
            }
        }

        public C9566e(znd zndVar, ByteBuffer byteBuffer, uee.InterfaceC13521e interfaceC13521e) {
            this.f62490a = zndVar;
            this.f62491b = byteBuffer;
            this.f62492c = interfaceC13521e;
        }

        @efb
        private sy6<Object, Boolean> bufferIsNotEmpty(ByteBuffer byteBuffer) {
            return new b(byteBuffer);
        }

        @efb
        private n8d<Object> notUnsubscribed(znd<byte[]> zndVar) {
            return new c(zndVar);
        }

        @Override // p000.sy6
        public wub<?> apply(vkb<?> vkbVar) {
            return vkbVar.takeWhile(notUnsubscribed(this.f62490a)).map(bufferIsNotEmpty(this.f62491b)).compose(this.f62492c).takeWhile(new a());
        }
    }

    /* JADX INFO: renamed from: mw1$f */
    public class C9567f implements sy6<vkb<Throwable>, wub<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ uee.InterfaceC13522f f62498a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9568g f62499b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f62500c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ByteBuffer f62501d;

        /* JADX INFO: renamed from: mw1$f$a */
        public class a implements sy6<Throwable, vkb<uee.InterfaceC13522f.a>> {
            public a() {
            }

            @Override // p000.sy6
            public vkb<uee.InterfaceC13522f.a> apply(Throwable th) {
                return ((th instanceof f51) || (th instanceof e51)) ? vkb.just(new uee.InterfaceC13522f.a(C9567f.this.f62499b.get(), (h51) th)) : vkb.error(th);
            }
        }

        /* JADX INFO: renamed from: mw1$f$b */
        public class b implements uu2<uee.InterfaceC13522f.a> {
            public b() {
            }

            @Override // p000.uu2
            public void accept(uee.InterfaceC13522f.a aVar) {
                int batchIndex = aVar.getBatchIndex();
                C9567f c9567f = C9567f.this;
                c9567f.f62501d.position(batchIndex * c9567f.f62500c);
            }
        }

        public C9567f(uee.InterfaceC13522f interfaceC13522f, InterfaceC9568g interfaceC9568g, int i, ByteBuffer byteBuffer) {
            this.f62498a = interfaceC13522f;
            this.f62499b = interfaceC9568g;
            this.f62500c = i;
            this.f62501d = byteBuffer;
        }

        @efb
        private uu2<uee.InterfaceC13522f.a> repositionByteBufferForRetry() {
            return new b();
        }

        @efb
        private sy6<Throwable, vkb<uee.InterfaceC13522f.a>> toLongWriteFailureOrError() {
            return new a();
        }

        @Override // p000.sy6
        public wub<?> apply(vkb<Throwable> vkbVar) {
            return vkbVar.flatMap(toLongWriteFailureOrError()).doOnNext(repositionByteBufferForRetry()).compose(this.f62498a);
        }
    }

    /* JADX INFO: renamed from: mw1$g */
    public interface InterfaceC9568g {
        int get();
    }

    public mw1(BluetoothGatt bluetoothGatt, gfe gfeVar, @w8b(a32.C0034g.f249c) woe woeVar, @w8b("operation-timeout") y1h y1hVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, hlc hlcVar, uee.InterfaceC13521e interfaceC13521e, uee.InterfaceC13522f interfaceC13522f, byte[] bArr) {
        this.f62472a = bluetoothGatt;
        this.f62473b = gfeVar;
        this.f62474c = woeVar;
        this.f62475d = y1hVar;
        this.f62476e = bluetoothGattCharacteristic;
        this.f62477f = hlcVar;
        this.f62478m = interfaceC13521e;
        this.f62469C = interfaceC13522f;
        this.f62470F = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static sy6<vkb<?>, wub<?>> m17630c(uee.InterfaceC13521e interfaceC13521e, ByteBuffer byteBuffer, znd<byte[]> zndVar) {
        return new C9566e(zndVar, byteBuffer, interfaceC13521e);
    }

    private static sy6<vkb<Throwable>, wub<?>> errorIsRetryableAndAccordingTo(uee.InterfaceC13522f interfaceC13522f, ByteBuffer byteBuffer, int i, InterfaceC9568g interfaceC9568g) {
        return new C9567f(interfaceC13522f, interfaceC9568g, i, byteBuffer);
    }

    @efb
    private vkb<qi1<UUID>> writeBatchAndObserve(int i, ByteBuffer byteBuffer, InterfaceC9568g interfaceC9568g) {
        return vkb.create(new C9564c(this.f62473b.getOnCharacteristicWrite(), byteBuffer, i, interfaceC9568g));
    }

    private static n8d<qi1<UUID>> writeResponseForMatchingCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new C9565d(bluetoothGattCharacteristic);
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: a */
    public void mo3260a(lob<byte[]> lobVar, ynd yndVar) {
        int payloadSizeLimit = this.f62477f.getPayloadSizeLimit();
        if (payloadSizeLimit <= 0) {
            throw new IllegalArgumentException("batchSizeProvider value must be greater than zero (now: " + payloadSizeLimit + c0b.f15434d);
        }
        vkb vkbVarError = vkb.error(new d51(this.f62472a, i51.f45763f));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f62470F);
        znd zndVar = new znd(lobVar, yndVar);
        C9562a c9562a = new C9562a(byteBufferWrap, payloadSizeLimit);
        vkb<qi1<UUID>> vkbVarTake = writeBatchAndObserve(payloadSizeLimit, byteBufferWrap, c9562a).subscribeOn(this.f62474c).filter(writeResponseForMatchingCharacteristic(this.f62476e)).take(1L);
        y1h y1hVar = this.f62475d;
        vkbVarTake.timeout(y1hVar.f100095a, y1hVar.f100096b, y1hVar.f100097c, vkbVarError).repeatWhen(m17630c(this.f62478m, byteBufferWrap, zndVar)).retryWhen(errorIsRetryableAndAccordingTo(this.f62469C, byteBufferWrap, payloadSizeLimit, c9562a)).subscribe(new C9563b(zndVar));
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: b */
    public c51 mo3261b(DeadObjectException deadObjectException) {
        return new b51(deadObjectException, this.f62472a.getDevice().getAddress(), -1);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m17631d(ByteBuffer byteBuffer, int i) {
        int iMin = Math.min(byteBuffer.remaining(), i);
        byte[] bArr = this.f62471H;
        if (bArr == null || bArr.length != iMin) {
            this.f62471H = new byte[iMin];
        }
        byteBuffer.get(this.f62471H);
        return this.f62471H;
    }

    /* JADX INFO: renamed from: e */
    public void m17632e(byte[] bArr, InterfaceC9568g interfaceC9568g) {
        if (kfe.isAtLeast(3)) {
            kfe.m14722d("Writing batch #%04d: %s", Integer.valueOf(interfaceC9568g.get()), pj9.bytesToHex(bArr));
        }
        this.f62476e.setValue(bArr);
        if (!this.f62472a.writeCharacteristic(this.f62476e)) {
            throw new e51(this.f62472a, i51.f45763f);
        }
    }

    public String toString() {
        return "CharacteristicLongWriteOperation{" + pj9.commonMacMessage(this.f62472a) + ", characteristic=" + pj9.wrap(this.f62476e, false) + ", maxBatchSize=" + this.f62477f.getPayloadSizeLimit() + '}';
    }
}
