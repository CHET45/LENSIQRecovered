package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.watchfun.voicenotes.C4297R;
import com.watchfun.voicenotes.database.VoiceNotesBean;

/* JADX INFO: loaded from: classes7.dex */
public class bqa extends mt0<VoiceNotesBean, BaseViewHolder> {

    /* JADX INFO: renamed from: bqa$a */
    public interface InterfaceC2001a {
        void onDel(int i);

        void onEdit(int i);
    }

    public bqa(int i) {
        super(i);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo2536c(@efb BaseViewHolder baseViewHolder, VoiceNotesBean voiceNotesBean) {
        TextView textView = (TextView) baseViewHolder.getView(C4297R.id.tv_date);
        TextView textView2 = (TextView) baseViewHolder.getView(C4297R.id.tv_duration);
        TextView textView3 = (TextView) baseViewHolder.getView(C4297R.id.tv_content);
        TextView textView4 = (TextView) baseViewHolder.getView(C4297R.id.tv_title);
        if (TextUtils.isEmpty(voiceNotesBean.getTitle())) {
            textView4.setText("");
        } else {
            textView4.setText(voiceNotesBean.getTitle());
        }
        if (TextUtils.isEmpty(voiceNotesBean.getContent())) {
            textView3.setText(m17549g().getString(C4297R.string.string_empty_content));
        } else {
            textView3.setText(voiceNotesBean.getContent());
        }
        if (TextUtils.isEmpty(voiceNotesBean.getCreateTime())) {
            return;
        }
        textView.setText(a1h.getCollectTime(Long.parseLong(voiceNotesBean.getCreateTime())));
        textView2.setText(a1h.secondsToHMS(voiceNotesBean.getRecordTime()));
    }
}
