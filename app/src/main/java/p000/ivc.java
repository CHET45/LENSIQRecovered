package p000;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1158q;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.FileListParser;
import com.eyevue.common.bean.PhotoBean;
import com.eyevue.glassapp.bluetooth.manager.ModBleResponse;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import com.eyevue.glassapp.helper.WifiApConnector;
import com.eyevue.glassapp.helper.WifiP2pConnector;
import com.eyevue.glassapp.utils.AudioConverter;
import com.eyevue.glassapp.utils.PhotoUtils;
import com.eyevue.glassapp.utils.photo.FileUtils;
import com.eyevue.glassapp.utils.photo.VideoDurationLoader;
import com.watchfun.base.BaseApplication;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import com.watchfun.voicenotes.database.VoiceNotesDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import p000.cn4;
import p000.hac;
import p000.ma9;

/* JADX INFO: loaded from: classes4.dex */
public class ivc extends cai implements hac.InterfaceC6771f, hac.InterfaceC6769d, hac.InterfaceC6773h, hac.InterfaceC6767b {

    /* JADX INFO: renamed from: g2 */
    public static final String f48567g2 = "PhotoViewModel";

    /* JADX INFO: renamed from: C */
    public final o5b<Boolean> f48568C;

    /* JADX INFO: renamed from: F */
    public final VideoDurationLoader f48569F;

    /* JADX INFO: renamed from: H */
    public final WifiApConnector f48570H;

    /* JADX INFO: renamed from: L */
    public List<FileListParser.FileItem> f48571L;

    /* JADX INFO: renamed from: M */
    public int f48572M;

    /* JADX INFO: renamed from: M1 */
    public i94 f48573M1;

    /* JADX INFO: renamed from: N */
    public int f48574N;

    /* JADX INFO: renamed from: Q */
    public int f48575Q;

    /* JADX INFO: renamed from: V1 */
    public e94 f48576V1;

    /* JADX INFO: renamed from: X */
    public int f48577X;

    /* JADX INFO: renamed from: Y */
    public h94 f48578Y;

    /* JADX INFO: renamed from: Z */
    public f94 f48579Z;

    /* JADX INFO: renamed from: Z1 */
    public cn4 f48580Z1;

    /* JADX INFO: renamed from: a */
    public final WifiP2pConnector f48581a;

    /* JADX INFO: renamed from: a2 */
    public double f48582a2;

    /* JADX INFO: renamed from: b */
    public final o5b<ArrayList<Uri>> f48583b;

    /* JADX INFO: renamed from: b2 */
    public long f48584b2;

    /* JADX INFO: renamed from: c */
    public final o5b<Set<Uri>> f48585c;

    /* JADX INFO: renamed from: c2 */
    public HashMap<String, String> f48586c2;

    /* JADX INFO: renamed from: d */
    public final o5b<Boolean> f48587d;

    /* JADX INFO: renamed from: d2 */
    public cn4 f48588d2;

    /* JADX INFO: renamed from: e */
    public final o5b<Boolean> f48589e;

    /* JADX INFO: renamed from: e2 */
    public long f48590e2;

    /* JADX INFO: renamed from: f */
    public final o5b<Integer> f48591f;

    /* JADX INFO: renamed from: f2 */
    public boolean f48592f2;

    /* JADX INFO: renamed from: m */
    public final o5b<Boolean> f48593m;

    /* JADX INFO: renamed from: ivc$a */
    public class C7633a implements WifiApConnector.WifiApCallback {
        public C7633a() {
        }

        @Override // com.eyevue.glassapp.helper.WifiApConnector.WifiApCallback
        public void onApWifiConnected() {
            C2473f.m4168e(ivc.f48567g2, "AP-WiFi连接成功");
            ivc.this.f48578Y.requestData();
            ivc.this.f48568C.postValue(Boolean.TRUE);
        }

        @Override // com.eyevue.glassapp.helper.WifiApConnector.WifiApCallback
        public void onError(String message) {
            C2473f.m4168e(ivc.f48567g2, "WiFi连接失败: " + message);
            ivc.this.f48568C.postValue(Boolean.FALSE);
            ivc.this.cancelReceivePhoto();
        }
    }

