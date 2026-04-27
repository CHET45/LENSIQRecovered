package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C1213a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.dy7;
import p000.kx7;
import p000.ox7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class hd0 {

    /* JADX INFO: renamed from: c */
    @fdi
    public static final int f43163c = 10;

    /* JADX INFO: renamed from: d */
    @fdi
    public static final int f43164d = 48000;

    /* JADX INFO: renamed from: e */
    public static final hd0 f43165e = new hd0(kx7.m15111of(C6806e.f43172d));

    /* JADX INFO: renamed from: f */
    @igg({"InlinedApi"})
    public static final kx7<Integer> f43166f = kx7.m15113of(2, 5, 6);

    /* JADX INFO: renamed from: g */
    @fdi
    public static final ox7<Integer, Integer> f43167g = new ox7.C10705d().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* JADX INFO: renamed from: h */
    public static final String f43168h = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: i */
    public static final String f43169i = "use_external_surround_sound_flag";

    /* JADX INFO: renamed from: a */
    public final SparseArray<C6806e> f43170a;

    /* JADX INFO: renamed from: b */
    public final int f43171b;

    /* JADX INFO: renamed from: hd0$b */
    @c5e(23)
    public static final class C6803b {
        private C6803b() {
        }

        private static dy7<Integer> getAllBluetoothDeviceTypes() {
            dy7.C5007a c5007aAdd = new dy7.C5007a().add((Object[]) new Integer[]{8, 7});
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                c5007aAdd.add((Object[]) new Integer[]{26, 27});
            }
            if (i >= 33) {
                c5007aAdd.add(30);
            }
            return c5007aAdd.build();
        }

        public static boolean isBluetoothConnected(AudioManager audioManager, @hib vd0 vd0Var) {
            AudioDeviceInfo[] devices = vd0Var == null ? ((AudioManager) v80.checkNotNull(audioManager)).getDevices(2) : new AudioDeviceInfo[]{vd0Var.f90707a};
            dy7<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: hd0$c */
    @c5e(29)
    public static final class C6804c {
        private C6804c() {
        }

        public static kx7<Integer> getDirectPlaybackSupportedEncodings(uc0 uc0Var) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            quh<Integer> it = hd0.f43167g.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (Build.VERSION.SDK_INT >= t0i.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), uc0Var.getAudioAttributesV21().f87481a)) {
                    c8541aBuilder.add(next);
                }
            }
            c8541aBuilder.add(2);
            return c8541aBuilder.build();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2, uc0 uc0Var) {
            for (int i3 = 10; i3 > 0; i3--) {
                int audioTrackChannelConfig = t0i.getAudioTrackChannelConfig(i3);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(audioTrackChannelConfig).build(), uc0Var.getAudioAttributesV21().f87481a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: hd0$d */
    @c5e(33)
    public static final class C6805d {
        private C6805d() {
        }

        public static hd0 getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, uc0 uc0Var) {
            return new hd0(hd0.getAudioProfiles(audioManager.getDirectProfilesForAttributes(uc0Var.getAudioAttributesV21().f87481a)));
        }

        @hib
        public static vd0 getDefaultRoutedDeviceForAttributes(AudioManager audioManager, uc0 uc0Var) {
            List audioDevicesForAttributes = ((AudioManager) v80.checkNotNull(audioManager)).getAudioDevicesForAttributes(uc0Var.getAudioAttributesV21().f87481a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new vd0((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        }
    }

    @igg({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: b */
    public static hd0 m12315b(Context context, uc0 uc0Var, @hib vd0 vd0Var) {
        return m12316c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), uc0Var, vd0Var);
    }

    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: c */
    public static hd0 m12316c(Context context, @hib Intent intent, uc0 uc0Var, @hib vd0 vd0Var) {
        AudioManager audioManager = he0.getAudioManager(context);
        if (vd0Var == null) {
            vd0Var = Build.VERSION.SDK_INT >= 33 ? C6805d.getDefaultRoutedDeviceForAttributes(audioManager, uc0Var) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (t0i.isTv(context) || t0i.isAutomotive(context))) {
            return C6805d.getCapabilitiesInternalForDirectPlayback(audioManager, uc0Var);
        }
        if (C6803b.isBluetoothConnected(audioManager, vd0Var)) {
            return f43165e;
        }
        dy7.C5007a c5007a = new dy7.C5007a();
        c5007a.add(2);
        if (i >= 29 && (t0i.isTv(context) || t0i.isAutomotive(context))) {
            c5007a.addAll((Iterable) C6804c.getDirectPlaybackSupportedEncodings(uc0Var));
            return new hd0(getAudioProfiles(rd8.toArray(c5007a.build()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, f43169i, 0) == 1;
        if ((z || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c5007a.addAll((Iterable) f43166f);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new hd0(getAudioProfiles(rd8.toArray(c5007a.build()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c5007a.addAll((Iterable) rd8.asList(intArrayExtra));
        }
        return new hd0(getAudioProfiles(rd8.toArray(c5007a.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    @hib
    /* JADX INFO: renamed from: d */
    public static Uri m12317d() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @c5e(33)
    @igg({"WrongConstant"})
    public static kx7<C6806e> getAudioProfiles(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(rd8.asList(12)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfileM9077a = dd0.m9077a(list.get(i));
            if (audioProfileM9077a.getEncapsulationType() != 1) {
                int format = audioProfileM9077a.getFormat();
                if (t0i.isEncodingLinearPcm(format) || f43167g.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) v80.checkNotNull((Set) map.get(Integer.valueOf(format)))).addAll(rd8.asList(audioProfileM9077a.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(rd8.asList(audioProfileM9077a.getChannelMasks())));
                    }
                }
            }
        }
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (Map.Entry entry : map.entrySet()) {
            c8541aBuilder.add(new C6806e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return c8541aBuilder.build();
    }

    @Deprecated
    public static hd0 getCapabilities(Context context) {
        return getCapabilities(context, uc0.f87467h, null);
    }

    private static int getChannelConfigForPassthrough(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        return t0i.getAudioTrackChannelConfig(i);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd0)) {
            return false;
        }
        hd0 hd0Var = (hd0) obj;
        return t0i.contentEquals(this.f43170a, hd0Var.f43170a) && this.f43171b == hd0Var.f43171b;
    }

    @hib
    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(C1213a c1213a) {
        return getEncodingAndChannelConfigForPassthrough(c1213a, uc0.f87467h);
    }

    public int getMaxChannelCount() {
        return this.f43171b;
    }

    public int hashCode() {
        return this.f43171b + (t0i.contentHashCode(this.f43170a) * 31);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(C1213a c1213a) {
        return isPassthroughPlaybackSupported(c1213a, uc0.f87467h);
    }

    public boolean supportsEncoding(int i) {
        return t0i.contains(this.f43170a, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f43171b + ", audioProfiles=" + this.f43170a + "]";
    }

    @Deprecated
    public hd0(@hib int[] iArr, int i) {
        this(getAudioProfiles(iArr, i));
    }

    public static hd0 getCapabilities(Context context, uc0 uc0Var, @hib AudioDeviceInfo audioDeviceInfo) {
        return m12315b(context, uc0Var, audioDeviceInfo != null ? new vd0(audioDeviceInfo) : null);
    }

    @hib
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(C1213a c1213a, uc0 uc0Var) {
        int encoding = rva.getEncoding((String) v80.checkNotNull(c1213a.f8291o), c1213a.f8287k);
        if (!f43167g.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        C6806e c6806e = (C6806e) v80.checkNotNull(this.f43170a.get(encoding));
        int maxSupportedChannelCountForPassthrough = c1213a.f8266G;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i = c1213a.f8267H;
            if (i == -1) {
                i = 48000;
            }
            maxSupportedChannelCountForPassthrough = c6806e.getMaxSupportedChannelCountForPassthrough(i, uc0Var);
        } else if (!c1213a.f8291o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c6806e.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(C1213a c1213a, uc0 uc0Var) {
        return getEncodingAndChannelConfigForPassthrough(c1213a, uc0Var) != null;
    }

    private hd0(List<C6806e> list) {
        this.f43170a = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            C6806e c6806e = list.get(i);
            this.f43170a.put(c6806e.f43173a, c6806e);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f43170a.size(); i2++) {
            iMax = Math.max(iMax, this.f43170a.valueAt(i2).f43174b);
        }
        this.f43171b = iMax;
    }

    /* JADX INFO: renamed from: hd0$e */
    public static final class C6806e {

        /* JADX INFO: renamed from: d */
        public static final C6806e f43172d;

        /* JADX INFO: renamed from: a */
        public final int f43173a;

        /* JADX INFO: renamed from: b */
        public final int f43174b;

        /* JADX INFO: renamed from: c */
        @hib
        public final dy7<Integer> f43175c;

        static {
            f43172d = Build.VERSION.SDK_INT >= 33 ? new C6806e(2, getAllChannelMasksForMaxChannelCount(10)) : new C6806e(2, 10);
        }

        @c5e(33)
        public C6806e(int i, Set<Integer> set) {
            this.f43173a = i;
            dy7<Integer> dy7VarCopyOf = dy7.copyOf((Collection) set);
            this.f43175c = dy7VarCopyOf;
            quh<Integer> it = dy7VarCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f43174b = iMax;
        }

        private static dy7<Integer> getAllChannelMasksForMaxChannelCount(int i) {
            dy7.C5007a c5007a = new dy7.C5007a();
            for (int i2 = 1; i2 <= i; i2++) {
                c5007a.add(Integer.valueOf(t0i.getAudioTrackChannelConfig(i2)));
            }
            return c5007a.build();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6806e)) {
                return false;
            }
            C6806e c6806e = (C6806e) obj;
            return this.f43173a == c6806e.f43173a && this.f43174b == c6806e.f43174b && Objects.equals(this.f43175c, c6806e.f43175c);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i, uc0 uc0Var) {
            return this.f43175c != null ? this.f43174b : Build.VERSION.SDK_INT >= 29 ? C6804c.getMaxSupportedChannelCountForPassthrough(this.f43173a, i, uc0Var) : ((Integer) v80.checkNotNull(hd0.f43167g.getOrDefault(Integer.valueOf(this.f43173a), 0))).intValue();
        }

        public int hashCode() {
            int i = ((this.f43173a * 31) + this.f43174b) * 31;
            dy7<Integer> dy7Var = this.f43175c;
            return i + (dy7Var == null ? 0 : dy7Var.hashCode());
        }

        public boolean supportsChannelCount(int i) {
            if (this.f43175c == null) {
                return i <= this.f43174b;
            }
            int audioTrackChannelConfig = t0i.getAudioTrackChannelConfig(i);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.f43175c.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.f43173a + ", maxChannelCount=" + this.f43174b + ", channelMasks=" + this.f43175c + "]";
        }

        public C6806e(int i, int i2) {
            this.f43173a = i;
            this.f43174b = i2;
            this.f43175c = null;
        }
    }

    private static kx7<C6806e> getAudioProfiles(@hib int[] iArr, int i) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            c8541aBuilder.add(new C6806e(i2, i));
        }
        return c8541aBuilder.build();
    }
}
