package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class mp9 implements e41 {

    /* JADX INFO: renamed from: k */
    public static final String f61688k = "LruBitmapPool";

    /* JADX INFO: renamed from: l */
    public static final Bitmap.Config f61689l = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public final zp9 f61690a;

    /* JADX INFO: renamed from: b */
    public final Set<Bitmap.Config> f61691b;

    /* JADX INFO: renamed from: c */
    public final long f61692c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9453a f61693d;

    /* JADX INFO: renamed from: e */
    public long f61694e;

    /* JADX INFO: renamed from: f */
    public long f61695f;

    /* JADX INFO: renamed from: g */
    public int f61696g;

    /* JADX INFO: renamed from: h */
    public int f61697h;

    /* JADX INFO: renamed from: i */
    public int f61698i;

    /* JADX INFO: renamed from: j */
    public int f61699j;

    /* JADX INFO: renamed from: mp9$a */
    public interface InterfaceC9453a {
        void add(Bitmap bitmap);

        void remove(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: mp9$b */
    public static final class C9454b implements InterfaceC9453a {
        @Override // p000.mp9.InterfaceC9453a
        public void add(Bitmap bitmap) {
        }

        @Override // p000.mp9.InterfaceC9453a
        public void remove(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: mp9$c */
    public static class C9455c implements InterfaceC9453a {

        /* JADX INFO: renamed from: a */
        public final Set<Bitmap> f61700a = Collections.synchronizedSet(new HashSet());

        private C9455c() {
        }

        @Override // p000.mp9.InterfaceC9453a
        public void add(Bitmap bitmap) {
            if (!this.f61700a.contains(bitmap)) {
                this.f61700a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // p000.mp9.InterfaceC9453a
        public void remove(Bitmap bitmap) {
            if (!this.f61700a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f61700a.remove(bitmap);
        }
    }

    public mp9(long j, zp9 zp9Var, Set<Bitmap.Config> set) {
        this.f61692c = j;
        this.f61694e = j;
        this.f61690a = zp9Var;
        this.f61691b = set;
        this.f61693d = new C9454b();
    }

    @omg(26)
    private static void assertNotHardwareConfig(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    @efb
    private static Bitmap createBitmap(int i, int i2, @hib Bitmap.Config config) {
        if (config == null) {
            config = f61689l;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void dump() {
        if (Log.isLoggable(f61688k, 2)) {
            dumpUnchecked();
        }
    }

    private void dumpUnchecked() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f61696g);
        sb.append(", misses=");
        sb.append(this.f61697h);
        sb.append(", puts=");
        sb.append(this.f61698i);
        sb.append(", evictions=");
        sb.append(this.f61699j);
        sb.append(", currentSize=");
        sb.append(this.f61695f);
        sb.append(", maxSize=");
        sb.append(this.f61694e);
        sb.append("\nStrategy=");
        sb.append(this.f61690a);
    }

    private void evict() {
        trimToSize(this.f61694e);
    }

    @omg(26)
    private static Set<Bitmap.Config> getDefaultAllowedConfigs() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static zp9 getDefaultStrategy() {
        return new bqf();
    }

    @hib
    private synchronized Bitmap getDirtyOrNull(int i, int i2, @hib Bitmap.Config config) {
        Bitmap bitmap;
        try {
            assertNotHardwareConfig(config);
            bitmap = this.f61690a.get(i, i2, config != null ? config : f61689l);
            if (bitmap == null) {
                if (Log.isLoggable(f61688k, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.f61690a.logBitmap(i, i2, config));
                }
                this.f61697h++;
            } else {
                this.f61696g++;
                this.f61695f -= (long) this.f61690a.getSize(bitmap);
                this.f61693d.remove(bitmap);
                normalize(bitmap);
            }
            if (Log.isLoggable(f61688k, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.f61690a.logBitmap(i, i2, config));
            }
            dump();
        } catch (Throwable th) {
            throw th;
        }
        return bitmap;
    }

    @omg(19)
    private static void maybeSetPreMultiplied(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void normalize(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        maybeSetPreMultiplied(bitmap);
    }

    private synchronized void trimToSize(long j) {
        while (this.f61695f > j) {
            try {
                Bitmap bitmapRemoveLast = this.f61690a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable(f61688k, 5)) {
                        Log.w(f61688k, "Size mismatch, resetting");
                        dumpUnchecked();
                    }
                    this.f61695f = 0L;
                    return;
                }
                this.f61693d.remove(bitmapRemoveLast);
                this.f61695f -= (long) this.f61690a.getSize(bitmapRemoveLast);
                this.f61699j++;
                if (Log.isLoggable(f61688k, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.f61690a.logBitmap(bitmapRemoveLast));
                }
                dump();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.e41
    public void clearMemory() {
        Log.isLoggable(f61688k, 3);
        trimToSize(0L);
    }

    public long evictionCount() {
        return this.f61699j;
    }

    @Override // p000.e41
    @efb
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull == null) {
            return createBitmap(i, i2, config);
        }
        dirtyOrNull.eraseColor(0);
        return dirtyOrNull;
    }

    public long getCurrentSize() {
        return this.f61695f;
    }

    @Override // p000.e41
    @efb
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        return dirtyOrNull == null ? createBitmap(i, i2, config) : dirtyOrNull;
    }

    @Override // p000.e41
    public long getMaxSize() {
        return this.f61694e;
    }

    public long hitCount() {
        return this.f61696g;
    }

    public long missCount() {
        return this.f61697h;
    }

    @Override // p000.e41
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f61690a.getSize(bitmap) <= this.f61694e && this.f61691b.contains(bitmap.getConfig())) {
                int size = this.f61690a.getSize(bitmap);
                this.f61690a.put(bitmap);
                this.f61693d.add(bitmap);
                this.f61698i++;
                this.f61695f += (long) size;
                if (Log.isLoggable(f61688k, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.f61690a.logBitmap(bitmap));
                }
                dump();
                evict();
                return;
            }
            if (Log.isLoggable(f61688k, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f61690a.logBitmap(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f61691b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.e41
    public synchronized void setSizeMultiplier(float f) {
        this.f61694e = Math.round(this.f61692c * f);
        evict();
    }

    @Override // p000.e41
    @igg({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable(f61688k, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40 || i >= 20) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }

    public mp9(long j) {
        this(j, getDefaultStrategy(), getDefaultAllowedConfigs());
    }

    public mp9(long j, Set<Bitmap.Config> set) {
        this(j, getDefaultStrategy(), set);
    }
}
