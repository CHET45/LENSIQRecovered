package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class vs5<Data> implements vwa<File, Data> {

    /* JADX INFO: renamed from: b */
    public static final String f92136b = "FileLoader";

    /* JADX INFO: renamed from: a */
    public final InterfaceC14245d<Data> f92137a;

    /* JADX INFO: renamed from: vs5$a */
    public static class C14242a<Data> implements wwa<File, Data> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC14245d<Data> f92138a;

        public C14242a(InterfaceC14245d<Data> interfaceC14245d) {
            this.f92138a = interfaceC14245d;
        }

        @Override // p000.wwa
        @efb
        public final vwa<File, Data> build(@efb t2b t2bVar) {
            return new vs5(this.f92138a);
        }

        @Override // p000.wwa
        public final void teardown() {
        }
    }

    /* JADX INFO: renamed from: vs5$b */
    public static class C14243b extends C14242a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: vs5$b$a */
        public class a implements InterfaceC14245d<ParcelFileDescriptor> {
            @Override // p000.vs5.InterfaceC14245d
            public Class<ParcelFileDescriptor> getDataClass() {
                return ParcelFileDescriptor.class;
            }

            @Override // p000.vs5.InterfaceC14245d
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.vs5.InterfaceC14245d
            public ParcelFileDescriptor open(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C14243b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: vs5$c */
    public static final class C14244c<Data> implements bg3<Data> {

        /* JADX INFO: renamed from: a */
        public final File f92139a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC14245d<Data> f92140b;

        /* JADX INFO: renamed from: c */
        public Data f92141c;

        public C14244c(File file, InterfaceC14245d<Data> interfaceC14245d) {
            this.f92139a = file;
            this.f92140b = interfaceC14245d;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
            Data data = this.f92141c;
            if (data != null) {
                try {
                    this.f92140b.close(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // p000.bg3
        @efb
        public Class<Data> getDataClass() {
            return this.f92140b.getDataClass();
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super Data> interfaceC1883a) {
            try {
                Data dataOpen = this.f92140b.open(this.f92139a);
                this.f92141c = dataOpen;
                interfaceC1883a.onDataReady(dataOpen);
            } catch (FileNotFoundException e) {
                Log.isLoggable(vs5.f92136b, 3);
                interfaceC1883a.onLoadFailed(e);
            }
        }
    }

    /* JADX INFO: renamed from: vs5$d */
    public interface InterfaceC14245d<Data> {
        void close(Data data) throws IOException;

        Class<Data> getDataClass();

        Data open(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: vs5$e */
    public static class C14246e extends C14242a<InputStream> {

        /* JADX INFO: renamed from: vs5$e$a */
        public class a implements InterfaceC14245d<InputStream> {
            @Override // p000.vs5.InterfaceC14245d
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            @Override // p000.vs5.InterfaceC14245d
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.vs5.InterfaceC14245d
            public InputStream open(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C14246e() {
            super(new a());
        }
    }

    public vs5(InterfaceC14245d<Data> interfaceC14245d) {
        this.f92137a = interfaceC14245d;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb File file, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(file), new C14244c(file, this.f92137a));
    }

    @Override // p000.vwa
    public boolean handles(@efb File file) {
        return true;
    }
}
