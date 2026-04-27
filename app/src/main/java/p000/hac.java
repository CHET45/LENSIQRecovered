package p000;

import com.eyevue.common.bean.FileListParser;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface hac {

    /* JADX INFO: renamed from: hac$a */
    public interface InterfaceC6766a extends jt0<InterfaceC6767b> {
        void requestData();
    }

    /* JADX INFO: renamed from: hac$b */
    public interface InterfaceC6767b extends wu0 {
        void onDataFail(String msg);

        void onDataSuccess(String fileName);
    }

    /* JADX INFO: renamed from: hac$c */
    public interface InterfaceC6768c extends jt0<InterfaceC6769d> {
        void requestData(String fileName);
    }

    /* JADX INFO: renamed from: hac$d */
    public interface InterfaceC6769d extends wu0 {
        void onDeleteFail(String msg);

        void onDeleteSuccess(String fileName);
    }

    /* JADX INFO: renamed from: hac$e */
    public interface InterfaceC6770e extends jt0<InterfaceC6771f> {
        void requestData();
    }

    /* JADX INFO: renamed from: hac$f */
    public interface InterfaceC6771f extends wu0 {
        void onGetDataFail(String msg);

        void onGetDataSuccess(List<FileListParser.FileItem> fileItems);
    }

    /* JADX INFO: renamed from: hac$g */
    public interface InterfaceC6772g extends jt0<InterfaceC6773h> {
        void requestData();
    }

    /* JADX INFO: renamed from: hac$h */
    public interface InterfaceC6773h extends wu0 {
        void onTimeFail(String msg);

        void onTimeSuccess(String fileName);
    }

    /* JADX INFO: renamed from: hac$i */
    public interface InterfaceC6774i extends jt0<InterfaceC6775j> {
        void requestData();
    }

    /* JADX INFO: renamed from: hac$j */
    public interface InterfaceC6775j extends wu0 {
        void onLiveFail(String msg);

        void onLiveSuccess();
    }
}
