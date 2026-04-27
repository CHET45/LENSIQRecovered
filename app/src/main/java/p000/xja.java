package p000;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class xja {

    /* JADX INFO: renamed from: l */
    public static final String f98218l = "MediaPlayerManager";

    /* JADX INFO: renamed from: a */
    public MediaPlayer f98219a;

    /* JADX INFO: renamed from: b */
    public Context f98220b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f98221c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f98222d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f98223e;

    /* JADX INFO: renamed from: f */
    public AtomicBoolean f98224f;

    /* JADX INFO: renamed from: g */
    public final List<byte[]> f98225g;

    /* JADX INFO: renamed from: h */
    public int f98226h;

    /* JADX INFO: renamed from: i */
    public List<File> f98227i;

    /* JADX INFO: renamed from: j */
    public int f98228j;

    /* JADX INFO: renamed from: k */
    public InterfaceC15160d f98229k;

    /* JADX INFO: renamed from: xja$a */
    public class C15157a implements MediaPlayer.OnPreparedListener {
        public C15157a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            xja.this.f98223e.set(true);
            xja.this.f98219a.start();
        }
    }

    /* JADX INFO: renamed from: xja$b */
    public class C15158b implements MediaPlayer.OnCompletionListener {
        public C15158b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            xja.this.onPlayErrorOrComlete();
        }
    }

    /* JADX INFO: renamed from: xja$c */
    public class C15159c implements MediaPlayer.OnErrorListener {
        public C15159c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.e(xja.f98218l, "MediaPlayer error: what=" + i + ", extra=" + i2);
            xja.this.onPlayErrorOrComlete();
            return true;
        }
    }

    /* JADX INFO: renamed from: xja$d */
    public interface InterfaceC15160d {
        void onHistoryPlayComplete();

        void onPlayPause();

        void onPlayResume();

        void onRealTimePlayComplete();
    }

    /* JADX INFO: renamed from: xja$e */
    public static class C15161e {

        /* JADX INFO: renamed from: a */
        public static final xja f98233a = new xja(null);

        private C15161e() {
        }
    }

    public /* synthetic */ xja(C15157a c15157a) {
        this();
    }

    private File createTempFile(byte[] bArr) throws IOException {
        Context context = this.f98220b;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "tmp" + this.f98226h + ".mp3");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            this.f98226h++;
            return file;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static xja getInstance() {
        return C15161e.f98233a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayErrorOrComlete() {
        if (isPlayingRealTime()) {
            if (!this.f98225g.isEmpty()) {
                this.f98225g.remove(0);
            }
            if (!this.f98225g.isEmpty()) {
                play(this.f98225g.get(0));
                return;
            }
            this.f98221c.set(false);
            this.f98223e.set(false);
            this.f98224f.set(false);
            InterfaceC15160d interfaceC15160d = this.f98229k;
            if (interfaceC15160d != null) {
                interfaceC15160d.onRealTimePlayComplete();
                return;
            }
            return;
        }
        if (isPlayingHistory()) {
            int i = this.f98228j + 1;
            this.f98228j = i;
            if (i < this.f98227i.size()) {
                play(this.f98227i.get(this.f98228j).getAbsolutePath());
                return;
            }
            this.f98222d.set(false);
            this.f98223e.set(false);
            this.f98224f.set(false);
            InterfaceC15160d interfaceC15160d2 = this.f98229k;
            if (interfaceC15160d2 != null) {
                interfaceC15160d2.onHistoryPlayComplete();
            }
        }
    }

    private void setupListeners() {
        this.f98219a.setOnPreparedListener(new C15157a());
        this.f98219a.setOnCompletionListener(new C15158b());
        this.f98219a.setOnErrorListener(new C15159c());
    }

    public void addSound(byte[] bArr) {
        if (isPlayInRealTime()) {
            if (bArr != null) {
                this.f98225g.add(bArr);
            }
            if (this.f98223e.get()) {
                return;
            }
            play(bArr);
        }
    }

    public String getHistoryPlayFileName() {
        return this.f98228j < this.f98227i.size() ? this.f98227i.get(this.f98228j).getName() : "";
    }

    public MediaPlayer getMediaPlayer() {
        return this.f98219a;
    }

    public void init() {
        this.f98219a = new MediaPlayer();
        setupListeners();
    }

    public boolean isPaused() {
        return this.f98224f.get();
    }

    public boolean isPlayInRealTime() {
        return this.f98221c.get();
    }

    public boolean isPlayingHistory() {
        return this.f98222d.get();
    }

    public boolean isPlayingRealTime() {
        return this.f98221c.get();
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f98219a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f98219a.pause();
        this.f98224f.set(true);
        InterfaceC15160d interfaceC15160d = this.f98229k;
        if (interfaceC15160d != null) {
            interfaceC15160d.onPlayPause();
        }
    }

    public void play(byte[] bArr) {
        try {
            File fileCreateTempFile = createTempFile(bArr);
            if (fileCreateTempFile == null) {
                return;
            }
            this.f98219a.reset();
            this.f98219a.setDataSource(fileCreateTempFile.getAbsolutePath());
            this.f98219a.prepareAsync();
        } catch (Exception e) {
            Log.e(f98218l, "Error setting data source or preparing media player", e);
        }
    }

    public void playHistory(File[] fileArr) {
        if (fileArr == null || fileArr.length == 0) {
            return;
        }
        this.f98227i.clear();
        this.f98228j = 0;
        this.f98227i.addAll(Arrays.asList(fileArr));
        try {
            stop();
            this.f98222d.set(true);
            this.f98221c.set(false);
            this.f98219a.reset();
            this.f98219a.setDataSource(this.f98227i.get(this.f98228j).getAbsolutePath());
            this.f98219a.prepareAsync();
        } catch (Exception e) {
            Log.e(f98218l, "Error setting data source or preparing media player", e);
        }
    }

    public void playRealTime(byte[] bArr) {
        this.f98222d.set(false);
        this.f98221c.set(true);
        play(bArr);
    }

    public void readyToPlayInRealTime() {
        this.f98221c.set(true);
        this.f98222d.set(false);
    }

    public void release() {
        stopAndClearData();
        MediaPlayer mediaPlayer = this.f98219a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                this.f98219a = null;
            } catch (Exception e) {
                Log.e(f98218l, "release: " + e);
            }
        }
        this.f98221c.set(false);
        this.f98222d.set(false);
        this.f98225g.clear();
        this.f98227i.clear();
    }

    public void resume() {
        MediaPlayer mediaPlayer = this.f98219a;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.f98219a.start();
        this.f98224f.set(false);
        InterfaceC15160d interfaceC15160d = this.f98229k;
        if (interfaceC15160d != null) {
            interfaceC15160d.onPlayResume();
        }
    }

    public void setContext(Context context) {
        if (context != null) {
            this.f98220b = context.getApplicationContext();
        }
    }

    public void setPlayListener(InterfaceC15160d interfaceC15160d) {
        this.f98229k = interfaceC15160d;
    }

    public void setPlayingHistory(boolean z) {
        this.f98222d.set(z);
    }

    public void stop() {
        if (this.f98219a != null) {
            try {
                this.f98223e.set(false);
                this.f98219a.stop();
                this.f98224f.set(false);
            } catch (Exception e) {
                Log.e(f98218l, "stop: " + e);
            }
            this.f98221c.set(false);
            this.f98222d.set(false);
            InterfaceC15160d interfaceC15160d = this.f98229k;
            if (interfaceC15160d != null) {
                interfaceC15160d.onRealTimePlayComplete();
                this.f98229k.onHistoryPlayComplete();
            }
        }
    }

    public void stopAndClearData() {
        this.f98225g.clear();
        this.f98226h = 0;
        stop();
    }

    private xja() {
        this.f98221c = new AtomicBoolean(false);
        this.f98222d = new AtomicBoolean(false);
        this.f98223e = new AtomicBoolean(false);
        this.f98224f = new AtomicBoolean(false);
        this.f98225g = Collections.synchronizedList(new ArrayList());
        this.f98226h = 0;
        this.f98227i = new ArrayList();
    }

    public void play(String str) {
        try {
            this.f98219a.reset();
            this.f98219a.setDataSource(str);
            this.f98219a.prepareAsync();
        } catch (Exception e) {
            Log.e(f98218l, "Error setting data source or preparing media player", e);
        }
    }
}
