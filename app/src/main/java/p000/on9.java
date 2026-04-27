package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
public class on9 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, zo9<bn9>> f68179a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final byte[] f68180b = {BuiltinOptions.UniqueOptions, 75, 3, 4};

    private on9() {
    }

    private static zo9<bn9> cache(@hib final String str, Callable<xo9<bn9>> callable) {
        final bn9 bn9Var = str == null ? null : cn9.getInstance().get(str);
        if (bn9Var != null) {
            return new zo9<>(new Callable() { // from class: ln9
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return on9.lambda$cache$8(bn9Var);
                }
            });
        }
        if (str != null) {
            Map<String, zo9<bn9>> map = f68179a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        zo9<bn9> zo9Var = new zo9<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            zo9Var.addListener(new oo9() { // from class: mn9
                @Override // p000.oo9
                public final void onResult(Object obj) {
                    on9.lambda$cache$9(str, atomicBoolean, (bn9) obj);
                }
            });
            zo9Var.addFailureListener(new oo9() { // from class: nn9
                @Override // p000.oo9
                public final void onResult(Object obj) {
                    on9.lambda$cache$10(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f68179a.put(str, zo9Var);
            }
        }
        return zo9Var;
    }

    public static void clearCache(Context context) {
        f68179a.clear();
        cn9.getInstance().clear();
        bt8.networkCache(context).clear();
    }

    @hib
    private static jo9 findImageAssetForFileName(bn9 bn9Var, String str) {
        for (jo9 jo9Var : bn9Var.getImages().values()) {
            if (jo9Var.getFileName().equals(str)) {
                return jo9Var;
            }
        }
        return null;
    }

    public static zo9<bn9> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    @xqi
    public static xo9<bn9> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static zo9<bn9> fromJson(final JSONObject jSONObject, @hib final String str) {
        return cache(str, new Callable() { // from class: hn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromJsonSync(jSONObject, str);
            }
        });
    }

    public static zo9<bn9> fromJsonInputStream(final InputStream inputStream, @hib final String str) {
        return cache(str, new Callable() { // from class: gn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromJsonInputStreamSync(inputStream, str);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromJsonInputStreamSync(InputStream inputStream, @hib String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static zo9<bn9> fromJsonReader(final jm8 jm8Var, @hib final String str) {
        return cache(str, new Callable() { // from class: jn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromJsonReaderSync(jm8Var, str);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromJsonReaderSync(jm8 jm8Var, @hib String str) {
        return fromJsonReaderSyncInternal(jm8Var, str, true);
    }

    private static xo9<bn9> fromJsonReaderSyncInternal(jm8 jm8Var, @hib String str, boolean z) {
        try {
            try {
                bn9 bn9Var = pn9.parse(jm8Var);
                if (str != null) {
                    cn9.getInstance().put(str, bn9Var);
                }
                xo9<bn9> xo9Var = new xo9<>(bn9Var);
                if (z) {
                    e1i.closeQuietly(jm8Var);
                }
                return xo9Var;
            } catch (Exception e) {
                xo9<bn9> xo9Var2 = new xo9<>(e);
                if (z) {
                    e1i.closeQuietly(jm8Var);
                }
                return xo9Var2;
            }
        } catch (Throwable th) {
            if (z) {
                e1i.closeQuietly(jm8Var);
            }
            throw th;
        }
    }

    public static zo9<bn9> fromJsonString(final String str, @hib final String str2) {
        return cache(str2, new Callable() { // from class: in9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromJsonStringSync(str, str2);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromJsonStringSync(String str, @hib String str2) {
        return fromJsonReaderSync(jm8.m14174of(Okio.buffer(Okio.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @xqi
    @Deprecated
    public static xo9<bn9> fromJsonSync(JSONObject jSONObject, @hib String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static zo9<bn9> fromRawRes(Context context, @wpd int i) {
        return fromRawRes(context, i, rawResCacheKey(context, i));
    }

    @xqi
    public static xo9<bn9> fromRawResSync(Context context, @wpd int i) {
        return fromRawResSync(context, i, rawResCacheKey(context, i));
    }

    public static zo9<bn9> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    @xqi
    public static xo9<bn9> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static zo9<bn9> fromZipStream(final ZipInputStream zipInputStream, @hib final String str) {
        return cache(str, new Callable() { // from class: fn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromZipStreamSync(zipInputStream, str);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromZipStreamSync(ZipInputStream zipInputStream, @hib String str) {
        try {
            return fromZipStreamSyncInternal(zipInputStream, str);
        } finally {
            e1i.closeQuietly(zipInputStream);
        }
    }

    @xqi
    private static xo9<bn9> fromZipStreamSyncInternal(ZipInputStream zipInputStream, @hib String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            bn9 value = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    value = fromJsonReaderSyncInternal(jm8.m14174of(Okio.buffer(Okio.source(zipInputStream))), null, false).getValue();
                } else if (name.contains(".png") || name.contains(nt5.f65618g0) || name.contains(".jpg") || name.contains(".jpeg")) {
                    map.put(name.split(pj4.f71071b)[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (value == null) {
                return new xo9<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                jo9 jo9VarFindImageAssetForFileName = findImageAssetForFileName(value, (String) entry.getKey());
                if (jo9VarFindImageAssetForFileName != null) {
                    jo9VarFindImageAssetForFileName.setBitmap(e1i.resizeBitmapIfNeeded((Bitmap) entry.getValue(), jo9VarFindImageAssetForFileName.getWidth(), jo9VarFindImageAssetForFileName.getHeight()));
                }
            }
            for (Map.Entry<String, jo9> entry2 : value.getImages().entrySet()) {
                if (entry2.getValue().getBitmap() == null) {
                    return new xo9<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().getFileName()));
                }
            }
            if (str != null) {
                cn9.getInstance().put(str, value);
            }
            return new xo9<>(value);
        } catch (IOException e) {
            return new xo9<>((Throwable) e);
        }
    }

    private static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean isZipCompressed(BufferedSource bufferedSource) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b : f68180b) {
                if (bufferedSourcePeek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            dj9.error("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$10(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f68179a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xo9 lambda$cache$8(bn9 bn9Var) throws Exception {
        return new xo9(bn9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cache$9(String str, AtomicBoolean atomicBoolean, bn9 bn9Var) {
        f68179a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xo9 lambda$fromRawRes$2(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xo9 lambda$fromUrl$0(Context context, String str, String str2) throws Exception {
        xo9<bn9> xo9VarFetchSync = bt8.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && xo9VarFetchSync.getValue() != null) {
            cn9.getInstance().put(str2, xo9VarFetchSync.getValue());
        }
        return xo9VarFetchSync;
    }

    private static String rawResCacheKey(Context context, @wpd int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(isNightMode(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static void setMaxCacheSize(int i) {
        cn9.getInstance().resize(i);
    }

    @xqi
    private static xo9<bn9> fromJsonInputStreamSync(InputStream inputStream, @hib String str, boolean z) {
        try {
            return fromJsonReaderSync(jm8.m14174of(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                e1i.closeQuietly(inputStream);
            }
        }
    }

    public static zo9<bn9> fromRawRes(Context context, @wpd final int i, @hib final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cache(str, new Callable() { // from class: en9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.lambda$fromRawRes$2(weakReference, applicationContext, i, str);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromRawResSync(Context context, @wpd int i, @hib String str) {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            return isZipCompressed(bufferedSourceBuffer).booleanValue() ? fromZipStreamSync(new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : fromJsonInputStreamSync(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new xo9<>((Throwable) e);
        }
    }

    public static zo9<bn9> fromUrl(final Context context, final String str, @hib final String str2) {
        return cache(str2, new Callable() { // from class: dn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.lambda$fromUrl$0(context, str, str2);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromUrlSync(Context context, String str, @hib String str2) {
        xo9<bn9> xo9VarFetchSync = bt8.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && xo9VarFetchSync.getValue() != null) {
            cn9.getInstance().put(str2, xo9VarFetchSync.getValue());
        }
        return xo9VarFetchSync;
    }

    public static zo9<bn9> fromAsset(Context context, final String str, @hib final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return cache(str2, new Callable() { // from class: kn9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return on9.fromAssetSync(applicationContext, str, str2);
            }
        });
    }

    @xqi
    public static xo9<bn9> fromAssetSync(Context context, String str, @hib String str2) {
        try {
            if (!str.endsWith(zyb.f106510h) && !str.endsWith(".lottie")) {
                return fromJsonInputStreamSync(context.getAssets().open(str), str2);
            }
            return fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new xo9<>((Throwable) e);
        }
    }
}
