package p000;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dv3 implements hk5 {

    /* JADX INFO: renamed from: o */
    public static final int[] f30934o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p */
    public static final C4959a f30935p = new C4959a(new C4959a.a() { // from class: yu3
        @Override // p000.dv3.C4959a.a
        public final Constructor getConstructor() {
            return dv3.getFlacExtractorConstructor();
        }
    });

    /* JADX INFO: renamed from: q */
    public static final C4959a f30936q = new C4959a(new C4959a.a() { // from class: av3
        @Override // p000.dv3.C4959a.a
        public final Constructor getConstructor() {
            return dv3.getMidiExtractorConstructor();
        }
    });

    /* JADX INFO: renamed from: b */
    public boolean f30937b;

    /* JADX INFO: renamed from: c */
    public boolean f30938c;

    /* JADX INFO: renamed from: d */
    public int f30939d;

    /* JADX INFO: renamed from: e */
    public int f30940e;

    /* JADX INFO: renamed from: f */
    public int f30941f;

    /* JADX INFO: renamed from: g */
    public int f30942g;

    /* JADX INFO: renamed from: h */
    public int f30943h;

    /* JADX INFO: renamed from: i */
    public int f30944i;

    /* JADX INFO: renamed from: j */
    public int f30945j;

    /* JADX INFO: renamed from: l */
    public int f30947l;

    /* JADX INFO: renamed from: m */
    @hib
    public kx7<kq6> f30948m;

    /* JADX INFO: renamed from: k */
    public int f30946k = 1;

    /* JADX INFO: renamed from: n */
    public int f30949n = 112800;

    /* JADX INFO: renamed from: dv3$a */
    public static final class C4959a {

        /* JADX INFO: renamed from: a */
        public final a f30950a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f30951b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        @xc7("extensionLoaded")
        @hib
        public Constructor<? extends yj5> f30952c;

        /* JADX INFO: renamed from: dv3$a$a */
        public interface a {
            @hib
            Constructor<? extends yj5> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public C4959a(a aVar) {
            this.f30950a = aVar;
        }

        @hib
        private Constructor<? extends yj5> maybeLoadExtractorConstructor() {
            synchronized (this.f30951b) {
                if (this.f30951b.get()) {
                    return this.f30952c;
                }
                try {
                    return this.f30950a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f30951b.set(true);
                    return this.f30952c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }

        @hib
        public yj5 getExtractor(Object... objArr) {
            Constructor<? extends yj5> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }
    }

    private void addExtractorsForFileType(int i, List<yj5> list) {
        switch (i) {
            case 0:
                list.add(new C9699n5());
                break;
            case 1:
                list.add(new C13868v5());
                break;
            case 2:
                list.add(new C9880ni((this.f30938c ? 2 : 0) | this.f30939d | (this.f30937b ? 1 : 0)));
                break;
            case 3:
                list.add(new C11562qn((this.f30938c ? 2 : 0) | this.f30940e | (this.f30937b ? 1 : 0)));
                break;
            case 4:
                yj5 extractor = f30935p.getExtractor(Integer.valueOf(this.f30941f));
                if (extractor == null) {
                    list.add(new v26(this.f30941f));
                } else {
                    list.add(extractor);
                }
                break;
            case 5:
                list.add(new jm6());
                break;
            case 6:
                list.add(new g4a(this.f30942g));
                break;
            case 7:
                list.add(new s0b((this.f30938c ? 2 : 0) | this.f30945j | (this.f30937b ? 1 : 0)));
                break;
            case 8:
                list.add(new cv6(this.f30944i));
                list.add(new f1b(this.f30943h));
                break;
            case 9:
                list.add(new uzb());
                break;
            case 10:
                list.add(new djd());
                break;
            case 11:
                if (this.f30948m == null) {
                    this.f30948m = kx7.m15110of();
                }
                list.add(new bkh(this.f30946k, new g2h(0L), new m24(this.f30947l, this.f30948m), this.f30949n));
                break;
            case 12:
                list.add(new phi());
                break;
            case 14:
                list.add(new zj8());
                break;
            case 15:
                yj5 extractor2 = f30936q.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new wm0());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public static Constructor<? extends yj5> getFlacExtractorConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(yj5.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends yj5> getMidiExtractorConstructor() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(yj5.class).getConstructor(null);
    }

    @Override // p000.hk5
    public synchronized yj5[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @op1
    public synchronized dv3 setAdtsExtractorFlags(int i) {
        this.f30939d = i;
        return this;
    }

    @op1
    public synchronized dv3 setAmrExtractorFlags(int i) {
        this.f30940e = i;
        return this;
    }

    @op1
    public synchronized dv3 setConstantBitrateSeekingAlwaysEnabled(boolean z) {
        this.f30938c = z;
        return this;
    }

    @op1
    public synchronized dv3 setConstantBitrateSeekingEnabled(boolean z) {
        this.f30937b = z;
        return this;
    }

    @op1
    public synchronized dv3 setFlacExtractorFlags(int i) {
        this.f30941f = i;
        return this;
    }

    @op1
    public synchronized dv3 setFragmentedMp4ExtractorFlags(int i) {
        this.f30944i = i;
        return this;
    }

    @op1
    public synchronized dv3 setMatroskaExtractorFlags(int i) {
        this.f30942g = i;
        return this;
    }

    @op1
    public synchronized dv3 setMp3ExtractorFlags(int i) {
        this.f30945j = i;
        return this;
    }

    @op1
    public synchronized dv3 setMp4ExtractorFlags(int i) {
        this.f30943h = i;
        return this;
    }

    @op1
    public synchronized dv3 setTsExtractorFlags(int i) {
        this.f30947l = i;
        return this;
    }

    @op1
    public synchronized dv3 setTsExtractorMode(int i) {
        this.f30946k = i;
        return this;
    }

    @op1
    public synchronized dv3 setTsExtractorTimestampSearchBytes(int i) {
        this.f30949n = i;
        return this;
    }

    @op1
    public synchronized dv3 setTsSubtitleFormats(List<kq6> list) {
        this.f30948m = kx7.copyOf((Collection) list);
        return this;
    }

    @Override // p000.hk5
    public synchronized yj5[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f30934o;
            arrayList = new ArrayList(iArr.length);
            int iInferFileTypeFromResponseHeaders = ot5.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = ot5.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i : iArr) {
                if (i != iInferFileTypeFromResponseHeaders && i != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (yj5[]) arrayList.toArray(new yj5[arrayList.size()]);
    }
}
