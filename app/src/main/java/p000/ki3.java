package p000;

import android.util.Base64;
import com.bumptech.glide.Priority;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public final class ki3<Model, Data> implements vwa<Model, Data> {

    /* JADX INFO: renamed from: b */
    public static final String f54182b = "data:image";

    /* JADX INFO: renamed from: c */
    public static final String f54183c = ";base64";

    /* JADX INFO: renamed from: a */
    public final InterfaceC8373a<Data> f54184a;

    /* JADX INFO: renamed from: ki3$a */
    public interface InterfaceC8373a<Data> {
        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;

        Class<Data> getDataClass();
    }

    /* JADX INFO: renamed from: ki3$b */
    public static final class C8374b<Data> implements bg3<Data> {

        /* JADX INFO: renamed from: a */
        public final String f54185a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8373a<Data> f54186b;

        /* JADX INFO: renamed from: c */
        public Data f54187c;

        public C8374b(String str, InterfaceC8373a<Data> interfaceC8373a) {
            this.f54185a = str;
            this.f54186b = interfaceC8373a;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
            try {
                this.f54186b.close(this.f54187c);
            } catch (IOException unused) {
            }
        }

        @Override // p000.bg3
        @efb
        public Class<Data> getDataClass() {
            return this.f54186b.getDataClass();
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super Data> interfaceC1883a) {
            try {
                Data dataDecode = this.f54186b.decode(this.f54185a);
                this.f54187c = dataDecode;
                interfaceC1883a.onDataReady(dataDecode);
            } catch (IllegalArgumentException e) {
                interfaceC1883a.onLoadFailed(e);
            }
        }
    }

    /* JADX INFO: renamed from: ki3$c */
    public static final class C8375c<Model> implements wwa<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8373a<InputStream> f54188a = new a();

        /* JADX INFO: renamed from: ki3$c$a */
        public class a implements InterfaceC8373a<InputStream> {
            public a() {
            }

            @Override // p000.ki3.InterfaceC8373a
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            @Override // p000.ki3.InterfaceC8373a
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ki3.InterfaceC8373a
            public InputStream decode(String str) {
                if (!str.startsWith(ki3.f54182b)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(ki3.f54183c)) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p000.wwa
        @efb
        public vwa<Model, InputStream> build(@efb t2b t2bVar) {
            return new ki3(this.f54188a);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public ki3(InterfaceC8373a<Data> interfaceC8373a) {
        this.f54184a = interfaceC8373a;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Model model, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(model), new C8374b(model.toString(), this.f54184a));
    }

    @Override // p000.vwa
    public boolean handles(@efb Model model) {
        return model.toString().startsWith(f54182b);
    }
}