    /* JADX INFO: renamed from: ivc$b */
    public class C7634b implements WifiP2pConnector.WifiDirectCallback {
        public C7634b() {
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onDirectWifiConnected() {
            C2473f.m4168e(ivc.f48567g2, "WiFi连接成功");
            ivc.this.f48576V1.requestData();
            ivc.this.f48573M1.requestData();
            ivc.this.f48578Y.requestData();
            ivc.this.f48568C.postValue(Boolean.TRUE);
        }

        @Override // com.eyevue.glassapp.helper.WifiP2pConnector.WifiDirectCallback
        public void onError(String message) {
            if (message.equals(WifiP2pConnector.HOTSPOT_OPEN)) {
                ToastUtils.showShort(BaseApplication.getInstance().getString(C2531R.string.string_eyevue_import_media_hotspot_tip));
            }
            C2473f.m4168e(ivc.f48567g2, "WiFi连接失败: " + message);
            ivc.this.f48568C.postValue(Boolean.FALSE);
            ivc.this.cancelReceivePhoto();
        }
    }

    /* JADX INFO: renamed from: ivc$c */
    public class C7635c extends xl4 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f48596b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f48597c;

        public C7635c(final String val$savePath, final String val$fileName) {
            this.f48596b = val$savePath;
            this.f48597c = val$fileName;
        }

        @Override // p000.ma9.InterfaceC9236a
        public void connected(@efb cn4 task, int blockCount, long currentOffset, long totalLength) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void progress(@efb cn4 task, long currentOffset, long totalLength) {
            ivc.this.f48582a2 = totalLength;
        }

