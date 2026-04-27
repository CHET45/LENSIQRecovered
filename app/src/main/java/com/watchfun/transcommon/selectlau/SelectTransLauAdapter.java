package com.watchfun.transcommon.selectlau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.databinding.SelectTransListItemBinding;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.List;
import p000.efb;
import p000.igg;

/* JADX INFO: loaded from: classes6.dex */
public class SelectTransLauAdapter extends RecyclerView.Adapter<LanguageViewHolder> {
    private static final String TAG = "SelectTransLauAdapter";
    private final Context mContext;
    private List<TransLanguageData> mLanguage;
    OnItemClickListener mOnItemClickListener;
    private String mText;
    private int mType;

    public static class LanguageViewHolder extends RecyclerView.ViewHolder {
        SelectTransListItemBinding binding;

        public LanguageViewHolder(SelectTransListItemBinding selectTransListItemBinding) {
            super(selectTransListItemBinding.getRoot());
            this.binding = selectTransListItemBinding;
        }
    }

    public interface OnItemClickListener {
        void click(int i, TransLanguageData transLanguageData);
    }

    public SelectTransLauAdapter(Context context) {
        this.mContext = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mLanguage.size();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<TransLanguageData> list, String str, int i) {
        this.mLanguage = list;
        this.mText = str;
        this.mType = i;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb LanguageViewHolder languageViewHolder, final int i) {
        try {
            SelectTransListItemBinding selectTransListItemBinding = languageViewHolder.binding;
            final TransLanguageData transLanguageData = this.mLanguage.get(i);
            selectTransListItemBinding.title.setText(AiLangUtil.getValue(this.mContext, transLanguageData.getKeyName()));
            selectTransListItemBinding.defaultName.setText(transLanguageData.getDefaultName());
            if (this.mText.equals(AiLangUtil.getValue(this.mContext, transLanguageData.getKeyName()))) {
                selectTransListItemBinding.checkbox.setBackgroundResource(C4201R.drawable.ic_checked);
            } else {
                selectTransListItemBinding.checkbox.setBackgroundResource(C4201R.drawable.ic_unchecked);
            }
            languageViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.watchfun.transcommon.selectlau.SelectTransLauAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SelectTransLauAdapter.this.mOnItemClickListener.click(i, transLanguageData);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public LanguageViewHolder onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return new LanguageViewHolder(SelectTransListItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
