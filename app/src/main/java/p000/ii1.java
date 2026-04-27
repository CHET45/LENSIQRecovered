package p000;

import com.bumptech.glide.Priority;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class ii1<Data> implements vwa<byte[], Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7295b<Data> f47068a;

    /* JADX INFO: renamed from: ii1$a */
    public static class C7294a implements wwa<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: ii1$a$a */
        public class a implements InterfaceC7295b<ByteBuffer> {
            public a() {
            }

            @Override // p000.ii1.InterfaceC7295b
            public Class<ByteBuffer> getDataClass() {
                return ByteBuffer.class;
            }

            @Override // p000.ii1.InterfaceC7295b
            public ByteBuffer convert(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p000.wwa
        @efb
        public vwa<byte[], ByteBuffer> build(@efb t2b t2bVar) {
            return new ii1(new a());
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: ii1$b */
    public interface InterfaceC7295b<Data> {
        Data convert(byte[] bArr);

        Class<Data> getDataClass();
    }

    /* JADX INFO: renamed from: ii1$c */
    public static class C7296c<Data> implements bg3<Data> {

        /* JADX INFO: renamed from: a */
        public final byte[] f47070a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7295b<Data> f47071b;

        public C7296c(byte[] bArr, InterfaceC7295b<Data> interfaceC7295b) {
            this.f47070a = bArr;
            this.f47071b = interfaceC7295b;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
        }

        @Override // p000.bg3
        @efb
        public Class<Data> getDataClass() {
            return this.f47071b.getDataClass();
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super Data> interfaceC1883a) {
            interfaceC1883a.onDataReady(this.f47071b.convert(this.f47070a));
        }
    }

    /* JADX INFO: renamed from: ii1$d */
    public static class C7297d implements wwa<byte[], InputStream> {

        /* JADX INFO: renamed from: ii1$d$a */
        public class a implements InterfaceC7295b<InputStream> {
            public a() {
            }

            @Override // p000.ii1.InterfaceC7295b
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ii1.InterfaceC7295b
            public InputStream convert(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p000.wwa
        @efb
        public vwa<byte[], InputStream> build(@efb t2b t2bVar) {
            return new ii1(new a());
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public ii1(InterfaceC7295b<Data> interfaceC7295b) {
        this.f47068a = interfaceC7295b;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb byte[] bArr, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(bArr), new C7296c(bArr, this.f47068a));
    }

    @Override // p000.vwa
    public boolean handles(@efb byte[] bArr) {
        return true;
    }
}