        @Override // p000.ma9.InterfaceC9236a
        public void retry(@efb cn4 task, @efb c8e cause) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskEnd(@efb cn4 task, @efb x15 cause, @hib Exception realCause, @efb ma9.C9237b model) {
            if (!cause.name().equals("COMPLETED")) {
                boolean zDelete = xt5.delete(this.f48596b);
                StringBuilder sb = new StringBuilder();
                sb.append("下载失败：");
                sb.append(task.getId());
                sb.append(C2473f.f17566z);
                sb.append(task.getUrl());
                sb.append(C2473f.f17566z);
                sb.append(cause.name());
                sb.append(":::");
                sb.append(realCause == null ? "" : realCause.getMessage());
                sb.append(":::删除失败文件:");
                sb.append(zDelete);
                zi9.m26852e(ivc.f48567g2, sb.toString());
                ivc ivcVar = ivc.this;
                ivcVar.f48575Q++;
                ivcVar.startDownLoadThumbnailPhotoByWifi();
                return;
            }
            double dCurrentTimeMillis = (System.currentTimeMillis() - ivc.this.f48584b2) / 1000.0d;
            double d = ivc.this.f48582a2 / 1048576.0d;
            if (dCurrentTimeMillis == 0.0d) {
                dCurrentTimeMillis = 1.0d;
            }
            boolean zMove = xt5.move(this.f48596b, FileUtils.getMediaDirectory(BaseApplication.getInstance()).getAbsolutePath() + pj4.f71071b + this.f48597c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("下载完成，下载速度：");
            sb2.append(d / dCurrentTimeMillis);
            sb2.append("m/s   时间:");
            sb2.append(dCurrentTimeMillis);
            sb2.append("s   文件大小:");
            ivc ivcVar2 = ivc.this;
            sb2.append(ivcVar2.formatRemainingSize((long) ivcVar2.f48582a2));
            sb2.append("    移动文件：");
            sb2.append(zMove);
            zi9.m26852e(ivc.f48567g2, sb2.toString());
            ivc ivcVar3 = ivc.this;
            ivcVar3.f48575Q++;
            ivcVar3.startDownLoadThumbnailPhotoByWifi();
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskStart(@efb cn4 task, @efb ma9.C9237b model) {
            C2473f.m4168e(ivc.f48567g2, "开始下载：" + task.getId() + C2473f.f17566z + task.getUrl() + pl8.f71328a + this.f48596b);
            ivc.this.f48584b2 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ivc$d */
    public class C7636d extends xl4 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f48599b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f48600c;

        public C7636d(final String val$savePath, final String val$fileName) {
            this.f48599b = val$savePath;
            this.f48600c = val$fileName;
        }

        @Override // p000.ma9.InterfaceC9236a
        public void connected(@efb cn4 task, int blockCount, long currentOffset, long totalLength) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void progress(@efb cn4 task, long currentOffset, long totalLength) {
            ivc.this.f48582a2 = totalLength;
            int progressPercentage = ivc.this.getProgressPercentage(currentOffset, totalLength);
            hfa hfaVar = new hfa();
            hfaVar.f43368a = progressPercentage;
            hfaVar.f43369b = this.f48600c;
            zgb.defaultCenter().publish(hfaVar);
        }

        @Override // p000.ma9.InterfaceC9236a
        public void retry(@efb cn4 task, @efb c8e cause) {
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskEnd(@efb cn4 task, @efb x15 cause, @hib Exception realCause, @efb ma9.C9237b model) {
            String absolutePath = FileUtils.getMediaDirectory(BaseApplication.getInstance()).getAbsolutePath();
            if (!cause.name().equals("COMPLETED")) {
                hfa hfaVar = new hfa();
                hfaVar.f43368a = -1;
                hfaVar.f43369b = this.f48600c;
                zgb.defaultCenter().publish(hfaVar);
                boolean zDelete = xt5.delete(this.f48599b);
                xt5.delete(absolutePath + "/Thumbnail" + this.f48600c);
                StringBuilder sb = new StringBuilder();
                sb.append("下载失败：");
                sb.append(task.getId());
                sb.append(C2473f.f17566z);
                sb.append(task.getUrl());
                sb.append(C2473f.f17566z);
                sb.append(cause.name());
                sb.append(":::");
                sb.append(realCause == null ? "" : realCause.getMessage());
                sb.append(":::删除失败文件:");
                sb.append(zDelete);
                zi9.m26852e(ivc.f48567g2, sb.toString());
                ivc ivcVar = ivc.this;
                ivcVar.f48574N++;
                ivcVar.startDownLoadPhotoByWifi();
                return;
            }
            double dCurrentTimeMillis = (System.currentTimeMillis() - ivc.this.f48584b2) / 1000.0d;
            double d = ivc.this.f48582a2 / 1048576.0d;
            if (dCurrentTimeMillis == 0.0d) {
                dCurrentTimeMillis = 1.0d;
            }
            hfa hfaVar2 = new hfa();
            hfaVar2.f43368a = 100;
            hfaVar2.f43369b = this.f48600c;
            zgb.defaultCenter().publish(hfaVar2);
            ivc.this.f48579Z.requestData(((FileListParser.FileItem) ivc.this.f48571L.get(ivc.this.f48574N)).getName());
            String str = absolutePath + pj4.f71071b + this.f48600c;
            boolean zMove = xt5.move(this.f48599b, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("下载完成，下载速度：");
            sb2.append(d / dCurrentTimeMillis);
            sb2.append("m/s   时间:");
            sb2.append(dCurrentTimeMillis);
            sb2.append("s   文件大小:");
            ivc ivcVar2 = ivc.this;
            sb2.append(ivcVar2.formatRemainingSize((long) ivcVar2.f48582a2));
            sb2.append("    移动文件：");
            sb2.append(zMove);
            sb2.append(",  文件名称:");
            sb2.append(this.f48600c);
            zi9.m26852e(ivc.f48567g2, sb2.toString());
            xt5.delete(absolutePath + "/Thumbnail" + this.f48600c);
            gfa gfaVar = new gfa();
            gfaVar.f39676a = this.f48600c;
            gfaVar.f39677b = str;
            zgb.defaultCenter().publish(gfaVar);
            if ((this.f48600c.toLowerCase().contains(".wav") || this.f48600c.toLowerCase().contains(".aac")) && u77.f86965i) {
                ivc.this.saveMp3ToAiRecord(this.f48600c, str);
            }
            ivc ivcVar3 = ivc.this;
            ivcVar3.f48574N++;
            ivcVar3.f48577X++;
            ivcVar3.startDownLoadPhotoByWifi();
        }

        @Override // p000.ma9.InterfaceC9236a
        public void taskStart(@efb cn4 task, @efb ma9.C9237b model) {
            zi9.m26852e(ivc.f48567g2, "开始下载：" + task.getId() + C2473f.f17566z + task.getUrl() + pl8.f71328a + this.f48599b);
            ivc.this.f48584b2 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ivc$e */
    public class C7637e implements AudioConverter.ConversionCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f48602a;

        /* JADX INFO: renamed from: ivc$e$a */
        public class a implements VideoDurationLoader.DurationCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f48604a;

            public a(final String val$outputMp3Path) {
                this.f48604a = val$outputMp3Path;
            }

            @Override // com.eyevue.glassapp.utils.photo.VideoDurationLoader.DurationCallback
            public void onDurationLoaded(long duration) {
                C2473f.m4168e(ivc.f48567g2, "时长获取成功写入数据库:" + duration);
                VoiceNotesBean voiceNotesBean = new VoiceNotesBean();
                voiceNotesBean.setContent("");
                voiceNotesBean.setCreateTime(System.currentTimeMillis() + "");
                voiceNotesBean.setRecordTime((long) Math.round(((float) duration) / 1000.0f));
                voiceNotesBean.setTitle(C7637e.this.f48602a);
                voiceNotesBean.setRecordPath(this.f48604a);
                VoiceNotesDatabase.getDatabase(BaseApplication.getInstance()).messageDao().saveMeetInfo(voiceNotesBean);
            }
        }

        public C7637e(final String val$fileName) {
            this.f48602a = val$fileName;
        }

        @Override // com.eyevue.glassapp.utils.AudioConverter.ConversionCallback
        public void onFailure(String errorLog) {
        }

        @Override // com.eyevue.glassapp.utils.AudioConverter.ConversionCallback
        public void onSuccess(String outputMp3Path) {
            C2473f.m4168e(ivc.f48567g2, "转码成功：" + outputMp3Path);
            ivc.this.f48569F.loadDuration(outputMp3Path, new a(outputMp3Path));
        }
    }

    public ivc() {
        o5b<ArrayList<Uri>> o5bVar = new o5b<>();
        this.f48583b = o5bVar;
        o5b<Set<Uri>> o5bVar2 = new o5b<>();
        this.f48585c = o5bVar2;
        o5b<Boolean> o5bVar3 = new o5b<>();
        this.f48587d = o5bVar3;
        o5b<Boolean> o5bVar4 = new o5b<>();
        this.f48589e = o5bVar4;
        this.f48591f = new o5b<>();
        o5b<Boolean> o5bVar5 = new o5b<>();
        this.f48593m = o5bVar5;
        this.f48568C = new o5b<>();
        this.f48571L = new ArrayList();
        this.f48586c2 = new HashMap<>();
        this.f48592f2 = false;
        o5bVar.setValue(new ArrayList<>());
        o5bVar2.setValue(new HashSet());
        Boolean bool = Boolean.FALSE;
        o5bVar3.setValue(bool);
        o5bVar4.setValue(bool);
        o5bVar5.setValue(bool);
        this.f48573M1 = new i94(this);
        this.f48576V1 = new e94(this);
        this.f48581a = new WifiP2pConnector(BaseApplication.getInstance());
        this.f48570H = new WifiApConnector(BaseApplication.getInstance());
        this.f48569F = new VideoDurationLoader();
    }

    private String getFileNameWithoutPath(String fullPath) {
        String strSubstring = fullPath.substring(fullPath.lastIndexOf(pj4.f71071b) + 1);
        return TextUtils.isEmpty(strSubstring) ? "" : strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectPhotos$1(Set set, ArrayList arrayList) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Uri uri2 = (Uri) it2.next();
                if (Objects.equals(uri2.getPath(), uri.getPath())) {
                    xt5.getFileName(uri2.getPath());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$setMediaUris$0(PhotoBean photoBean, PhotoBean photoBean2) {
        return photoBean2.getDate().compareTo(photoBean.getDate());
    }

    private void startDownLoad() {
        String str;
        String name = this.f48571L.get(this.f48574N).getName();
        String strTimestampToYmdHms = this.f48586c2.get(name) != null ? this.f48586c2.get(name) : PhotoUtils.timestampToYmdHms(System.currentTimeMillis());
        String absolutePath = FileUtils.getMediaDirectoryTemporary(BaseApplication.getInstance()).getAbsolutePath();
        if (u77.f86970n) {
            str = i00.f45355b0 + name;
            name = getFileNameWithoutPath(name);
        } else {
            str = i00.f45353Z + name;
        }
        String str2 = "DH-" + strTimestampToYmdHms + "-" + name.toLowerCase();
        String str3 = absolutePath + pj4.f71071b + str2;
        cn4 cn4VarBuild = new cn4.C2401a(str, absolutePath, str2).setMinIntervalMillisCallbackProcess(500).setPriority(10).setReadBufferSize(32768).setFlushBufferSize(131072).setSyncBufferSize(131072).setSyncBufferIntervalMillis(200).setConnectionCount(1).setPassIfAlreadyCompleted(true).build();
        this.f48580Z1 = cn4VarBuild;
        cn4VarBuild.enqueue(new C7636d(str3, str2));
    }

    private void startDownLoadThumbnail() {
        String strConvertDateFormat;
        String str;
        String name = this.f48571L.get(this.f48575Q).getName();
        if (u77.f86970n) {
            strConvertDateFormat = PhotoUtils.convertTimeCompat(this.f48571L.get(this.f48575Q).getTime());
            if (TextUtils.isEmpty(strConvertDateFormat)) {
                strConvertDateFormat = PhotoUtils.timestampToYmdHms(System.currentTimeMillis());
            }
        } else {
            strConvertDateFormat = PhotoUtils.convertDateFormat(this.f48571L.get(this.f48575Q).getTime()) != null ? PhotoUtils.convertDateFormat(this.f48571L.get(this.f48575Q).getTime()) : PhotoUtils.timestampToYmdHms(System.currentTimeMillis());
        }
        this.f48586c2.put(name, strConvertDateFormat);
        String absolutePath = FileUtils.getMediaDirectoryTemporary(BaseApplication.getInstance()).getAbsolutePath();
        if (u77.f86970n) {
            str = i00.f45354a0 + name;
            name = getFileNameWithoutPath(name);
        } else {
            str = i00.f45353Z + name + "?custom=1&cmd=4002";
        }
        String str2 = "ThumbnailDH-" + strConvertDateFormat + "-" + name.toLowerCase();
        String str3 = absolutePath + pj4.f71071b + str2;
        if (TextUtils.isEmpty(name) || !(name.toLowerCase().contains(".wav") || name.toLowerCase().contains(".aac"))) {
            cn4 cn4VarBuild = new cn4.C2401a(str, absolutePath, str2).setMinIntervalMillisCallbackProcess(500).setPriority(10).setReadBufferSize(32768).setFlushBufferSize(131072).setSyncBufferSize(131072).setSyncBufferIntervalMillis(200).setConnectionCount(1).setPassIfAlreadyCompleted(true).build();
            this.f48588d2 = cn4VarBuild;
            cn4VarBuild.enqueue(new C7635c(str3, str2));
            return;
        }
        boolean zCreateFileByDeleteOldFile = xt5.createFileByDeleteOldFile(FileUtils.getMediaDirectory(BaseApplication.getInstance()).getAbsolutePath() + pj4.f71071b + str2);
        StringBuilder sb = new StringBuilder();
        sb.append("音频文件跳过下载缩略图,创建空文件作为缩略图效果::");
        sb.append(zCreateFileByDeleteOldFile);
        C2473f.m4168e(f48567g2, sb.toString());
        this.f48575Q++;
        startDownLoadThumbnailPhotoByWifi();
    }

    private void updateAllSelectedState() {
        ArrayList<Uri> value = this.f48583b.getValue();
        Set<Uri> value2 = this.f48585c.getValue();
        this.f48589e.setValue(Boolean.valueOf((value == null || value2 == null || value2.size() != value.size()) ? false : true));
    }

    @Override // p000.wu0
    public void addNetDisposable(mf4 disposable) {
    }

    public void cancelReceivePhoto() {
        deleteAllThumbnail();
        stopP2pWifiConnect();
        this.f48592f2 = true;
        this.f48572M = 0;
        this.f48593m.setValue(Boolean.FALSE);
    }

    public void connectP2pWifitoReceivePhoto() {
        this.f48574N = 0;
        this.f48572M = 0;
        this.f48577X = 0;
        this.f48592f2 = false;
        this.f48593m.setValue(Boolean.TRUE);
        this.f48586c2.clear();
        u77.f86964h = true;
        if (u77.f86970n) {
            this.f48570H.init();
            ModUtils.sendViaBle().getWifiInfo(Command.Param.GET_WIFI_AP);
        } else {
            this.f48581a.init();
            ModUtils.sendViaBle().getWifiInfo(Command.Param.GET_WIFI_P2P);
        }
        this.f48578Y = new h94(this);
        this.f48579Z = new f94(this);
    }

    public void connectWifi(String ssid, String password) {
        if (u77.f86970n) {
            this.f48570H.connectApwifi(ssid, password, new C7633a());
        } else {
            this.f48581a.connectToDirectWifi(ssid, password, new C7634b());
        }
    }

    public void deleteAllThumbnail() {
        for (Uri uri : FileUtils.loadMediaFromDirectory(BaseApplication.getInstance(), 0)) {
            if (uri.getPath().contains("Thumbnail")) {
                xt5.delete(uri.getPath());
            }
        }
    }

    public void deleteSelectPhotos() {
        if (getMediaUrisList() == null || getSelectedUris() == null) {
            return;
        }
        final Set<Uri> selectedUris = getSelectedUris();
        final ArrayList<Uri> mediaUrisList = getMediaUrisList();
        C2478k.getCachedPool().execute(new Runnable() { // from class: gvc
            @Override // java.lang.Runnable
            public final void run() {
                ivc.lambda$deleteSelectPhotos$1(selectedUris, mediaUrisList);
            }
        });
    }

    public void deselectAll() {
        this.f48585c.setValue(new HashSet());
        this.f48589e.setValue(Boolean.FALSE);
    }

    public void enterEditMode() {
        this.f48587d.setValue(Boolean.TRUE);
        deselectAll();
    }

    public void exitEditMode() {
        this.f48587d.setValue(Boolean.FALSE);
        deselectAll();
    }

    public String formatRemainingSize(long remainingBytes) {
        if (remainingBytes < 0) {
            remainingBytes = 0;
        }
        if (remainingBytes >= 1024) {
            return remainingBytes < 1048576 ? String.format("%.1f KB", Double.valueOf(remainingBytes / 1024.0d)) : String.format("%.2f MB", Double.valueOf(remainingBytes / 1048576.0d));
        }
        return remainingBytes + " B";
    }

    public AbstractC1158q<Boolean> getEditModeLiveData() {
        return this.f48587d;
    }

    public AbstractC1158q<Boolean> getIsAllSelectedLiveData() {
        return this.f48589e;
    }

    public o5b<Boolean> getIsImportingLiveData() {
        return this.f48593m;
    }

    public o5b<Boolean> getIsWifiConnectStateLiveData() {
        return this.f48568C;
    }

    public ArrayList<Uri> getMediaUrisList() {
        ArrayList<Uri> value = this.f48583b.getValue();
        return value != null ? new ArrayList<>(value) : new ArrayList<>();
    }

    public AbstractC1158q<ArrayList<Uri>> getMediaUrisLiveData() {
        return this.f48583b;
    }

    @Override // p000.wu0
    public String getPageName() {
        return "";
    }

    public int getProgressPercentage(long currentOffset, long totalLength) {
        if (totalLength <= 0) {
            return 0;
        }
        return (int) Math.min(Math.max(((currentOffset * 100) + (totalLength / 2)) / totalLength, 0L), 100L);
    }

    public int getSelectedCount() {
        Set<Uri> value = this.f48585c.getValue();
        if (value != null) {
            return value.size();
        }
        return 0;
    }

    public Set<Uri> getSelectedUris() {
        Set<Uri> value = this.f48585c.getValue();
        return value != null ? new HashSet(value) : new HashSet();
    }

    public AbstractC1158q<Set<Uri>> getSelectedUrisLiveData() {
        return this.f48585c;
    }

    public o5b<Integer> getUnImportNumLiveData() {
        return this.f48591f;
    }

    public boolean isAllSelected() {
        return this.f48589e.getValue() != null && this.f48589e.getValue().booleanValue();
    }

    public void observeWifiConnectState() {
        ModUtils.modBleResponse().setOnWifiDataListener(new ModBleResponse.OnWifiDataListener() { // from class: hvc
            @Override // com.eyevue.glassapp.bluetooth.manager.ModBleResponse.OnWifiDataListener
            public final void onWifiData(String str, String str2) {
                this.f44965a.connectWifi(str, str2);
            }
        });
    }

    @Override // p000.hac.InterfaceC6767b
    public void onDataFail(String msg) {
    }

    @Override // p000.hac.InterfaceC6767b
    public void onDataSuccess(String fileName) {
    }

    @Override // p000.hac.InterfaceC6769d
    public void onDeleteFail(String msg) {
    }

    @Override // p000.hac.InterfaceC6769d
    public void onDeleteSuccess(String fileName) {
    }

    @Override // p000.hac.InterfaceC6771f
    public void onGetDataFail(String msg) {
        cancelReceivePhoto();
    }

    @Override // p000.hac.InterfaceC6771f
    public void onGetDataSuccess(List<FileListParser.FileItem> fileItems) {
        C2473f.m4168e(f48567g2, "ssss::" + sc7.toJson(fileItems));
        if (fileItems.isEmpty()) {
            this.f48591f.setValue(0);
        } else {
            this.f48571L = fileItems;
            this.f48574N = 0;
            this.f48575Q = 0;
            int size = fileItems.size();
            this.f48572M = size;
            this.f48591f.setValue(Integer.valueOf(size));
        }
        startDownLoadThumbnailPhotoByWifi();
    }

    @Override // p000.hac.InterfaceC6773h
    public void onTimeFail(String msg) {
    }

    @Override // p000.hac.InterfaceC6773h
    public void onTimeSuccess(String fileName) {
    }

    @igg({"RestrictedApi"})
    public void saveMp3ToAiRecord(String name, String filePath) {
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        AudioConverter.convertWavToMp3(filePath, FileUtils.getMediaDirectoryMp3(BaseApplication.getInstance()).getAbsolutePath() + pj4.f71071b + name + ".mp3", new C7637e(name));
    }

    public void selectAll() {
        HashSet hashSet = new HashSet();
        ArrayList<Uri> value = this.f48583b.getValue();
        if (value != null) {
            hashSet.addAll(value);
        }
        this.f48585c.setValue(hashSet);
        this.f48589e.setValue(Boolean.TRUE);
        StringBuilder sb = new StringBuilder();
        sb.append("Selected all media files, count: ");
        sb.append(hashSet.size());
    }

    public void setMediaUris(ArrayList<Uri> mediaUris) {
        ArrayList arrayList = new ArrayList();
        if (mediaUris != null) {
            Iterator<Uri> it = mediaUris.iterator();
            while (it.hasNext()) {
                File file = new File(it.next().getPath());
                Date dateFromFileName = PhotoUtils.parseDateFromFileName(file.getName());
                if (dateFromFileName == null) {
                    dateFromFileName = new Date(file.lastModified());
                }
                arrayList.add(new PhotoBean("ID" + file.getName(), Uri.fromFile(file), file.getName(), dateFromFileName));
            }
        }
        arrayList.sort(new Comparator() { // from class: evc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ivc.lambda$setMediaUris$0((PhotoBean) obj, (PhotoBean) obj2);
            }
        });
        this.f48583b.setValue(new ArrayList<>((List) arrayList.stream().map(new Function() { // from class: fvc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PhotoBean) obj).getUri();
            }
        }).collect(Collectors.toList())));
        StringBuilder sb = new StringBuilder();
        sb.append("Set ");
        sb.append(mediaUris.size());
        sb.append(" media files");
        updateAllSelectedState();
    }

    public void startDownLoadPhotoByWifi() {
        if (this.f48571L.isEmpty()) {
            cancelReceivePhoto();
            return;
        }
        this.f48593m.setValue(Boolean.TRUE);
        if (this.f48574N < this.f48572M) {
            if (this.f48592f2) {
                this.f48592f2 = false;
                return;
            } else {
                startDownLoad();
                return;
            }
        }
        C2473f.m4168e(f48567g2, "传输完成");
        this.f48593m.setValue(Boolean.FALSE);
        if (this.f48592f2) {
            return;
        }
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: dvc
            @Override // java.lang.Runnable
            public final void run() {
                this.f31041a.stopP2pWifiConnect();
            }
        }, 200L);
    }

    public void startDownLoadThumbnailPhotoByWifi() {
        if (this.f48571L.isEmpty()) {
            cancelReceivePhoto();
            return;
        }
        this.f48593m.setValue(Boolean.TRUE);
        if (this.f48575Q < this.f48572M) {
            if (this.f48592f2) {
                this.f48592f2 = false;
                return;
            } else {
                startDownLoadThumbnail();
                return;
            }
        }
        C2473f.m4168e(f48567g2, "缩略图传输完成");
        if (this.f48592f2) {
            return;
        }
        Collections.reverse(this.f48571L);
        startDownLoadPhotoByWifi();
    }

    public void stopP2pWifiConnect() {
        int i;
        int i2 = this.f48577X;
        if (i2 == 0 || (i = this.f48572M) == 0) {
            ModUtils.sendViaBle().fileDownloadFinish(Command.Param.WIFI_FILE_DOWNLOAD_FINISH, Command.Param.WIFI_FILE_DOWNLOAD_NOT_CLEAR);
        } else if (i2 == i) {
            ModUtils.sendViaBle().fileDownloadFinish(Command.Param.WIFI_FILE_DOWNLOAD_FINISH, Command.Param.WIFI_FILE_DOWNLOAD_CLEAR_THUMBNAIL);
        } else {
            ModUtils.sendViaBle().fileDownloadFinish(Command.Param.WIFI_FILE_DOWNLOAD_FINISH_NUN, this.f48577X);
        }
        if (u77.f86970n) {
            WifiApConnector wifiApConnector = this.f48570H;
            if (wifiApConnector != null) {
                wifiApConnector.disconnectAp();
            }
        } else {
            WifiP2pConnector wifiP2pConnector = this.f48581a;
            if (wifiP2pConnector != null) {
                wifiP2pConnector.disconnectP2p();
            }
        }
        u77.f86964h = false;
    }

    public void toggleSelection(Uri uri) {
        Set<Uri> selectedUris = getSelectedUris();
        if (selectedUris.contains(uri)) {
            selectedUris.remove(uri);
        } else {
            selectedUris.add(uri);
        }
        this.f48585c.setValue(selectedUris);
        StringBuilder sb = new StringBuilder();
        sb.append("Toggled selection at uri ");
        sb.append(uri);
        sb.append(", selected count: ");
        sb.append(selectedUris.size());
        updateAllSelectedState();
    }

    public void toggleSelection(Uri uri, boolean isSelect) {
        Set<Uri> selectedUris = getSelectedUris();
        if (isSelect) {
            if (!selectedUris.contains(uri)) {
                selectedUris.add(uri);
            }
        } else if (selectedUris.contains(uri)) {
            selectedUris.remove(uri);
        }
        this.f48585c.setValue(selectedUris);
        StringBuilder sb = new StringBuilder();
        sb.append("Toggled selection at uri ");
        sb.append(uri);
        sb.append(", selected count: ");
        sb.append(selectedUris.size());
        updateAllSelectedState();
    }
}
