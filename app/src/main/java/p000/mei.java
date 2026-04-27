package p000;

import android.util.Log;
import com.watchfun.voicenotes.bean.SaveVoiceNoteReq;
import com.watchfun.voicenotes.bean.SaveVoiceNoteResp;
import com.watchfun.voicenotes.bean.UpdateNoteTitleReq;
import com.watchfun.voicenotes.bean.VoiceNoteLimitTimeResp;
import p000.jei;

/* JADX INFO: loaded from: classes7.dex */
public class mei implements jei.InterfaceC7888a {

    /* JADX INFO: renamed from: a */
    public jei.InterfaceC7889b f60826a;

    /* JADX INFO: renamed from: b */
    public lei f60827b = new lei();

    /* JADX INFO: renamed from: mei$a */
    public class C9340a implements tg3<SaveVoiceNoteResp> {
        public C9340a() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 mf4Var) {
            if (mei.this.f60826a != null) {
                mei.this.f60826a.addNetDisposable(mf4Var);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int i, String str) {
            Log.i("aaaaaaaa", "code =" + i);
            mei.this.f60826a.saveVoiceNoteFail();
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<SaveVoiceNoteResp> hr0Var, boolean z) {
            if (hr0Var != null) {
                if (hr0Var.getData() == null) {
                    mei.this.f60826a.saveVoiceNoteFail();
                } else if (mei.this.f60826a != null) {
                    mei.this.f60826a.saveVoiceNoteSuccess(hr0Var.getData());
                }
            }
        }
    }

    /* JADX INFO: renamed from: mei$b */
    public class C9341b implements tg3<Boolean> {
        public C9341b() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 mf4Var) {
            if (mei.this.f60826a != null) {
                mei.this.f60826a.addNetDisposable(mf4Var);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int i, String str) {
            if (mei.this.f60826a != null) {
                mei.this.f60826a.updateNoteTitleFail();
            }
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<Boolean> hr0Var, boolean z) {
            if (hr0Var != null) {
                if (hr0Var.getCode() == 200) {
                    if (mei.this.f60826a != null) {
                        mei.this.f60826a.updateNoteTitleSuccess();
                    }
                } else if (mei.this.f60826a != null) {
                    mei.this.f60826a.updateNoteTitleFail();
                }
            }
        }
    }

    /* JADX INFO: renamed from: mei$c */
    public class C9342c implements tg3<VoiceNoteLimitTimeResp> {
        public C9342c() {
        }

        @Override // p000.tg3
        public void addNetDisposable(mf4 mf4Var) {
            if (mei.this.f60826a != null) {
                mei.this.f60826a.addNetDisposable(mf4Var);
            }
        }

        @Override // p000.tg3
        public void onLoadError(int i, String str) {
            Log.i("aaaaaaaa", "code =" + i);
            mei.this.f60826a.queryVoiceNodeLimitFail();
        }

        @Override // p000.tg3
        public void onLoadSuccess(hr0<VoiceNoteLimitTimeResp> hr0Var, boolean z) {
            if (hr0Var != null) {
                VoiceNoteLimitTimeResp data = hr0Var.getData();
                if (data == null) {
                    mei.this.f60826a.queryVoiceNodeLimitFail();
                } else if (mei.this.f60826a != null) {
                    mei.this.f60826a.queryVoiceNodeLimitTimeSuccess(data.isLimitTimeStatus(), data.getTotalDuration(), data.getRemainingDuration());
                }
            }
        }
    }

    public mei(jei.InterfaceC7889b interfaceC7889b) {
        this.f60826a = interfaceC7889b;
    }

    @Override // p000.jei.InterfaceC7888a
    public void queryVoiceNodeLimitTime() {
        this.f60827b.queryVoiceNodeLimitTime(new C9342c());
    }

    @Override // p000.jei.InterfaceC7888a
    public void saveVoiceNote(SaveVoiceNoteReq saveVoiceNoteReq) {
        this.f60827b.saveVoiceNote(saveVoiceNoteReq, new C9340a());
    }

    @Override // p000.jei.InterfaceC7888a
    public void updateNoteTitle(UpdateNoteTitleReq updateNoteTitleReq) {
        this.f60827b.updateNoteTitle(updateNoteTitleReq, new C9341b());
    }
}
