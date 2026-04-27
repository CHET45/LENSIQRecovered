package p000;

import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.bean.FileListParser;
import com.eyevue.common.bean.PhotoApBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p000.hac;

/* JADX INFO: loaded from: classes4.dex */
public class h94 implements hac.InterfaceC6770e {

    /* JADX INFO: renamed from: c */
    public static final String f42947c = "DevicePhotoListPresenter";

    /* JADX INFO: renamed from: a */
    public final hac.InterfaceC6771f f42948a;

    /* JADX INFO: renamed from: b */
    public final g94 f42949b = new g94();

    /* JADX INFO: renamed from: h94$a */
    public class C6757a implements cli {
        public C6757a() {
        }

        @Override // p000.cli
        public void addNetDisposable(mf4 disposable) {
            if (h94.this.f42948a != null) {
                h94.this.f42948a.addNetDisposable(disposable);
            }
        }

        @Override // p000.cli
        public void onLoadError(String var2) {
            if (h94.this.f42948a != null) {
                h94.this.f42948a.onGetDataFail("");
            }
            C2473f.m4168e(h94.f42947c, "getDevicePhotoList onLoadError: " + var2);
        }

        @Override // p000.cli
        public void onLoadSuccess(String result) {
            List<FileListParser.FileItem> arrayList = new ArrayList<>();
            if (u77.f86970n) {
                Iterator<PhotoApBean.InfoDTO> it = ((PhotoApBean) sc7.fromJson(result, PhotoApBean.class)).getInfo().iterator();
                while (it.hasNext()) {
                    for (PhotoApBean.InfoDTO.FilesDTO filesDTO : it.next().getFiles()) {
                        arrayList.add(new FileListParser.FileItem(filesDTO.getName(), filesDTO.getName(), filesDTO.getSize().intValue(), Long.parseLong(filesDTO.getCreatetimestr()), h94.extractNumberFromPath(filesDTO.getName())));
                    }
                }
                C2473f.m4168e(h94.f42947c, "ap数据::::" + result);
            } else {
                try {
                    arrayList = FileListParser.parseXml(result);
                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                }
            }
            if (h94.this.f42948a != null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    h94.this.f42948a.onGetDataFail("");
                } else {
                    h94.this.f42948a.onGetDataSuccess(arrayList);
                }
            }
        }
    }

    public h94(hac.InterfaceC6771f devicePhotoListView) {
        this.f42948a = devicePhotoListView;
    }

    public static String extractNumberFromPath(String fullPath) {
        if (fullPath == null || fullPath.isEmpty()) {
            return "";
        }
        int iLastIndexOf = fullPath.lastIndexOf(pj4.f71071b);
        if (iLastIndexOf != -1) {
            fullPath = fullPath.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = fullPath.lastIndexOf(".");
        return iLastIndexOf2 == -1 ? fullPath : fullPath.substring(0, iLastIndexOf2);
    }

    private void loadData() {
        this.f42949b.getDevicePhotoList(new C6757a());
    }

    @Override // p000.hac.InterfaceC6770e
    public void requestData() {
        loadData();
    }
}
